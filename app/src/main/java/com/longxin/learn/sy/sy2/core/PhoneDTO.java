package com.longxin.learn.sy.sy2.core;

/**
 * @author Long
 * @version 1.0
 * @description:
 * @remarks:
 * @title PhoneDTO
 * @date 2021/3/17 13:44
 */
public class PhoneDTO {
    private String name;        //联系人姓名
    private String telPhone;    //电话号码

    public PhoneDTO(String name, String telPhone) {
        this.name = name;
        this.telPhone = telPhone;
    }

    public String getName() {
        return name;
    }

    public String getTelPhone() {
        return telPhone;
    }
}
