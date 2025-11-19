create database if not exists delta_force_emulator;

CREATE TABLE `user` (
                        `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                        `username` VARCHAR(30) NOT NULL COMMENT '用户名',
                        `password` VARCHAR(100) NOT NULL COMMENT '密码',
                        `create_time` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                        PRIMARY KEY (`id`),
                        UNIQUE KEY `uk_username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';