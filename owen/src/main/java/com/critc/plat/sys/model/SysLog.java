package com.critc.plat.sys.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * 操作日志
 *
 * @author 孔垂云
 * @date 2017-06-13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysLog {
    private long id;
    private int userId;//用户id
    private Date operaDate;//操作日期
    private String operaIp;//ip地址
    private String moduleName;//模块id
    private String operaName;//操作名称
    private String operaUrl;//操作url
    private String operaParams;//参数
    private String realname;//用户姓名

}
