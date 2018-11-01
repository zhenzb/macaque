package com.example.macaque.utils;


import com.alibaba.fastjson.JSONObject;

/**
 * @ClassName ResultJSONObject
 * @Description TODO
 * @Author yanhuo
 * @Date 2018/10/31 18:23
 * @Version 1.0
 **/
public class ResultJSONObject {

    /**
     * 结果集转json
     * @param result
     * @return
     */
    public static String success(Object result){
        JSONObject resoult = new JSONObject();
        resoult.put("code",0);
        resoult.put("msg","success");
        resoult.put("result",resoult);
        return resoult.toString();
    }
}
