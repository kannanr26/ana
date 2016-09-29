package com.anaplan.sbp.dao;

import com.anaplan.sbp.exception.SdbException;
import com.anaplan.sbp.model.CalTracker;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CalTrackerDaoImpl implements CalTrackerDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean addCalTracker(final CalTracker calTracker) {
        try {
            return updateDetails(calTracker, UpdateCalTracker.ADD_RECORD);
        } catch (final Exception ex) {
            throw new SdbException("1004", ex.getMessage(), ex);
        }
    }

    @Override
    public CalTracker getCalTrackerById(final long id) {
        try {
            final Session session = sessionFactory.openSession();
            final CalTracker calTracker = (CalTracker) session.load(CalTracker.class,
                    new Long(id));
            final Transaction tx = session.getTransaction();
            session.beginTransaction();
            tx.commit();
            return calTracker;
        } catch (final Exception ex) {
            throw new SdbException("1005", ex.getMessage(), ex);
        }

    }

    @Override
    public boolean updateCalTracker(final CalTracker calTracker) {
        try {
            return updateDetails(calTracker, UpdateCalTracker.UPDATE_RECORD);
        } catch (final Exception ex) {
            throw new SdbException("1006", ex.getMessage(), ex);
        }

    }

    private boolean updateDetails(final CalTracker calTracker, final UpdateCalTracker updateCalTracker) {
        final Session session = sessionFactory.openSession();
        final Transaction tx = session.beginTransaction();
        updateCalTracker.updateDetails(calTracker, session);
        tx.commit();
        session.close();
        return false;

    }

    private enum UpdateCalTracker {
        ADD_RECORD {
            @Override
            public void updateDetails(final CalTracker calTracker, final Session session) {
                session.update(calTracker);
            }
        },
        UPDATE_RECORD {
            @Override
            public void updateDetails(final CalTracker calTracker, final Session session) {
                session.save(calTracker);
            }
        };

        public abstract void updateDetails(CalTracker calTracker, Session session);
    }

}
