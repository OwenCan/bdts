package com.critc.plat.util.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description 日志操作类
 * @Auther Owen Zhao
 * @Date 14:26 2017/11/8
 */
public class LogUtil {

    private static Logger sysLog = LoggerFactory.getLogger("sysLog");

    /**
     * 功能描述:记录系统日志
     *
     * @param str 要输出的字符串
     */
    public static void inf(String str) {
        sysLog.info(str);
    }

    /**
     * 功能描述:记录系统异常
     *
     * @param str 要输出的字符串
     */
    public static void error(String str) {
        sysLog.error(str);
    }

    /**
     * 功能描述:记录系统异常
     *
     * @param e 系统异常
     */
    public static void error(Exception e) {
        sysLog.error(e.getStackTrace().toString());
    }
}
