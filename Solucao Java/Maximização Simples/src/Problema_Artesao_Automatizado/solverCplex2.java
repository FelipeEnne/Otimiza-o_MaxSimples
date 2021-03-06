package Problema_Artesao_Automatizado;

import ilog.concert.IloException;
import ilog.concert.IloLinearNumExpr;
import ilog.concert.IloNumVar;
import ilog.cplex.IloCplex;

public class solverCplex2 {

	
	public double fo;
	
	/*Declarando 
	 * n n�mero de vari�veis 2
	 * m n�mero de restri��o 3
	 * 
	 * r receita das vari�veis 5 3
	 * 
	 * res restri��es
	 * 
	 * rhs RHS
	 * 
	 * */
	public static void solveModel(int nv, int nr, double[] r, double[][] res, double[] rhs) {
		
		///*
		String arq = "Resposta.txt";
		
		String texto = "Resposta:  \r\n";
		
		if(LerArquivo.Write(arq,texto)) {
			System.out.println("Arquivo Salvo");
		}else {
			System.out.println("Erro");
		}
		//*/
		try {
			//Iniciando o Modelo
			IloCplex model = new IloCplex();				
			
			//Vari�veis de decis�o
			IloNumVar[] x = new IloNumVar[nv];
			// Para cada x atribui o valor
			for (int i = 0; i < nv; i++) {
				//x 1 arg maior que 0 e 2 arg m�ximo valor
				x[i] = model.numVar(0, Double.MAX_VALUE);
			}
			
			//Fun��o Objetivo 
			IloLinearNumExpr obj = model.linearNumExpr();
			for (int i = 0; i < nv; i++) {
				//x 1 arg receita e 2 arg vari�vel 
				obj.addTerm(r[i], x[i]);
			}
			//Modelo - Maximizar
			model.addMaximize(obj);
			
			//Restri��es
			for (int i = 0; i < nr; i++) {
				IloLinearNumExpr constraint = model.linearNumExpr();
				for (int j = 0; j < nv; j++) {
					constraint.addTerm(res[i][j], x[j]);
				}
				//>= Ge <= Le
				model.addLe(constraint, rhs[i]);
			}
			
			
			//Print Solu��o
			boolean isSolved = model.solve();
			if(isSolved) {
				double objValue = model.getObjValue();
							System.out.println("Valor objetivo: "+ objValue);
							LerArquivo.Write(arq,String.valueOf(objValue));
				for (int i = 0; i < nv; i++) {
					System.out.println("x["+ (i+1) + "] = " + model.getValue(x[i]));
				}
				
			}else {
				System.out.println("O modelo n�o resolveu");
			}
			
			
		}catch(IloException ex) {
			ex.printStackTrace();
		}
		
		
	
		}
	
	
	



	}



