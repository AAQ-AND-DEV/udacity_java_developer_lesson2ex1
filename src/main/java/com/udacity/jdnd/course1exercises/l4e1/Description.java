package com.udacity.jdnd.course1exercises.l4e1;

public class Description {
    private Integer id;
    private String tacoName;
    private Double tacoPrice;

    public Description(Integer id, String tacoName, Double tacoPrice) {
        this.id = id;
        this.tacoName = tacoName;
        this.tacoPrice = tacoPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTacoName() {
        return tacoName;
    }

    public void setTacoName(String tacoName) {
        this.tacoName = tacoName;
    }

    public Double getTacoPrice() {
        return tacoPrice;
    }

    public void setTacoPrice(Double tacoPrice) {
        this.tacoPrice = tacoPrice;
    }
}
