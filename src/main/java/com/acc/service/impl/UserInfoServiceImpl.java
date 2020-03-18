package com.acc.service.impl;

import com.acc.dao.UserInfoMapper;
import com.acc.model.UserInfo;
import com.acc.service.IUserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userInfoService")
@Transactional
public class UserInfoServiceImpl extends BaseServiceImpl<UserInfo> implements IUserInfoService {

	private static Logger _logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);
	@Autowired
	private UserInfoMapper userInfoMapper;
	
}
