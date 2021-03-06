package com.lenovo.feizai.util;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author Miracle Luna
 * @version 1.0
 * @date 2019/7/3 18:55
 */
public class Base64Util {

    final static Base64.Encoder encoder = Base64.getEncoder();
    final static Base64.Decoder decoder = Base64.getDecoder();

    /**
     * 给字符串加密
     * @param text
     * @return
     */
    public static String encode(String text) {
//        byte[] textByte = text.getBytes(StandardCharsets.UTF_8);
//        String encodedText = encoder.encodeToString(textByte);
//        return encodedText;
        return encoder.encodeToString(text.getBytes(StandardCharsets.UTF_8));
    }

    /**
     * 将加密后的字符串进行解密
     * @param encodedText
     * @return
     */
    public static String decode(String encodedText) {
        return new String(decoder.decode(encodedText), StandardCharsets.UTF_8);
    }

//    public static void main(String[] args) {
//
//        String username = "123456789";
//        String password = "123456";
//
//        // 加密
//        System.out.println("====  [加密后] 用户名/密码  =====");
//        System.out.println(Base64Util.encode(username));
//        System.out.println(Base64Util.encode(password));
//
//        // 解密
//        System.out.println("\n====  [解密后] 用户名/密码  =====");
//        System.out.println(Base64Util.decode(Base64Util.encode(username)));
//        System.out.println(Base64Util.decode(Base64Util.encode(password)));
//    }
}
