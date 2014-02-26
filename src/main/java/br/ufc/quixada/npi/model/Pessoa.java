package br.ufc.quixada.npi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa {
  
	    
	    @Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
	    @Override
		public String toString() {
			return "Pessoa [ nome=" + nome + ", sobrenome="
					+ sobrenome + "]";
		}

		private String nome;
	    private String sobrenome;

	    
		public Pessoa() {
			super();
		}

		public Pessoa(String nome, String sobrenome) {
			this.nome = nome;
			this.sobrenome = sobrenome;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSobrenome() {
			return sobrenome;
		}

		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}
	   

}
