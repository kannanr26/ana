package com.anaplan.sbp.dao;

import com.anaplan.sbp.exception.SdbException;
import com.anaplan.sbp.model.PRDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PRDetailDaoImpl implements PRDetailDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean addPRDetail(final PRDetails pRDetail) {
        try {
            return updateDetails(pRDetail, UpdatePRDetails.ADD_RECORD);
        } catch (final Exception ex) {
            throw new SdbException("1001", ex.getMessage(), ex);
        }
    }

    @Override
    public PRDetails getPRDetailById(final long id) {
        final PRDetails calTracker;
        try {
            final Session session = sessionFactory.openSession();
            calTracker = (PRDetails) session.load(PRDetails.class, new Long(id));
            final Transaction tx = session.getTransaction();
            session.beginTransaction();
            tx.commit();
        } catch (final Exception ex) {
            throw new SdbException("1002", ex.getMessage(), ex);
        }
        return calTracker;
    }

    @Override
    public boolean updatePRDetail(final PRDetails pRDetail) {
        try {
            return updateDetails(pRDetail, UpdatePRDetails.UPDATE_RECORD);
        } catch (final Exception ex) {
            throw new SdbException("1003", ex.getMessage(), ex);
        }
    }

    private boolean updateDetails(final PRDetails pRDetail, final UpdatePRDetails updatePRDetails) {
        final Session session = sessionFactory.openSession();
        final Transaction tx = session.beginTransaction();
        updatePRDetails.updateDetails(pRDetail, session);
        tx.commit();
        session.close();
        return true;
    }

    private enum UpdatePRDetails {
        ADD_RECORD {
            @Override
            public void updateDetails(final PRDetails prDetails, final Session session) {
                session.update(prDetails);
            }
        },
        UPDATE_RECORD {
            @Override
            public void updateDetails(final PRDetails prDetails, final Session session) {
                session.save(prDetails);
            }
        };

        public abstract void updateDetails(PRDetails calTracker, Session session);
    }
}
