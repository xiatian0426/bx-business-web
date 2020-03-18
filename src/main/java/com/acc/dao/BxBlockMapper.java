package com.acc.dao;

import com.acc.exception.SelectException;
import com.acc.model.BxBlock;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BxBlockMapper extends BaseMapper<BxBlock>{

    List<BxBlock> getBxBlockByNavigationId(@Param("memberId") String memberId,@Param("navigationId") String navigationId) throws SelectException;

    BxBlock getBlockById(@Param("id") String id) throws SelectException;

}
