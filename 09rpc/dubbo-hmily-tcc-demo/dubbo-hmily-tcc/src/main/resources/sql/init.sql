drop table if exists mall;

create table if not exists account (
    `id` int(11) NOT NULL,
    `user_id` varchar(64) not null ,
    `us_amount` decimal(16,4) not null,
    `cn_amount` decimal(16,4) not null,
    `create_time` Date,
    `update_time` Date,
    primary key (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='账户信息表';