package com.wyb.muchi.blog.support;

import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * 分页列表
 *
 * @author xiongfang
 * @version 1.0
 * @date 2018年2月8日
 * @time 上午9:40:21
 * @since JDK 1.8
 */
public class PageList<T> {

    /**
     * 结果集
     */
    private List<T> rows;

    /**
     * 总数
     */
    private long total;

    public PageList(Page<T> page) {
        this.rows = page.getRecords();
        this.total = page.getTotal();
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

}
