package com.acc.service.impl;

import com.acc.dao.BxBlockMapper;
import com.acc.dao.BxContentMapper;
import com.acc.exception.SelectException;
import com.acc.model.BxBlock;
import com.acc.model.BxContent;
import com.acc.service.IBxBlockService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("bxBlockService")
@Transactional
public class BxBlockServiceImpl extends BaseServiceImpl<BxBlock> implements IBxBlockService {

	private static Logger _logger = LoggerFactory.getLogger(BxBlockServiceImpl.class);
	@Autowired
	private BxBlockMapper bxBlockMapper;

    @Override
    public List<BxBlock> getBxBlockByNavigationId(String memberId,String navigationId) throws SelectException{
        return bxBlockMapper.getBxBlockByNavigationId(memberId,navigationId);
    }

    @Override
    public BxBlock getBlockById(String id) throws SelectException{
        return bxBlockMapper.getBlockById(id);
    }

	
}
