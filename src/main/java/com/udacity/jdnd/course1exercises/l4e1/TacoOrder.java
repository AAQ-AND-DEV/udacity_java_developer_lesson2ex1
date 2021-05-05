package com.udacity.jdnd.course1exercises.l4e1;

public class TacoOrder {
    private Integer orderId;
    private Integer taco_id;
    //Could use BigDecimal, for more precision with math
    private Integer count;

    public TacoOrder(Integer orderId, Integer taco_id, Integer count) {
        this.orderId = orderId;
        this.taco_id = taco_id;
        this.count = count;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getTaco_id() {
        return taco_id;
    }

    public void setTaco_id(Integer taco_id) {
        this.taco_id = taco_id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
