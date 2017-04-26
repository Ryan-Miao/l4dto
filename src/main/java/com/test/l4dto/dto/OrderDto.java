package com.test.l4dto.dto;

import java.util.Date;

/**
 * Created by Ryan on 2017/4/26.
 */
public class OrderDto {
    private int no;
    private String id;

    private Date createDate;
    private String comment;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "no=" + no +
                ", id='" + id + '\'' +
                ", createDate=" + createDate +
                ", comment='" + comment + '\'' +
                '}';
    }
}
