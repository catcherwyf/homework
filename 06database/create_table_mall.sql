CREATE DATABASE IF NOT EXISTS mall;

create TABLE IF NOT EXISTS mall.user_info(
    user_id BIGINT AUTO_INCREMENT not null COMMENT '用户id',
    user_name VARCHAR(40) NOT NULL COMMENT '姓名',
    nick_name VARCHAR(60) NOT NULL COMMENT '昵称',
    sex VARCHAR(1) COMMENT '性别',
    age INT COMMENT '年龄',
    phone VARCHAR(13) COMMENT '手机号',
    password VARCHAR(100) COMMENT '密码',
    create_time TIMESTAMP COMMENT '创建时间',
    update_time TIMESTAMP COMMENT '修改时间',
    delflag VARCHAR(1) COMMENT '删除标志',
    member_log VARCHAR(10) COMMENT '会员标志',
    PRIMARY KEY(user_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户信息表';

create TABLE IF NOT EXISTS mall.product_info(
    product_id BIGINT AUTO_INCREMENT NOT NULL COMMENT '商品id',
    product_name VARCHAR(200) NOT NULL COMMENT '商品名称',
    product_type VARCHAR(50) NOT NULL COMMENT '商品种类',
    size VARCHAR(50) COMMENT '型号/款式',
    business_id BIGINT NOT NULL COMMENT '商家id',
    business_name VARCHAR(100) COMMENT '商家名称',
    put_shelf_time TIMESTAMP COMMENT '上架时间',
    off_shelf_time TIMESTAMP COMMENT '下架时间',
    create_time TIMESTAMP COMMENT '创建时间',
    update_time TIMESTAMP COMMENT '修改时间',
    status VARCHAR(10) COMMENT '商品状态',
    original_price DECIMAL(16,2) COMMENT '原价',
    present_price DECIMAL(16,2) COMMENT '现价',
    amount BIGINT COMMENT '数量',
    PRIMARY KEY (product_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='商品信息表';

CREATE TABLE IF NOT EXISTS mall.oder_info(
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

CREATE TABLE IF NOT EXISTS mall.order_item(
    item_id BIGINT AUTO_INCREMENT NOT NULL COMMENT '订单明细id',
    order_num VARCHAR(50) NOT NULL COMMENT '订单号',
    product_id BIGINT NOT NULL COMMENT '商品id',
    user_id BIGINT NOT NULL COMMENT '买家id',
    business_id BIGINT NOT NULL COMMENT '卖家id',
    product_num INT NOT NULL COMMENT '商品数量',
    product_amount DECIMAL(16,2) COMMENT '商品金额',
    delivery_way VARCHAR(5) COMMENT '配送方式',
    delivery_time TIMESTAMP COMMENT '配送时间',
    status VARCHAR(10) COMMENT '订单状态',
    create_time TIMESTAMP COMMENT '创建时间',
    update_time TIMESTAMP COMMENT '修改时间',
    user_finish_time TIMESTAMP COMMENT '买家完成时间',
    business_finish_time TIMESTAMP COMMENT '卖家完成时间',
    PRIMARY KEY (item_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='订单明细表';

CREATE TABLE IF NOT EXISTS mall.logistic_info(
    logistic_id BIGINT AUTO_INCREMENT COMMENT '物流id',
    item_id BIGINT COMMENT '订单明细id',
    order_num VARCHAR(50) NOT NULL COMMENT '订单号',
    delivery_company VARCHAR(50) COMMENT '配送公司',
    delivery_person VARCHAR(20) COMMENT '配送人',
    delivery_time TIMESTAMP COMMENT '配送时间',
    finish_time TIMESTAMP COMMENT '完成时间',
    consigner VARCHAR(40) NOT NULL COMMENT '发货人',
    consigner_address VARCHAR(200) NOT NULL COMMENT '发货地址',
    consigner_phone VARCHAR(13) NOT NULL COMMENT '发货人联系方式',
    consignee VARCHAR(40) NOT NULL COMMENT '收货人',
    consignee_address VARCHAR(200) NOT NULL COMMENT '收货地址',
    consignee_phone VARCHAR(13) NOT NULL COMMENT '收货人联系方式',
    delivery_amount DECIMAL(16,2) COMMENT '配送费用',
    status VARCHAR(10) COMMENT '物流状态',
    PRIMARY KEY (logistic_id)
)  ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='物流信息表';
