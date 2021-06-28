package rob.in.dao;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import rob.in.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	private static Session session = null;

	@Override
	public List<User> getAllUsers() {
		session = getSession();
		return session.createCriteria(User.class).list();
	}

	private Session getSession() {
		if (session != null)
			return session;
		else
			return sessionFactory.openSession();
	}

	@Override
	public void addUser(@Valid User user) {
		session = getSession();
	    Transaction tx = null;
	    try {
	        tx = session.beginTransaction();
	        session.save(user);
	        tx.commit(); // Flush happens automatically
	    }
	    catch (RuntimeException e) {
	        tx.rollback();
	        throw e; // or display error message
	    }
	    finally {
	        session.close();
	        session=null;
	    }
	}

	@Override
	public void updateUser(@Valid User user) {

		session = getSession();
	    Transaction tx = null;
	    try {
	        tx = session.beginTransaction();
	        session.merge(user);
	        tx.commit(); // Flush happens automatically
	    }
	    catch (RuntimeException e) {
	        tx.rollback();
	        throw e; // or display error message
	    }
	    finally {
	        session.close();
	        session=null;
	    }
		
	}

}
