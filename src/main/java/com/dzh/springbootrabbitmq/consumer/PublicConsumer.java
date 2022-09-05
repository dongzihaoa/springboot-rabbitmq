package com.dzh.springbootrabbitmq.consumer;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
public class PublicConsumer {

    //绑定临时队列和交换机
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue,
            exchange = @Exchange(value = "pubsub-exchange", type = ExchangeTypes.FANOUT)))
    public void consumer01(String msg) {
        System.out.println("consumer01消费到了: " + msg);
    }

    //绑定临时队列和交换机
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue,
            exchange = @Exchange(value = "pubsub-exchange", type = ExchangeTypes.FANOUT)))
    public void consumer02(String msg) {
        System.out.println("consumer02消费到了: " + msg);
    }



}
