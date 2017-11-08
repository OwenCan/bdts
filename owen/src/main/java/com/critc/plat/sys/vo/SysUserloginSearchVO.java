package com.critc.plat.sys.vo;


/**
 * 用户登录查询serverVo
 */
public class SysUserloginSearchVO
{

    private Integer userId;

    @Override
    public String toString() {
        return "SysUserloginSearchVO{" +
                "userId=" + userId +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
