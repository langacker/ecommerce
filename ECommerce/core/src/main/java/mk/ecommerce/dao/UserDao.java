package mk.ecommerce.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mk.ecommerce.entity.User;

public class UserDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<User> getAll() {
		return em.createNamedQuery(User.GET_ALL).getResultList();
	}
	
	

}
