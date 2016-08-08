package com.niit.Backend.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Backend.model.User;

@Repository("userDAO")

public class UserDAOImpl  implements UserDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	public UserDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional

	public List<User> list() {

		@SuppressWarnings({ "unchecked", "deprecation" })
		List<User> listUser=(List<User>) sessionFactory.getCurrentSession().createCriteria(User.class)
		.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listUser;
		
	}

	@Transactional

	public void saveorUpdate(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	
		
	}

	public void delete(String id) {
		User UserToDelete = new User();
		UserToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(UserToDelete);
		
		
	}
	@Transactional
	public User get(String id) {
		String hql="from"+" User"+" where id=" + "'"+id+"'";
		
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>)query.getResultList();
		if(listUser != null && !listUser.isEmpty()){
			return listUser.get(0);
		}
		return null;
		

	}

	
	

	

}
