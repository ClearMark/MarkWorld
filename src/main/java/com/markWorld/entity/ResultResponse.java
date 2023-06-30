package com.markWorld.entity;

import lombok.Data;

@Data
public class ResultResponse {
    //状态码
    private Integer code;
    //提示信息
    private String msg;
    //数据
    private Object data;
    //分页信息
    private page pageInfo;

    public static ResultResponse ok(){
        ResultResponse ok = ok(ResultResponseEnum.SUCCESS);
        return ok;
    }
    public static ResultResponse ok(Object data){
        ResultResponse ok = ok(ResultResponseEnum.SUCCESS);
        ok.setData(data);
        return ok;
    }
    public static ResultResponse ok(ResultResponseEnum resultResponseEnum) {
        ResultResponse resultResponse = new ResultResponse();
        resultResponse.setCode(resultResponseEnum.getCode());
        resultResponse.setMsg(resultResponseEnum.getMsg());
        return resultResponse;
    }




}
class page{
    private Integer page;
    private Integer size;
    private Integer total;
}
