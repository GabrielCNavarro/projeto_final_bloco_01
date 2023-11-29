package roots.model;

public class Organico extends Sabonete {
	
	private String ingredOrganicos;

	public Organico(int id, String nome, int tipo, float preco, String ingredOrganicos) {
		super(id, nome, tipo, preco);
		this.ingredOrganicos = ingredOrganicos;
	}

	public String getingredOrganicos() {
		return ingredOrganicos;
	}

	public void setingredOrganicos(String ingredOrganicos) {
		this.ingredOrganicos = ingredOrganicos;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Ingredientes Orgânicos do Sabonete: " + ingredOrganicos);
	}
	
	
}

