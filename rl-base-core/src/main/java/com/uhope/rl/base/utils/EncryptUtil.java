package com.uhope.rl.base.utils;

import sun.misc.BASE64Decoder;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * 加密类，默认使用SHA-256加盐加密
 *
 * @author xiepuyao
 * @date Created on 2017/12/19
 */
public class EncryptUtil {
    /**
     * 定义加密方式
     */
    private final static String KEY_SHA256 = "SHA-256";
    private final static String KEY_SHA1 = "SHA-1";
    private final static String SALT = "!@#";

    /**
     * 对字符串加密,加密算法使用MD5,SHA-1,SHA-256,默认使用SHA-256
     *
     * @param strSrc  要加密的字符串
     * @param encName 加密类型  MD5,SHA-1,SHA-256
     * @return
     */
    public static String encrypt(String strSrc, String encName) {
        MessageDigest md = null;
        String strDes = null;

        byte[] bt = strSrc.getBytes();
        try {
            if (encName == null || encName.equals("")) {
                encName = KEY_SHA256;
            }
            md = MessageDigest.getInstance(encName);
            md.update(bt);
            strDes = bytes2Hex(md.digest());
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
        return strDes.toUpperCase();
    }

    /**
     * 使用SHA-256加密且加盐
     *
     * @param strSrc
     * @return
     */
    public static String encryptWithSHA256(String strSrc) {
        return encrypt(strSrc + SALT, KEY_SHA256);

    }

    /**
     * 使用SHA-1加密，河长制用户密码加密时使用
     * 规则:encryptWithSHA1(username().trim().toUpperCase().concat(password))
     *
     * @param strSrc
     * @return
     */
    public static String encryptWithSHA1(String strSrc) {
        return encrypt(strSrc, KEY_SHA1);

    }

    private static String bytes2Hex(byte[] bts) {
        String des = "";
        String tmp = null;
        for (int i = 0; i < bts.length; i++) {
            tmp = (Integer.toHexString(bts[i] & 0xFF));
            if (tmp.length() == 1) {
                des += "0";
            }
            des += tmp;
        }
        return des;
    }

    public static String decodeBase64(String str) {
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] b = null;
        String result = null;
        try {
            b = decoder.decodeBuffer(str);
            result = new String(b, Charset.forName("UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
