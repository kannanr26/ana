package com.anaplan.sbp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anaplan.sbp.model.CalTracker;

@Repository("calTrackerDao")
public class CalTrackerDaoImpl implements CalTrackerDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	@Override
	public boolean addCalTracker(CalTracker CalTracker) throws Exception {

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(CalTracker);
		tx.commit();
		session.close();

		return true;
	}
@Override
	public CalTracker getCalTrackerById(long id) throws Exception {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		CalTracker calTracker = (CalTracker) session.load(CalTracker.class,
				new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return calTracker;
	
	}

	@Override
	public boolean updateCalTracker(CalTracker CalTracker) throws Exception {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.update(CalTracker);
		tx.commit();
		session.close();

		return true;
	}

}
