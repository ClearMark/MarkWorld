package com.markWorld.controller.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public enum ResultResponseEnum {
    SUCCESS(200, "success"),
    ERROR(500, "error")
    ;
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private String msg;
}
