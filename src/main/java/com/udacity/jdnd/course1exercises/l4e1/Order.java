package com.udacity.jdnd.course1exercises.l4e1;

public class Order {

    private Integer id;
    private Integer customer_id;

    public Order(int id, int customer_id) {
        this.id = id;
        this.customer_id = customer_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
}
