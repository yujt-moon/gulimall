package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1、整合 mybatis-plus
 *      1）、导入依赖
 *      2）、配置
 *          1、配置数据源
 *              1）导入数据库驱动
 *              2）在 application.yml 中配置数据源相关信息
 *          2、配置 mybatis-plus
 *              1）、使用 @MapperScan
 *              2）、设置sql文件位置
 */
@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
