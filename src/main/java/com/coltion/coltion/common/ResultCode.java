package com.coltion.coltion.common;

import com.coltion.coltion.enumClass.Common;
import lombok.Getter;

@Getter
public class ResultCode {
    private final int code;
    private final String message;


    public ResultCode(Common common) {
        this.code = common.getCode();
        this.message = common.getMessage();
    }

}
