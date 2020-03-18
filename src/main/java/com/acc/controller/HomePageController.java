package com.acc.controller;

import com.acc.exception.ExceptionUtil;
import com.acc.model.BxContent;
import com.acc.service.IBxContentService;
import com.acc.util.Constants;
import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping(value="/homePage")
public class HomePageController {
	private static Logger _logger = LoggerFactory.getLogger(HomePageController.class);

	@Autowired
	private IBxContentService contentService;

    /**
     * 根据会员id获取对应权限产品
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/getBanByMemberId", method = RequestMethod.GET)
    public void getProductByMemId(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        Map<String, Object> map = new HashMap<String, Object>();
        String result = "操作成功";
        int status = 0;
        try{
            String memberId = request.getParameter("memberId");
            if(StringUtils.isNotEmpty(memberId)){
                List<BxContent> list = contentService.getProductByMemId(memberId);
                if(list != null && list.size()>0){
                    for(BxContent bxContent:list){
                        bxContent.setContentImg(Constants.busAdminPath + Constants.contentImgPath+bxContent.getId()+"/"+bxContent.getContentImg());
                    }
                }
                map.put("list",list);
            }
        } catch (Exception e) {
            status = -1;
            result = "操作失败!";
            _logger.error("getBanByMemberId失败：" + ExceptionUtil.getMsg(e));
            e.printStackTrace();
        }
        map.put("status", status);
        map.put("result", result);
        out.print(JSON.toJSONString(map));
        out.flush();
        out.close();
    }

}
