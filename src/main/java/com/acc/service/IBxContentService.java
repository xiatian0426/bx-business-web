package com.acc.service;

import com.acc.exception.SelectException;
import com.acc.model.BxContent;
import com.acc.model.BxContentDetail;

import java.util.List;


public interface IBxContentService extends IBaseService<BxContent> {

    List<BxContent> getBanByMemberId(String memberId) throws SelectException;

    List<BxContent> geContentByBlockId(String memberId,String blockId) throws SelectException;

    List<BxContentDetail>  getContentDetailByContentId(String contentId) throws SelectException;

}
