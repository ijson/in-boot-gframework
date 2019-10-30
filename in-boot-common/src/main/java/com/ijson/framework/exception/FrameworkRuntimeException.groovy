package com.ijson.framework.exception

/**
 * desc:
 * version: 6.7
 * Created by cuiyongxu on 2019/10/31 12:02 AM
 */
class FrameworkRuntimeException extends RuntimeException {

    private int errorCode = FrameworkBusinessExceptionCode.SYSTEM_ERROR.getCode();

    FrameworkRuntimeException() {
    }

    FrameworkRuntimeException(Throwable throwable) {
        super(throwable);
    }

    FrameworkRuntimeException(int errorCode, String message) {
        this(message, false);
        this.errorCode = errorCode;
    }

    FrameworkRuntimeException(String message, boolean stackTrace) {
        super(message, null, true, stackTrace);
    }

    int getErrorCode() {
        return errorCode;
    }

}
