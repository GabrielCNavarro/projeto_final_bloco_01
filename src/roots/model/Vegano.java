package roots.model;

public class Vegano extends Sabonete {
		
		private String ingredVegetais;

		public Vegano(int id, String nome, int tipo, float preco, String ingredVegetais) {
			super(id, nome, tipo, preco);
			this.ingredVegetais = ingredVegetais;
		}

		public String getingredVegetais() {
			return ingredVegetais;
		}

		public void setingredVegetais(String ingredVegetais) {
			this.ingredVegetais = ingredVegetais;
		}
		
		@Override
		public void visualizar() {
			super.visualizar();
			System.out.println("Ingredientes Vegetais do Sabonete: " + ingredVegetais);

		}
		
		
}
