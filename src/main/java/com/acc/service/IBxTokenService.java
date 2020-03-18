package com.acc.service;

import com.acc.exception.SelectException;
import com.acc.model.BxToken;

public interface IBxTokenService {

    BxToken getToken(Integer memberId) throws SelectException;

}
