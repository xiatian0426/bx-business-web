package com.acc.service;

import com.acc.exception.SelectException;
import com.acc.model.BxBlock;
import com.acc.model.BxContent;

import java.util.List;


public interface IBxBlockService extends IBaseService<BxBlock> {

    List<BxBlock> getBxBlockByNavigationId(String memberId,String navigationId) throws SelectException;

    BxBlock getBlockById(String id) throws SelectException;
}
