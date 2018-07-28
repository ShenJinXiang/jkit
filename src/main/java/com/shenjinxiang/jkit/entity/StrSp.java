package com.shenjinxiang.jkit.entity;

public class StrSp {

    private int num;
    private String str;

    public StrSp() {
        this(1, "");
    }

    public StrSp(int num) {
        this(num, "");
    }

    public StrSp(String str) {
        this(1, str);
    }

    public StrSp(int num, String str) {
        this.num = num;
        this.str = str;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
