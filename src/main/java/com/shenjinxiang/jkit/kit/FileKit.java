package com.shenjinxiang.jkit.kit;

import com.shenjinxiang.jkit.entity.StrSp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileKit {

    private static Logger log = LoggerFactory.getLogger(FileKit.class);

    public static void toHexStr(String fileName) {
        File file = new File(fileName);
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            byte[] buff = new byte[1024 * 2];
            int len;
            StringBuilder stringBuilder = new StringBuilder();
            while ((len = inputStream.read(buff)) > 0) {
                for (int i = 0; i < len; i++) {
                    stringBuilder.append(convertByte2Hex(buff[i]));
                }
            }
            String str = stringBuilder.toString();
            StrSp sp1 = new StrSp(2, " ");
            StrSp sp2 = new StrSp(64, "\n");
            str = StrKit.insertStr(str, sp1, sp2);
            log.info(str);
        } catch (Exception e) {
            log.error(e.getMessage());
        } finally {
            if (null != inputStream) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    log.error(e.getMessage());
                }
            }
        }
    }

    private static String convertByte2Hex(byte b) {
        String hex = "";
        try {
            int number = b & 0x00ff;
            if (number < 16) {
                hex = "0" + Integer.toHexString(number);
            } else {
                hex = Integer.toHexString(number);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return hex;
        }
    }
}
