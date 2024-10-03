package com.coltion.coltion.enumClass;

import lombok.Getter;

import java.util.Map;

@Getter
public enum Common {
    SUCCESS(200, "성공적으로 조회하였습니다."),
    FAIL(400, "실패하였습니다."),
    NOT_FOUND(404, "찾을 수 없습니다."),
    SERVER_ERROR(500, "서버 에러입니다.");
    private final int code;
    private final String message;

    Common(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
