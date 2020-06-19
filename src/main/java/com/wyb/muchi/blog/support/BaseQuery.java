package com.wyb.muchi.blog.support;

public class BaseQuery {

    /**
     * 页码
     */
    private int pageIndex = 1;

    /**
     * 页大小
     */
    private int pageSize = 20;

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
