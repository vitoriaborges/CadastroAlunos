package main;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroAlunos {
	
	public static ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
	public static Scanner sc = new Scanner(System.in);
			
	public static void main(String[] args) {
		Aluno al = null;
	
		for (int i = 0; i < 2; i++) {
			System.out.println(" Informe o nome do aluno: ");
			al = new Aluno(sc.next());
			System.out.println(" Informe o numero da matricula: ");
			al.setMatricula(sc.next());
			System.out.println(" Informe sua idade: ");
			al.setIdade(sc.nextInt());
			
			listaAlunos.add(al);
			
		}
		
		for(Aluno a: listaAlunos){
			System.out.println(a);
		}
		
		
		
	}

}

