package com.ijson.framework.exception

enum FrameworkBusinessExceptionCode {
    SYSTEM_ERROR(500_000_001, "系统发生未知错误"),
    REQUEST_WAY_ERROR(500_000_002, "请求方式异常,请检查"),


    USER_NOT_FOUND(200_000_001, "用户不存在或密码不正确,请检查"),
    PASSWORD_NOT_FOUND(200_000_002, "密码验证失败,请检查"),
    INVALID_CURRENT_PASSWORD(200_000_003, "密码不正确,请检查");

    private int code;
    private String message;

    FrameworkBusinessExceptionCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    int getCode() {
        return code;
    }

    String getMessage() {
        return message;
    }

    static FrameworkBusinessExceptionCode valueOf(int errorCode) {
        FrameworkBusinessExceptionCode[] codes = FrameworkBusinessExceptionCode.values();
        for (FrameworkBusinessExceptionCode code : codes) {
            if (code.getCode() == errorCode) {
                return code;
            }
        }

        return null;
    }
}