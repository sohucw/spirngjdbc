package com.mkyong.customer.model;

import java.util.Date;

/**
 * Created by baidu on 16/11/17.
 */
public class MarkList {

    private Date markTime;
    private Long totalCount;
    private Long okCount;

    public Date getMarkTime() {
        return markTime;
    }

    public void setMarkTime(Date markTime) {
        this.markTime = markTime;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getOkCount() {
        return okCount;
    }

    public void setOkCount(Long okCount) {
        this.okCount = okCount;
    }
}
