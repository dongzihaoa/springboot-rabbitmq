package com.dzh.springbootrabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * work模式的消费者 一个生产者 p 对应多个消费者 c
 */
@Component
public class WorkConsumer {

    @RabbitListener(queuesToDeclare = @Queue(value = "woek", durable = "false"))
    public void consumer01(String msg) {
        System.out.println("consumer01的消费的消息：" + msg);
    }

    @RabbitListener(queuesToDeclare = @Queue(value = "work", durable = "false"))
    public void consumer02(String msg) {
        System.out.println("consumer02消费的消息是:" + msg);
    }
}
