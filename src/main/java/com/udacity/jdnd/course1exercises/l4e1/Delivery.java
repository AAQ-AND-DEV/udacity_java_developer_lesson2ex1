package com.udacity.jdnd.course1exercises.l4e1;

import java.sql.Timestamp;

public class Delivery {

    private Integer id;
    private Integer orderId;
    private Timestamp time;

    public Delivery(int id, int orderId, Timestamp time) {
        this.id = id;
        this.orderId = orderId;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
}
