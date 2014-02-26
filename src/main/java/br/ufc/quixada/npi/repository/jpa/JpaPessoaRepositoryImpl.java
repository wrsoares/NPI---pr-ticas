package br.ufc.quixada.npi.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.ufc.quixada.npi.model.Pessoa;

import br.ufc.quixada.npi.repository.PessoaRepository;

@Repository
public class JpaPessoaRepositoryImpl implements PessoaRepository {

	@PersistenceContext
	private EntityManager em;
	

	public List<Pessoa> findAll() {
		return em.createQuery("from Pessoa", Pessoa.class).getResultList();
	}

	public void save(Pessoa pessoa) {
		if (pessoa.getId() == null) {
			em.persist(pessoa);
		} else {
			em.merge(pessoa);
		}
		
	}

	

}
