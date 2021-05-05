package com.udacity.jdnd.course1exercises.l4e1.mapper;

import com.udacity.jdnd.course1exercises.l4e1.Delivery;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DeliveryMapper {
    @Select("SELECT * FROM DELIVERIES WHERE id=#{id}")
    Delivery getDelivery(int id);

    @Insert("INSERT into DELIVERIES(orderId, time) " + "Values(#{orderId}, #{time}")
    @Options(useGeneratedKeys=true, keyProperty="id")
    int insertDelivery(Delivery delivery);

    @Delete("DELETE from DELIVERIES WHERE id=#{id}")
    void deleteDelivery(int id);
}

