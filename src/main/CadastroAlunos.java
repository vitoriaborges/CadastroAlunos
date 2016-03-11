package main;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroAlunos {
	
	public static ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
	public static Scanner sc = new Scanner(System.in);
			
	public static void main(String[] args) {
		Aluno al = null;
		
		System.out.println("Ola usuario!");
	
		for (int i = 0; i < 3; i++) {
			System.out.println(" Informe o nome do aluno: ");
			al = new Aluno(sc.next());
			System.out.println(" Informe o numero da matricula: ");
			al.setMatricula(sc.next());
			System.out.println(" Informe sua idade: ");
			al.setIdade(sc.nextInt());
			
			listaAlunos.add(al);
			
		}
		
		//mostraAlunos();
		//buscaAlunos();
		
		System.out.println("Informe um nome para pesquisa: ");
		String nomeParaPesquisa = sc.next();
		buscaAlunos(nomeParaPesquisa);
		
	}		

	
		public static void mostraAlunos(){
			for(Aluno a: listaAlunos){				
				System.out.println(a);
			}
		}
			
		
		public static void buscaAlunos(){
			System.out.println(" Informe sua matricula para pesquisa: ");
			String busca = sc.next();
			for(Aluno al: listaAlunos){
				if(busca.equalsIgnoreCase(al.getMatricula())){
					System.out.println(" Encontrei a matricula que voce procurava! ");
					System.out.println(al);
				}
			}
		}
		
		public static ArrayList<Aluno> buscaAlunos(String nome){
			
			ArrayList<Aluno> resultado = new ArrayList<Aluno>();
			
			for(Aluno ao: listaAlunos){
				if(ao.getNome().equalsIgnoreCase(nome)){
					System.out.println(" pessoa ");
					System.out.println(ao);
				}
			}
			
			return resultado;			

		}
		
}