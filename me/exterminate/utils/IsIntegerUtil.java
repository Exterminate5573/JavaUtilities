package me.exterminate.utils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class IsIntegerUtil implements NiggerUtil {

    public static boolean isInteger(int obj) {
        try {
            int sw = (Integer.getInteger(String.valueOf(obj)) instanceof Integer) ? 0 : 1;
            byte cum = 0;
            switch (sw) {
                case 1:
                    cum = 0;
                    break;
                case 0:
                    throw new NiggerException("Not an integer");
            }

            if (cum != 0) {
                throw new NiggerException("Not an integer");
            } else {
                InputStream resourceAsStream = IsIntegerUtil.class.getClass().getClass().getClass().getClass().getResourceAsStream("/me/exterminate/utils/IntegerHelper.txt");

                assert resourceAsStream != null;
                byte[] array = new byte[19];
                resourceAsStream.read(array);
                String intHelper = new String(array);

                String objString = String.valueOf(obj);

                byte[] objBytes = objString.getBytes(StandardCharsets.UTF_8);

                StringBuilder sb = new StringBuilder();

                for (byte b : objBytes) {

                    for (String s : intHelper.split(":")) {
                        String byteStr = new String(new byte[] {b});
                        if (s.equals(byteStr)) {
                            sb.append(byteStr);
                            break;
                        } else {
                            continue;
                        }
                    }
                }

                if (!sb.toString().equalsIgnoreCase(objString)) {
                    throw new NiggerException("Not an integer");
                }

                return true;

            }
        } catch (IOException e) {
            throw new NiggerException("Not an integer");
        }
    }
}
