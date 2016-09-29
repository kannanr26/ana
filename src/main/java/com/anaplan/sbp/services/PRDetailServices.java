package com.anaplan.sbp.services;

import com.anaplan.sbp.model.PRDetails;

public interface PRDetailServices {
    boolean addPRDetail(PRDetails pRDetail);

    PRDetails getPRDetailById(long id);

    boolean updatePRDetail(PRDetails pRDetail);

}
