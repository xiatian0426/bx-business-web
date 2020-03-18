package com.acc.model;

/**
 * @author 
 * @version 1.0
 * @since 1.0
 */


public class BxBlock implements java.io.Serializable, Cloneable{
	
	private static final long serialVersionUID = 1736258202889590552L;

	private int id;

    private Integer navigationId;

    private String blockName;
	
	private String blockImg;

    private Integer blockOrder;

    private Integer memberId;

    private Integer mouldId;

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

    private Integer mouldType;//0:正常商品类型 1:咨询类型 2:关于我们类型

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getNavigationId() {
        return navigationId;
    }

    public void setNavigationId(Integer navigationId) {
        this.navigationId = navigationId;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public String getBlockImg() {
        return blockImg;
    }

    public void setBlockImg(String blockImg) {
        this.blockImg = blockImg;
    }

    public Integer getBlockOrder() {
        return blockOrder;
    }

    public void setBlockOrder(Integer blockOrder) {
        this.blockOrder = blockOrder;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getMouldId() {
        return mouldId;
    }

    public void setMouldId(Integer mouldId) {
        this.mouldId = mouldId;
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

    public Integer getMouldType() {
        return mouldType;
    }

    public void setMouldType(Integer mouldType) {
        this.mouldType = mouldType;
    }
}

