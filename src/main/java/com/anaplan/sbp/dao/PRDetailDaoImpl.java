package com.anaplan.sbp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anaplan.sbp.model.PRDetails;

@Repository ("prDetailsDao")
public class PRDetailDaoImpl implements PRDetailDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	@Override
	public boolean addPRDetail(PRDetails pRDetail) throws Exception {

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(pRDetail);
		tx.commit();
		session.close();

		return true;
	}
@Override
	public PRDetails getPRDetailById(long id) throws Exception {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		PRDetails calTracker = (PRDetails) session.load(PRDetails.class,
				new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return calTracker;
	
	}

	@Override
	public boolean updatePRDetail(PRDetails pRDetail) throws Exception {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.update(pRDetail);
		tx.commit();
		session.close();

		return true;
	}

}
