package com.markWorld.globalExceptionHandler;

import com.markWorld.MarkWorldException;
import com.markWorld.entity.MarkWorldExceptionEnum;
import com.markWorld.entity.ResultResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = MarkWorldException.class)
    public ResultResponse MarkWorldExceptionHandler (MarkWorldException e){
        MarkWorldExceptionEnum markWorldExceptionEnum = e.getMarkWorldExceptionEnum();
        return ResultResponse.fail(markWorldExceptionEnum);
    }

    @ExceptionHandler(Exception.class)
    public ResultResponse exceptionHandler(Exception e){
       return ResultResponse.fail();
    }
}
