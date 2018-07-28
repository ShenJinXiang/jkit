package com.shenjinxiang.jkit.kit;

import com.shenjinxiang.jkit.entity.StrSp;

public class StrKit {

    public static boolean isBlank(String str) {
        return null == str || "".equals(str);
    }

    public static String insertStr(String str, StrSp ... sps) {
        char[] chars = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            stringBuffer.append(chars[i]);
            for (StrSp sp : sps) {
                if ((i + 1) % sp.getNum() == 0) {
                    stringBuffer.append(sp.getStr());
                }
            }
        }
        return stringBuffer.toString();
    }
}
