package com.sjw.rabbitmqclient;

import com.sjw.rabbitmqclient.config.RabbitMQConst;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RabbitListener(queuesToDeclare = @Queue(RabbitMQConst.TOPIC_EXCHANGE_QUEUE_B))
public class TopicExchangeConsumerB {

    @RabbitHandler
    public void process(Map<String, Object> map) {
        System.out.println("队列[" + RabbitMQConst.TOPIC_EXCHANGE_QUEUE_B+ "]收到消息：" + map.toString());
    }
}