package com.wyb.muchi.blog.domain.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {
        private String code;

        private String msg;

        private Object data;

        public static Result success(Object data){
            Result m=new Result();
            m.setCode("0");
            m.setData(data);
            m.setMsg("运行成功");
            return  m;
        }
        public static Result success(String message,Object data){
            Result m=new Result();
            m.setCode("0");
            m.setData(data);
            m.setMsg(message);
            return  m;
        }
        public static  Result fail(String msg){
            Result m=new Result();
            m.setCode("-1");
            m.setData(null);
            m.setMsg(msg);
            return  m;
        }
    public static  Result fail(String msg,Object data){
        Result m=new Result();
        m.setCode("-1");
        m.setData(data);
        m.setMsg(msg);
        return  m;
    }


}
