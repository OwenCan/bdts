package com.critc.plat.util.page;

import com.critc.plat.util.global.GlobalConst;

/**
 * @Description 分页工具
 * @Auther Owen Zhao
 * @Date 16:10 2017/11/8
 */
public class PageUtil {

    /**
     * 生成mysql分页查询语句
     *
     * @param sql
     * @param pageIndex
     * @param pageSize
     * @return
     */
    public static String createMysqlPageSql(String sql, int pageIndex, int pageSize) {
        return sql += " limit " + (pageIndex - 1) * pageSize + "," + pageSize;
    }

    /**
     * 生成mysql分页查询语句
     *
     * @param sql
     * @param pageIndex
     * @return
     */
    public static String createMysqlPageSql(String sql, int pageIndex) {
        return sql += " limit " + (pageIndex - 1) * GlobalConst.PAGESIZE + "," + GlobalConst.PAGESIZE;
    }
}
