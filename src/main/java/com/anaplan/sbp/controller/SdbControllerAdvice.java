package com.anaplan.sbp.controller;


import com.anaplan.sbp.exception.SdbException;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class SdbControllerAdvice {

    static final Logger logger = Logger.getLogger(BatchController.class);

    @ExceptionHandler(SdbException.class)
    @ResponseBody
    public Error handleException(final SdbException ex) {
        final Error response = new Error(ex.getErrorCode(), ex.getMessage());
        logger.debug(response);
        return response;
    }
}
