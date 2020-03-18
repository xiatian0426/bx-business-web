package com.acc.model;

/**
 * @author 
 * @version 1.0
 * @since 1.0
 */


public class BxContentDetail implements java.io.Serializable, Cloneable{
	
	private static final long serialVersionUID = 1236258302889590552L;

	private int id;

    private Integer contentId;

    private String contentDetailImg;
	
	private Integer contentDetailOrder;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public String getContentDetailImg() {
        return contentDetailImg;
    }

    public void setContentDetailImg(String contentDetailImg) {
        this.contentDetailImg = contentDetailImg;
    }

    public Integer getContentDetailOrder() {
        return contentDetailOrder;
    }

    public void setContentDetailOrder(Integer contentDetailOrder) {
        this.contentDetailOrder = contentDetailOrder;
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
}

