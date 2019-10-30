package com.ijson.framework

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.annotation.ImportResource

/**
 * desc:
 * version: 6.7
 * Created by cuiyongxu on 2019/10/30 11:53 PM
 */
@EnableCaching
@SpringBootApplication
@ImportResource(locations = ["classpath:applicationContext.xml"])
class Bootstrap {

    static void main(String[] args) {
        SpringApplication.run(Bootstrap, args)
    }
}
