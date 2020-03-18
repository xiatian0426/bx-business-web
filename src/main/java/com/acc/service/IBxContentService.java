package com.acc.service;

import com.acc.exception.SelectException;
import com.acc.model.BxContent;

import java.util.List;


public interface IBxContentService extends IBaseService<BxContent> {

    List<BxContent> getProductByMemId(String memberId) throws SelectException;

}
