package com.acc.service.impl;

import com.acc.dao.BxContentMapper;
import com.acc.dao.UserInfoMapper;
import com.acc.exception.SelectException;
import com.acc.model.BxContent;
import com.acc.service.IBxContentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("bxContentService")
@Transactional
public class BxContentServiceImpl extends BaseServiceImpl<BxContent> implements IBxContentService {

	private static Logger _logger = LoggerFactory.getLogger(BxContentServiceImpl.class);
	@Autowired
	private BxContentMapper bxContentMapper;

    public List<BxContent> getProductByMemId(String memberId) throws SelectException{
        return bxContentMapper.getProductByMemId(memberId);
    }
	
}
