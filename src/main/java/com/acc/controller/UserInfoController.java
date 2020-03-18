package com.acc.controller;

import com.acc.exception.ExceptionUtil;
import com.acc.exception.SelectException;
import com.acc.frames.web.Md5PwdEncoder;
import com.acc.model.*;
import com.acc.service.IUserInfoService;
import com.acc.util.CalendarUtil;
import com.acc.util.Constants;
import com.acc.util.PictureChange;
import com.acc.util.weChat.WechatUtil;
import com.acc.vo.Page;
import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping(value="/user")
public class UserInfoController {
	private static Logger _logger = LoggerFactory.getLogger(UserInfoController.class);

	@Autowired
	private IUserInfoService userInfoService;

}
