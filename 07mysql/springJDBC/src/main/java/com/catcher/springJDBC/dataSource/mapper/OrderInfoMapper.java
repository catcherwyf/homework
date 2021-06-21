package com.catcher.springJDBC.dataSource.mapper;

import com.catcher.springJDBC.dataSource.model.OrderInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;

import java.util.List;
@Mapper
public interface OrderInfoMapper {
    int deleteByPrimaryKey(Long order_id);

    int insert(OrderInfo record);

    OrderInfo selectByPrimaryKey(Long order_id);

    List<OrderInfo> selectAll();

    int updateByPrimaryKey(OrderInfo record);
}