package com.critc.plat.sys.vo;


import com.critc.plat.util.page.PageSearchVO;

/**
 * 用户登录查询serverVo
 */
public class SysUserloginSearchVO extends PageSearchVO {

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
