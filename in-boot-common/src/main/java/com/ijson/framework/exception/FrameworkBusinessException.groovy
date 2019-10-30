package com.ijson.framework.exception

/**
 * desc:
 * version: 6.7
 * Created by cuiyongxu on 2019/10/31 12:03 AM
 */
class FrameworkBusinessException extends FrameworkRuntimeException {


    FrameworkBusinessException(FrameworkBusinessExceptionCode code, String extensionMessage) {
        super(code.getCode(), extensionMessage);
    }

    FrameworkBusinessException(Integer code, String extensionMessage) {
        super(code, extensionMessage);
    }

    FrameworkBusinessException(FrameworkBusinessExceptionCode code) {
        super(code.getCode(), code.getMessage());
    }
}
