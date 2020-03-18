package com.acc.controller;

import com.acc.exception.ExceptionUtil;
import com.acc.model.*;
import com.acc.service.IBxBlockService;
import com.acc.service.IBxContentService;
import com.acc.service.IBxQAService;
import com.acc.service.IBxTokenService;
import com.acc.util.Constants;
import com.acc.util.weChat.WechatUtil;
import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	private IBxContentService bxContentService;

    @Autowired
    private IBxBlockService bxBlockService;

    @Autowired
    private IBxQAService bxQAService;

    @Autowired
    private IBxTokenService bxTokenService;

    /**
     * 首页-bannel
     * 根据会员id获取bannel列表
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
                List<BxContent> list = bxContentService.getBanByMemberId(memberId);
                if(list != null && list.size()>0){
                    for(BxContent bxContent:list){
                        bxContent.setContentImg(Constants.BUSADMINPATH + Constants.CONTENTIMGPATH+bxContent.getId()+"/"+bxContent.getContentImg());
                    }
                }
                map.put("list",list);
            }else{
                status = 1;
                result = "参数错误!";
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

    /**
     * 根据会员id和导航栏id获取列表数据
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/getBlockByNavigationId", method = RequestMethod.GET)
    public void getBlockByNavigationId(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        Map<String, Object> map = new HashMap<String, Object>();
        String result = "操作成功";
        int status = 0;
        try{
            String memberId = request.getParameter("memberId");
            String navigationId = request.getParameter("navigationId");
            if(StringUtils.isNotEmpty(memberId) && StringUtils.isNotEmpty(navigationId)){
                List<BxBlock> list = bxBlockService.getBxBlockByNavigationId(memberId,navigationId);
                if(list != null && list.size()>0){
                    for(BxBlock bxBlock:list){
                        bxBlock.setBlockImg(Constants.BUSADMINPATH + Constants.BLOCKIMGPATH+bxBlock.getId()+"/"+bxBlock.getBlockImg());
                    }
                }
                map.put("list",list);
            }else{
                status = 1;
                result = "参数错误!";
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

    /**
     * 根据会员id和模块id获取列表数据(mouldType=0/3)
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/getContentByBlockId", method = RequestMethod.GET)
    public void getContentByBlockId(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        Map<String, Object> map = new HashMap<String, Object>();
        String result = "操作成功";
        int status = 0;
        try{
            String memberId = request.getParameter("memberId");
            String blockId = request.getParameter("blockId");
            if(StringUtils.isNotEmpty(memberId) && StringUtils.isNotEmpty(blockId)){
                BxBlock bxBlock = bxBlockService.getBlockById(blockId);
                map.put("bxBlock",bxBlock);
                List<BxContent> list = bxContentService.geContentByBlockId(memberId,blockId);
                if(list != null && list.size()>0){
                    for(BxContent bxContent:list){
                        if(bxContent.getContentImgType()!=null && bxContent.getContentImgType()==0){//图片需要加前缀
                            bxContent.setContentImg(Constants.BUSADMINPATH + Constants.CONTENTIMGPATH+bxContent.getId()+"/"+bxContent.getContentImg());
                        }
                    }
                }
                map.put("list",list);
            }else{
                status = 1;
                result = "参数错误!";
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

    /**
     * 根据模块id获取模块详情(mouldType=0)
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/getContentDetailByContentId", method = RequestMethod.GET)
    public void getContentDetailByContentId(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        Map<String, Object> map = new HashMap<String, Object>();
        String result = "操作成功";
        int status = 0;
        try{
            String contentId = request.getParameter("contentId");
            if(StringUtils.isNotEmpty(contentId)){
                List<BxContentDetail> list = bxContentService.getContentDetailByContentId(contentId);
                if(list != null && list.size()>0){
                    for(BxContentDetail bxContentDetail:list){
                        bxContentDetail.setContentDetailImg(Constants.BUSADMINPATH + Constants.CONTENTDETAILIMGPATH+bxContentDetail.getId()+"/"+bxContentDetail.getContentDetailImg());
                    }
                }
                map.put("list",list);
            }else{
                status = 1;
                result = "参数错误!";
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
    /**
     * 添加QA信息(mouldType=1)
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/addQA", method = RequestMethod.POST)
    public void addQA(final HttpServletRequest request, final HttpServletResponse response, @ModelAttribute BxQA bxQA) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        Map<String, Object> map = new HashMap<String, Object>();
        String result = "操作成功";
        int status = 0;
        try{
            if(bxQA != null && bxQA.getMemberId()!=null){
                //敏感信息验证
                BxToken bxToken = bxTokenService.getToken(bxQA.getMemberId());
                if(bxToken!=null && bxToken.getAccessToken()!=null && !bxToken.getAccessToken().equals("")){
                    String content = bxQA.getAsk()+bxQA.getAnswer()+bxQA.getQaOrder();
                    int checkMsgResult = WechatUtil.checkMsg(bxToken.getAccessToken(),content);
                    if(checkMsgResult== 0){
                        bxQAService.insert(bxQA);
                    }else{
                        status = 99;
                        result = "敏感信息校验失败!";
                    }
                }else {
                    status = 98;
                    result = "敏感信息校验权限不足!";
                }
            }else{
                status = 1;
                result = "参数错误!";
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
