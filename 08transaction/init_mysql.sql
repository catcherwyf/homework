CREATE DATABASE mall_ds_0;
create DATABASE mall_ds_1;

DROP TABLE IF EXISTS order_info;

CREATE TABLE IF NOT EXISTS order_info(
    order_id BIGINT AUTO_INCREMENT NOT NULL COMMENT '订单id',
    order_num VARCHAR(50) NOT NULL COMMENT '订单号',
    user_id BIGINT NOT NULL COMMENT '用户id',
    consignee VARCHAR(40) NOT NULL COMMENT '收货人',
    address VARCHAR(200) NOT NULL COMMENT '收货地址',
    phone VARCHAR(13) NOT NULL COMMENT '收货人联系方式',
    pay_way VARCHAR(30) COMMENT '支付方式',
    card_id VARCHAR(30) COMMENT '支付卡号',
    pay_amount DECIMAL(16,2) COMMENT '支付金额',
    order_amount DECIMAL(16,2) COMMENT '订单金额',
    discount_amount DECIMAL(16,2) COMMENT '优惠金额',
    order_time TIMESTAMP COMMENT '下单时间',
    pay_time TIMESTAMP COMMENT '支付时间',
    delivery_time TIMESTAMP COMMENT '发货时间',
    receipt_time TIMESTAMP COMMENT '收货时间',
    status VARCHAR(10) COMMENT '订单状态',
    remark VARCHAR(200) COMMENT '备注',
    PRIMARY KEY (order_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='订单信息表';


INSERT INTO sharding_db.order_info (order_num,user_id,consignee,address,phone) VALUES 
('ORDER2',2,'发送2','地址2','2'),('ORDER1',1,'发送1','地址1','1'),
('ORDER1',1,'发送1','地址1','1'),('ORDER1',1,'发送1','地址1','1'),
('ORDER1',1,'发送1','地址1','1'),('ORDER1',1,'发送1','地址1','1')
;

DELETE from sharding_db.order_info WHERE order_id=1;

SELECT * FROM sharding_db.order_info where user_id=2;

UPDATE sharding_db.order_info set address='test_upate' where phone='2';




