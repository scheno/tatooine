package com.schening.tatooine.common.config;

import com.schening.tatooine.common.ApiException;
import com.schening.tatooine.common.base.Response;
import com.schening.tatooine.common.constant.ResultCode;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author shenchen
 * @version 1.0
 * @date 2022/6/21 16:15
 */
@RestControllerAdvice
public class ControllerExceptionAdvice {

    @ExceptionHandler({BindException.class})
    public Response<String> MethodArgumentNotValidExceptionHandler(BindException e) {
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        return new Response(ResultCode.VALIDATE_ERROR.getCode(), ResultCode.VALIDATE_ERROR.getMsg(), objectError.getDefaultMessage());
    }

    @ExceptionHandler(ApiException.class)
    public Response<String> APIExceptionHandler(ApiException e) {
        // log.error(e.getMessage(), e); 由于还没集成日志框架，暂且放着，写上TODO
        return new Response(e.getCode(), e.getMsg(), e.getMessage());
    }

}
