package com.acc.dao;

import com.acc.exception.SelectException;
import com.acc.model.BxContent;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BxContentMapper extends BaseMapper<BxContent>{

	List<BxContent> getAllByMap(Map<String, Object> map) throws SelectException;

    List<BxContent> getProductByMemId(@Param("memberId") String memberId) throws SelectException;
}
