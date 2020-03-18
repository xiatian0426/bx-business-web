package com.acc.service.impl;

import com.acc.dao.BxContentMapper;
import com.acc.dao.UserInfoMapper;
import com.acc.exception.SelectException;
import com.acc.model.BxContent;
import com.acc.model.BxContentDetail;
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

	@Override
    public List<BxContent> getBanByMemberId(String memberId) throws SelectException{
        return bxContentMapper.getBanByMemberId(memberId);
    }

    @Override
    public List<BxContent> geContentByBlockId(String memberId,String blockId) throws SelectException{
        return bxContentMapper.geContentByBlockId(memberId,blockId);
    }

    @Override
    public List<BxContentDetail>  getContentDetailByContentId(String contentId) throws SelectException{
        return bxContentMapper.getContentDetailByContentId(contentId);
    }

}
