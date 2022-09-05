package com.dzh.springbootrabbitmq;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.interceptor.CacheOperationInvocationContext;

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
        rabbitTemplate.convertAndSend("smQueue", "SpringBoot发送的HiWorld");

    }

    /**
     * work模式测试
     */
    @Test
    void work() {
        for (int i = 0; i < 20; i++) {
            rabbitTemplate.convertAndSend("work", "SpringBoot发送的work消息是" + i);
        }
    }

    /**
     * 发布订阅模式的生产者
     */
    @Test
    void pubSub() {
        rabbitTemplate.convertAndSend("pubsub-exchange","","订阅模式的生产者发布的消息");
    }

}
