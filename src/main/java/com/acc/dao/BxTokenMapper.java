package com.acc.dao;

import com.acc.exception.SelectException;
import com.acc.model.BxToken;
import org.apache.ibatis.annotations.Param;

public interface BxTokenMapper {

    BxToken getToken(@Param("memberId") Integer memberId) throws SelectException;

}
