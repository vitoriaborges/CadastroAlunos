package main;

import java.util.ArrayList;

public class Aluno {

		private String nome;
		private String matricula;
		private int idade;
		private ArrayList<String> autorizados = new ArrayList<String>();
		
		public Aluno(String n){
			this.nome = n;
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public ArrayList<String> getAutorizados() {
			return autorizados;
		}
		public void setAutorizados(ArrayList<String> autorizados) {
			this.autorizados = autorizados;
		}

		@Override
		public String toString() {
			return "Aluno [nome=" + nome + ", matricula=" + matricula
					+ ", idade=" + idade + "]";
		}
		
		
		
}
