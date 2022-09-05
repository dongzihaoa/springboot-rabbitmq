package com.dzh.springbootrabbitmq;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpringbootRabbitmqApplicationTests {

    @Resource
    RabbitTemplate rabbitTemplate;

    @Test
    void helloPublish() {
        rabbitTemplate.convertAndSend("simpleQueue", "SpringBoot发送的HelloWorld");
    }

    /**
     * 简化版测试
     */
    @Test
    void hiPublish() {
        rabbitTemplate.convertAndSend("smQueue","SpringBoot发送的HiWorld");

    }

}
