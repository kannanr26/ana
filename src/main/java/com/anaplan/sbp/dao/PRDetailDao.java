package com.anaplan.sbp.dao;

import com.anaplan.sbp.model.PRDetails;

public interface PRDetailDao {
    boolean addPRDetail(PRDetails PRDetail);

    PRDetails getPRDetailById(long id);

    boolean updatePRDetail(PRDetails PRDetail);

}
