package roots.controller;

import java.util.ArrayList;
import java.util.Optional;

import roots.model.Sabonete;

import roots.repository.SaboneteRepository;

public class SaboneteController implements SaboneteRepository {

	private ArrayList<Sabonete> listaSabonetes = new ArrayList<Sabonete>();
	
	int id = 0;
	
	
	@Override
	public void criarSabonete(Sabonete sabonete) {
		listaSabonetes.add(sabonete);
		System.out.println("\nO Sabonete: " + sabonete.getId() + " foi cadastrado com sucesso!");
	}

	@Override
	public void listarSabonetes() {
		for (var sabonetes : listaSabonetes) {
			sabonetes.visualizar();
		}
	}

	@Override
	public void consultarSaboneteId(int id) {
		var sabonete = buscarNaCollection(id);
		
		if(sabonete != null) {
			sabonete.visualizar();
		}else {
			System.err.println("O sabonete vinculado ao ID: " + id + " não foi encontrado!");
		}
}

	@Override
	public void atualizarSabonete(Sabonete sabonete) {
		var buscaSabonete = buscarNaCollection(sabonete.getId());
		if(buscaSabonete != null) {
			listaSabonetes.set(listaSabonetes.indexOf(buscaSabonete), sabonete);
			System.out.println("\nO sabonete de ID: " + sabonete.getId() + " foi atualizado com sucess!");
		}else
			System.out.println("\nO sabonete de ID: " + sabonete.getId() + "não foi encontrado!");
	}

	@Override
	public void deletarSabonete(int id) {
		var sabonete = buscarNaCollection(id);
		
		if(sabonete != null) {
			if (listaSabonetes.remove(sabonete) == true)
				System.out.println("\nO Sabonete numero " + id + " foi apagado!");
		}else 
			System.out.println("\nO Sabonete numero: " + id + " não foi encontrado!");

	}
	
	// Metodo Auxiliar
	public int gerarId() {
		return ++ id;
	}

	
	public Sabonete buscarNaCollection(int id) {
		for(var sabonete : listaSabonetes) {
			if(sabonete.getId() == id) {
				return sabonete;
			}
		}
		return null;
	}
}