package com.acc.service;

import com.acc.model.BxQA;

public interface IBxQAService extends IBaseService<BxQA> {

    void insert(BxQA bxQA) throws Exception;
}
