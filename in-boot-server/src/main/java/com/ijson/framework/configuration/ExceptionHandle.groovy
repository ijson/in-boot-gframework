package com.ijson.framework.configuration

import com.ijson.framework.exception.FrameworkBusinessException
import com.ijson.framework.exception.FrameworkBusinessExceptionCode
import com.ijson.framework.model.Result
import lombok.extern.slf4j.Slf4j
import org.springframework.web.HttpRequestMethodNotSupportedException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody

/**
 * desc:
 * version: 6.7
 * Created by cuiyongxu on 2019/10/30 11:57 PM
 */
@Slf4j
@ControllerAdvice
class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    Result handle(Exception e) {
        if (e instanceof FrameworkBusinessException) {
            FrameworkBusinessException blogBusinessException = (FrameworkBusinessException) e;
            return Result1.error(blogBusinessException);
        } else if (e instanceof HttpRequestMethodNotSupportedException) {
            return Result1.error(FrameworkBusinessExceptionCode.REQUEST_WAY_ERROR);
        } else {
            log.error("【系统异常】{}", e);
            return Result1.error(FrameworkBusinessExceptionCode.SYSTEM_ERROR);
        }
    }
}
