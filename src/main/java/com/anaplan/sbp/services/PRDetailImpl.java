package com.anaplan.sbp.services;

import com.anaplan.sbp.dao.PRDetailDao;
import com.anaplan.sbp.model.PRDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("prDetailService")
public class PRDetailImpl implements PRDetailServices {

    @Autowired
    PRDetailDao prDetailDao;

    @Override
    public boolean addPRDetail(final PRDetails pRDetail) {
        return prDetailDao.addPRDetail(pRDetail);
    }

    @Override
    public PRDetails getPRDetailById(final long id) {
        return prDetailDao.getPRDetailById(id);
    }

    @Override
    public boolean updatePRDetail(final PRDetails pRDetail) {
        return prDetailDao.updatePRDetail(pRDetail);
    }

}
