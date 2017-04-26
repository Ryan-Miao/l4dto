package com.test.l4dto.model;

import java.util.Date;

/**
 * Created by Ryan on 2017/4/26.
 */
public class Order {
    private int no;
    private String id;

    private Date createDate;
    private String comment;

    public Order(int no, String id, Date createDate, String comment) {
        this.no = no;
        this.id = id;
        this.createDate = createDate;
        this.comment = comment;
    }

    public int getNo() {
        return no;
    }

    public String getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getComment() {
        return comment;
    }
}
