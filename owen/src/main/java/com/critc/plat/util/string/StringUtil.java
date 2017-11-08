package com.critc.plat.util.string;

import com.critc.plat.util.log.LogUtil;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description
 * @Auther Owen Zhao
 * @Date 14:20 2017/11/8
 */
public class StringUtil {

    /**
     * 将含有中文字符的URL，转换成中文字符
     *
     * @param url
     * @return
     */
    public static String decodeUrl(String url){
        if(url==null){
            return "";
        }
        String str = "";
        try{
            str = URLDecoder.decode(url,"UTF-8");
        }catch (UnsupportedEncodingException e){
            LogUtil.error(e);
        }
        return str;
    }

    /**
     * 把比如北京转换成%25E5%258C%2597%25E4%25BA%25AC
     *
     * @param url url字符串
     * @return string
     */
    public static String encodeUrl(String url) {
        if (url == null)
            return "";
        String str = "";
        try {
            str = URLEncoder.encode(url, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            LogUtil.error(e);
        }
        return str;
    }

    /**
     * 取字符除最后一位的子串，比如 aaa,bbb, 返回aaa,bbb，一般用在多个字段进行拼接，要去除最后一位
     *
     * @param str 字符串
     * @return string
     */
    public static String subTract(String str) {
        if (str.length() == 0)
            return "";
        else
            return str.substring(0, str.length() - 1);
    }

    /**
     * 判断字符串是null或空，null或""都返回true
     *
     * @param str 字符串
     * @return boolean
     */
    public static boolean isNullOrEmpty(String str) {
        if (str == null || str.equals(""))
            return true;
        else
            return false;
    }


    /**
     * 判断字符串不是null或空
     *
     * @param str 字符串
     * @return
     */
    public static boolean isNotNullOrEmpty(String str) {
        if (str != null && !str.equals(""))
            return true;
        else
            return false;
    }

    /**
     * 判断是否是ajax请求，用于进行权限控制或或者异常处理，得判断是否是ajax请求
     * @param request
     * @return
     */
    public static boolean checkAjaxRequst(HttpServletRequest request){
        String requestType = request.getHeader("X-Requested-With");
        if (requestType != null && requestType.equalsIgnoreCase("XMLHttpRequest")) {
            return true;
        } else{
            return false;
        }
    }

    /**
     * 获取客户端请求的ip地址，可以跳过代理等直接获取
     * @param request
     * @return
     */
    public static String getIp(HttpServletRequest request){
        String szClientIp = request.getHeader("X-forwarded-for");
        if(szClientIp == null || szClientIp.length() == 0 || "unknown".equalsIgnoreCase(szClientIp)){
            szClientIp = request.getHeader("Proxy-Client-IP");
        }
        if(szClientIp == null || szClientIp.length() == 0 || "unknown".equalsIgnoreCase(szClientIp)){
            szClientIp = request.getHeader("WL-Proxy-Client-IP");
        }
        if(szClientIp == null || szClientIp.length() == 0 || "unknown".equalsIgnoreCase(    szClientIp)){
            szClientIp = request.getRemoteAddr();
        }
        return szClientIp;
    }

    /**
     * 过滤表情，因为数据库不识别
     * @param source
     * @return
     */
    public static String filterEmoji(String source){
        if(StringUtil.isNotNullOrEmpty(source)){
            return source.replaceAll("[\\ud800\\udc00-\\udbff\\udfff\\ud800-\\udfff]", "*");
        }else{
            return source;
        }
    }

    /**
     * 获取url地址，整个请求地址，不包含?后面的参数信息，如果最后一位后缀为#，去掉
     *
     * @param request 请求
     * @return url地址
     */
    public static String getUrlPath(HttpServletRequest request) {
        String url;
        if (request.getServerPort() == 80) {
            url = request.getScheme() + "://" + request.getServerName() + request.getRequestURI();
        } else {
            url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getRequestURI();
        }
        if (url.contains("#")) {
            url = url.substring(0, url.indexOf("#"));
        }
        return url;
    }

    /**
     * 判断是否是手机号
     * @param mobile
     * @return
     */
    public static boolean isMobile(String mobile){
        Pattern pattern = Pattern.compile("^1[3-9]\\\\d{9}$");//兰姆达表达式
        Matcher matcher = pattern.matcher(mobile);
        boolean b = matcher.matches();
        return b;
    }

    /**
     * 获取Request的参数，并将其"Key=Value&Key=Value"的格式返回
     *
     * @param request
     * @return
     */
    public static String getOperaParams(HttpServletRequest request){
        String parameters = "";
        Map<String,String[]> map = request.getParameterMap();
        Object[] obj = null;
        obj = map.keySet().toArray();
        for(int i = 0;i<obj.length;i++){
            parameters += obj[i].toString() + "=" +request.getParameter(obj[i].toString());
        }
        return parameters;
    }
}
