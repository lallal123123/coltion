package com.coltion.coltion.Exception;

import com.coltion.coltion.common.ResultCode;
import com.coltion.coltion.enumClass.Common;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ValidGlobalExceptionHandler {

    // 유효성 검사 실패 시 처리
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResultCode> handleValidationExceptions(MethodArgumentNotValidException ex, WebRequest request) {
        // 유효성 검사 실패 시 Common.FAIL 응답
        ResultCode resultCode = new ResultCode(Common.FAIL);
        return new ResponseEntity<>(resultCode, HttpStatus.BAD_REQUEST);
    }
    // 기타 예외 처리
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResultCode> handleGlobalException(Exception ex, WebRequest request) {
        // 서버 에러 시 Common.SERVER_ERROR 응답
        ResultCode resultCode = new ResultCode(Common.SERVER_ERROR);
        return new ResponseEntity<>(resultCode, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}