package com.claranet.kafkareceiver.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessageListener {

    @KafkaListener(topics = "dummy", groupId = "dummy_group")
    public void listenStrGroupDummy(String message) {
        System.out.println("Received Message in group dummy_group: " + message);
    }
}
