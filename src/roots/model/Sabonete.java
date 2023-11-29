package roots.model;
	

public abstract class Sabonete {

		private int id;
		private String nome;
		private int tipo;
		private float preco;

		public Sabonete(int id, String nome, int tipo, float preco) {
			this.id = id;
			this.nome = nome;
			this.tipo = tipo;
			this.preco = preco;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getTipo() {
			return tipo;
		}

		public void setTipo(int tipo) {
			this.tipo = tipo;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(float preco) {
			this.preco = preco;
		}

		public void visualizar() {

	        String tipo = "";
	        
	        switch(this.tipo) {
	        case 1:
	            tipo = "Orgânico";
	            break;
	        case 2:
	            tipo = "Vegano";
	            break;
		        default:
	                System.out.println("\nTipo Inválido!");
	        }
	        
	        System.out.println("\n\n***********************************************************");
	        System.out.println("Detalhes: ");
	        System.out.println("***************************************************************");
	        System.out.println("ID do Sabonete: " + this.id);
	        System.out.println("Nome do Sabonete: " + this.nome);
	        System.out.println("Tipo do Sabonete: " + tipo);
	        System.out.println("Preço do Sabonete: " + this.preco);


	    }
	  
}