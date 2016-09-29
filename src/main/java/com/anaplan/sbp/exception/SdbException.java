package com.anaplan.sbp.exception;


public class SdbException extends RuntimeException {

    private String errorCode = "-1";

    public SdbException() {
    }

    public SdbException(final String message) {
        super(message);
    }

    public SdbException(final String errorCode, final String message, final Throwable th) {
        super(message, th);
        this.errorCode = errorCode;
    }

    public SdbException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public SdbException(final Throwable cause) {
        super(cause);
    }

    public SdbException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public String getErrorCode() {
        return errorCode;
    }

}
