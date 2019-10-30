package com.ijson.framework.model

import com.ijson.framework.exception.FrameworkBusinessException
import com.ijson.framework.exception.FrameworkBusinessExceptionCode
import com.ijson.framework.exception.FrameworkRuntimeException
import lombok.Data

/**
 * desc:
 * version: 6.7
 * Created by cuiyongxu on 2019/10/31 12:01 AM
 */
@Data
class Result<T> {
    private int code;
    private String message;
    private T result;


    Result(int code, String message, T result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }


    Result() {

    }

    Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    static Result ok() {
        return new Result(0, "");
    }

    static Result error(FrameworkBusinessException e) {
        return new Result(e.getErrorCode(), e.getMessage());
    }

    static Result ok(String message) {
        return new Result(0, message);
    }

    static Result error(FrameworkRuntimeException runtimeException) {
        return new Result(runtimeException.getErrorCode(), runtimeException.getMessage());
    }

    static Result error(int code, String message) {
        return new Result(code, message);
    }

    static Result error(FrameworkBusinessExceptionCode requestWayError) {
        return new Result(requestWayError.getCode(), requestWayError.getMessage());
    }
}
