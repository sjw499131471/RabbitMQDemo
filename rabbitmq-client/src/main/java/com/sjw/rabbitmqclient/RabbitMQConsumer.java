package com.sjw.rabbitmqclient;

import com.sjw.rabbitmqclient.config.RabbitMQConst;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
//@RabbitListener(queues = {RabbitMQConfig.RABBITMQ_DEMO_TOPIC})//可添加多个队列
@RabbitListener(queuesToDeclare = @Queue(RabbitMQConst.DIRECT_QUEUE_NAME))//queuesToDeclare可以避免找不到队列的错误，自动创建队列
public class RabbitMQConsumer {
    @RabbitHandler
    public void process(Map map){
        System.out.println("收到RABBITMQ_DEMO_TOPIC的消息："+map.toString());
    }
}
