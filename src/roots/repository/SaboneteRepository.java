package roots.repository;

import roots.model.Sabonete;

public interface SaboneteRepository {
	
	public void criarSabonete(Sabonete Sabonete);
	
	public void listarSabonetes();
	
	public void consultarSaboneteId(int id);
	
	public void atualizarSabonete(Sabonete Sabonete);
	
	public void deletarSabonete(int id);

}
