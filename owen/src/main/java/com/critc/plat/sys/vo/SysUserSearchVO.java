package com.critc.plat.sys.vo;

import com.critc.plat.util.page.PageSearchVO;

/**
 *
 */
public class SysUserSearchVO extends PageSearchVO{

    private String username;
    private String status;
    private Integer roleId;
    private String realname;

    /*模糊查询*/
    public String getRealnameStr(){
        return "%"+realname+"%";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    @Override
    public String toString() {
        return "SysUserSearchVO{" +
                "username='" + username + '\'' +
                ", status='" + status + '\'' +
                ", roleId=" + roleId +
                ", realname='" + realname + '\'' +
                '}';
    }
}
