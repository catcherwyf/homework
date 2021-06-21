package com.catcher.springJDBC.dataSource;

import com.catcher.springJDBC.dataSource.constant.DataSourcesType;
import com.catcher.springJDBC.dataSource.model.OrderInfo;
import com.catcher.springJDBC.dataSource.service.OrderService;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;

@SpringBootTest
class OrderServiceTests {

    @Autowired
    OrderService orderService;

    @Test
    void getOrderInfoById() throws SQLException {
        OrderInfo orderInfo = orderService.getOrderInfoById((long) 1);
        System.out.println(orderInfo.toString());
    }

    @Test
    void update() throws SQLException {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrder_num("test");
        orderInfo.setUser_id((long) 12);
        orderInfo.setConsignee("test");
        orderInfo.setAddress("test");
        orderInfo.setPhone("18888888");
        orderService.saveOrderInfo(orderInfo);
    }

    @Test
    void getOrderInfoByOrderId() throws SQLException {
        OrderInfo orderInfo = orderService.getOrderInfoByOrderId((long) 3);
        System.out.println(orderInfo.getAddress());
    }

}
