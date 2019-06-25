package com.mfs.base;

public class BaseQuery {
    /**
     * 分页页码
     */
    private int pageNum=1;
    
    /**
     * 每页记录数
     */
    private int pageSize=10;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
