package com.shenjinxiang.jkit;

import com.shenjinxiang.jkit.kit.FileKit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Start {

    private static Logger log = LoggerFactory.getLogger(Start.class);

    public static void main(String[] args) {
        if (null != args && args.length > 0) {
            if ("fileHex".equals(args[0])) {
                FileKit.toHexStr(args[1]);
            }
        }
    }
}
