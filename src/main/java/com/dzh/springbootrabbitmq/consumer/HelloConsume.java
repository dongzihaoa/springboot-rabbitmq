package com.dzh.springbootrabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class HelloConsume {

    @RabbitListener(queues = "simpleQueue")
    public void consumer(String msg){
        System.out.println("消费者收到的消息是:" + msg);
    }

}
