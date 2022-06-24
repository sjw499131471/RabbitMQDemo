package com.sjw.rabbitmq.service;

import java.util.Map;

public interface RabbitMQService {
    public String sendMsg(String msg) throws Exception;
    public String sendMsgByFanoutExchange(String msg) throws Exception;
    public String sendMsgByTopicExchange(String msg, String routingKey) throws Exception;
    public String sendMsgByHeadersExchange(String msg, Map<String, Object> map) throws Exception;
}
