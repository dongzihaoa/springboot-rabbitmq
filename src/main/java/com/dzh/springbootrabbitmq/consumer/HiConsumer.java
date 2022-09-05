package com.dzh.springbootrabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class HiConsumer {

    @RabbitListener(queuesToDeclare = @Queue("smQueue"))
    public void consumer(String msg) {
        System.out.println("HiConsumer消费者收到的消息是：" + msg);
    }

}
