package com.acc.service.impl;

import com.acc.dao.BxQAMapper;
import com.acc.model.BxQA;
import com.acc.service.IBxQAService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("bxQAService")
@Transactional
public class BxQAServiceImpl extends BaseServiceImpl<BxQA> implements IBxQAService {

	private static Logger _logger = LoggerFactory.getLogger(BxQAServiceImpl.class);
	@Autowired
	private BxQAMapper bxQAMapper;

    @Override
    public void insert(BxQA bxQA) throws Exception {
        bxQAMapper.insert(bxQA);
    }
}
