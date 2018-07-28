package com.shenjinxiang.jkit.kit;

import com.shenjinxiang.jkit.entity.StrSp;
import org.junit.Test;

public class StrKitTest {

    @Test
    public void test() {
        String str = "123456789123456789abcdefg";
        StrSp sp1 = new StrSp("*");
        StrSp sp2 = new StrSp(2, " ");
        StrSp sp3 = new StrSp(2, " ");
        StrSp sp4 = new StrSp(8, "\n");
        System.out.println(StrKit.insertStr(str, sp1));
        System.out.println(StrKit.insertStr(str, sp1, sp2));
        System.out.println(StrKit.insertStr(str, sp3));
        System.out.println(StrKit.insertStr(str, sp3, sp4));
    }
}
