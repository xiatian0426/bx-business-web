package com.acc.dao;

import com.acc.exception.SelectException;
import com.acc.model.BxContent;
import com.acc.model.BxContentDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BxContentMapper extends BaseMapper<BxContent>{

	List<BxContent> getAllByMap(Map<String, Object> map) throws SelectException;

    List<BxContent> getBanByMemberId(@Param("memberId") String memberId) throws SelectException;

    List<BxContent> geContentByBlockId(@Param("memberId") String memberId,@Param("blockId") String blockId) throws SelectException;

    List<BxContentDetail>  getContentDetailByContentId(@Param("contentId") String contentId) throws SelectException;
}
