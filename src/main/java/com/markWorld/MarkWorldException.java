package com.markWorld;

import com.markWorld.entity.MarkWorldExceptionEnum;
import lombok.Getter;

@Getter
public class MarkWorldException extends RuntimeException{

    private MarkWorldExceptionEnum markWorldExceptionEnum;

    public MarkWorldException(MarkWorldExceptionEnum markWorldExceptionEnum) {
        MarkWorldExceptionEnum markWorldExceptionEnum1 = markWorldExceptionEnum;
    }
}
