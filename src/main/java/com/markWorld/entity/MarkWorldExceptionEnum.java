package com.markWorld.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MarkWorldExceptionEnum {
    ADD_FAIL(500, "添加失败"),
    ;
    private Integer code;
    private String msg;
}
