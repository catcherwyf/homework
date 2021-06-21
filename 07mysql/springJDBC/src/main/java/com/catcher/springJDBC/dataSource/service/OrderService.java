package com.catcher.springJDBC.dataSource.service;

import com.catcher.springJDBC.dataSource.DynamicDataSourceContextHolder;
import com.catcher.springJDBC.dataSource.constant.DataSourcesType;
import com.catcher.springJDBC.dataSource.mapper.OrderInfoMapper;
import com.catcher.springJDBC.dataSource.model.OrderInfo;
import com.sun.tools.corba.se.idl.constExpr.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.List;
@Service
public class OrderService {

    @Autowired
    OrderInfoMapper mapper;
    @Resource
    private DataSource dataSource;

    public OrderInfo getOrderInfoById(Long order_id){
        //切换数据源
        DynamicDataSourceContextHolder.setContextKey(DataSourcesType.SLAVE);
        OrderInfo orderInfo = mapper.selectByPrimaryKey(order_id);
        //恢复数据源
        DynamicDataSourceContextHolder.removeContextKey();
        return orderInfo;
    }

    public void saveOrderInfo(OrderInfo orderInfo){
        mapper.insert(orderInfo);
    }


    public OrderInfo getOrderInfoByOrderId(Long order_id){
        OrderInfo orderInfo = mapper.selectByPrimaryKey(order_id);
        return orderInfo;
    }
}
