package Problema_Artesao_Automatizado;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import ilog.concert.IloLinearNumExpr;





public class main2 {

public static void main(String[] args) {
	///*
	//Caminho para as informações 
	String caminho = "C:/Users/Felipe.DESKTOP-SD9EH44/Desktop/Prog/zMeus Programas/1MQ Maximização simples/Artesao.txt";
	//Ler aequivo
	String textoread = LerArquivo.Read(caminho);
	if(textoread.isEmpty()) {
		System.out.println("Erro ao ler o arquivo");
	}else {
		System.out.println(textoread);
	}
	
	
	//Ler quantidade de variáveis;
	String texto1 = textoread.split(";")[1];
	int nv = Integer.parseInt(texto1);	
		
	//Ler quantidade de restrições;
	String texto2 = textoread.split(";")[3];
	int nr = Integer.parseInt(texto2);	
	
	//System.out.println(nr);	
	//System.out.println(nv);
	
	double[] r = new double[nv];
	double[][] res = new double[nr][nv];
	double[] rhs = new double[nr];
	
	//Lucro
		for (int i = 0; i < nv; i++) {
			r[i] = Double.parseDouble(textoread.split(";")[(5 + i)]);
			//System.out.print(r[i] + "\n");
		} // */
	
	//Restrições
		for (int i = 0; i < nr; i++) {
			for (int j = 0; j < nv; j++) {
				//System.out.print("Qual é o valor do x " + (j + 1) + " da restrição " + (i + 1) + " - ");
				res[i][j] = Double.parseDouble(textoread.split(";")[(6 + nv*(i+1) + j)]);
				//System.out.print(res[i][j] + "  \n");
			}
		}
		
		for (int i = 0; i < nr; i++) {
			rhs[i] = Double.parseDouble(textoread.split(";")[(7+i+(nv*nr)+nv)]);
			//System.out.print(rhs[i] + "\n");
		} // */
		
		
	
	
	solverCplex2.solveModel(nv, nr, r, res, rhs);

		//System.out.print("ok \n");
		
	

		/*
		
		}*/
		
		
		
	}
	
	
	
}
