package roots.repository;

import roots.model.Sabonete;

public interface SaboneteRepository {
	
	public void criarSabonete(Sabonete sabonete);
	
	public void listarSabonetes();
	
	public void consultarSaboneteId(int id);
	
	public void atualizarSabonete(Sabonete sabonete);
	
	public void deletarSabonete(int id);

}
