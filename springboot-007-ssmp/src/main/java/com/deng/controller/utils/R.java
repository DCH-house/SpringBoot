package com.deng.controller.utils;

import lombok.Data;

@Data
public class R {
    private boolean flag;
    private Object data;
    private String msg;
    private Integer total;//专门为分页操作定义的变量，代表数据总量

    public R(){}

    public R(boolean flag){
        this.flag = flag;
    }

    public R(boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }

    public R(boolean flag,String msg){
        this.flag = flag;
        this.msg = msg;
    }

    public R(boolean flag,Integer total,Object data){
        this.flag = flag;
        this.total = total;
        this.data = data;
    }

    public R(String msg){
        this.flag = false;
        this.msg = msg;
    }
}
