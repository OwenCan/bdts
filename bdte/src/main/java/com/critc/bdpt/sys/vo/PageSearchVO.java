package com.critc.bdpt.sys.vo;


import com.critc.bdpt.util.global.GlobalConst;

public class PageSearchVO {

    private int pageIndex;
    private int pageSize = GlobalConst.PAGESIZE;

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
