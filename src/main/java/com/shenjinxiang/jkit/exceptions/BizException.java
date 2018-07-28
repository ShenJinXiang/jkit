package com.shenjinxiang.jkit.exceptions;

public class BizException extends RuntimeException {

    private static final long serialVersionUID = 1778611900103215005L;

    public BizException(String message) {
        super(message);
    }
}
