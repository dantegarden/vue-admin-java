package com.lmxdawn.admin.utils;

import org.springframework.util.DigestUtils;

/**
 * 密码相关的工具类
 */
public class PasswordUtil {

    public static String authAdminPwd(String pwd) {
        return DigestUtils.md5DigestAsHex(DigestUtils.md5DigestAsHex(pwd.getBytes()).getBytes());
    }

}