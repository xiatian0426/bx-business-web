package com.acc.model;

import com.acc.util.CalendarUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 
 * @version 1.0
 * @since 1.0
 */


public class BxContent implements java.io.Serializable, Cloneable{
	
	private static final long serialVersionUID = 1736258302889590552L;

	private int id;

    private String contentName;

    private String contentImg;

    private String contentDesc;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private Integer contentImgType;//0:图片 1:文字 2:视频
	
	private Integer contentOrder;

    private Integer status;

    private Integer memberId;

    private Integer createrId;

    private String createDate;

    /**
     * modifyDate       db_column: MODIFY_DATE
     */
    private String modifyDate;
    /**
     * modifierId       db_column: MODIFIER_ID
     */
    private Integer modifierId;

    private String isbanner;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

    public String getContentImg() {
        return contentImg;
    }

    public void setContentImg(String contentImg) {
        this.contentImg = contentImg;
    }

    public Integer getContentOrder() {
        return contentOrder;
    }

    public void setContentOrder(Integer contentOrder) {
        this.contentOrder = contentOrder;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getCreaterId() {
        return createrId;
    }

    public void setCreaterId(Integer createrId) {
        this.createrId = createrId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getModifierId() {
        return modifierId;
    }

    public void setModifierId(Integer modifierId) {
        this.modifierId = modifierId;
    }

    public String getIsbanner() {
        return isbanner;
    }

    public void setIsbanner(String isbanner) {
        this.isbanner = isbanner;
    }

    public Integer getContentImgType() {
        return contentImgType;
    }

    public void setContentImgType(Integer contentImgType) {
        this.contentImgType = contentImgType;
    }

    public String getContentDesc() {
        return contentDesc;
    }

    public void setContentDesc(String contentDesc) {
        this.contentDesc = contentDesc;
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2;
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3;
    }
}

