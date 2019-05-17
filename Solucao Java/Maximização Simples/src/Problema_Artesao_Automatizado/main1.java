package Problema_Artesao_Automatizado;

import java.util.Scanner;

import ilog.concert.IloLinearNumExpr;





public class main1 {

public static void main(String[] args) {
		
		
		//Variáveis
		System.out.print("Número de Variáveis? \n");
		Scanner nvs = new Scanner(System.in);
		int nvi = nvs.nextInt();
		//Restrições
		System.out.print("Número de Restrições? \n");
		Scanner nrs = new Scanner(System.in);
		int nri = nrs.nextInt();
		
		double[] ri = new double[nvi];
		double[][] resi = new double[nri][nvi];
		double[] rhsi = new double[nri];
		
				
		for (int i = 0; i < nvi; i++) {
			//Lucro
			System.out.print("Qual é o lucro do x " + (i+1) + " ?\n");
			Scanner rs = new Scanner(System.in);
			ri[i] = rs.nextDouble();
		}
		
		
		//Restrições
		for (int i = 0; i < nri; i++) {
			System.out.print("Restrição " + (i+1) + " \n");

			for (int j = 0; j < nvi; j++) {
				System.out.print("Qual é o valor do x " + (j+1) + " da restrição " + (i+1) + " \n");
				Scanner ress = new Scanner(System.in);
				resi[i][j] = ress.nextDouble();
			}
			System.out.print("Qual é o valor do rhs " +  (i+1) + " ? \n");
			Scanner rhss = new Scanner(System.in);
			rhsi[i] = rhss.nextDouble();
		}
		
		
		
		System.out.print("ok \n");
		
		/*
		int nv = 2;
		int nr = 3;
		//
		double[] r= {8,5};
		double[][] res = {{1,0},{0,1},{1.5,0.8333333}};
		double[] rhs = {4,6,8};
		
		solverCplex.solveModel(nv, nr, r, res, rhs);
		//*/
		solverCplex.solveModel(nvi, nri, ri, resi, rhsi);
		
		
	}
	
	
	
}
