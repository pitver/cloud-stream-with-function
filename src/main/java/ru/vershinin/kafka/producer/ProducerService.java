package ru.vershinin.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProducerService {
    // Here directly assembles a bridge to connect Rabbit or Kafka
    @Autowired
    StreamBridge streamBridge;


    public void send() {
        String message = UUID.randomUUID().toString();

        // Consumer's parameter type is the type of Message here
        streamBridge.send("function", message + " 25");
        System.out.println("*********** Send message:" + message);
        streamBridge.send("function1", message + " 26");
        System.out.println("*********** Send message1:" + message + 26);
        streamBridge.send("function2", message + " 27");
        System.out.println("*********** Send message2:" + message + 69);

    }
}