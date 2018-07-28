package com.shenjinxiang.jkit.kit;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileKitTest {

    private Logger log = LoggerFactory.getLogger(FileKitTest.class);

    @Test
    public void index() {
        String fileName = "/Users/shenjinxiang/shenjinxiang/git_xm/idea_modules/jdemo/target/classes/com/shenjinxiang/Start.class";
        FileKit.toHexStr(fileName);
    }
}
