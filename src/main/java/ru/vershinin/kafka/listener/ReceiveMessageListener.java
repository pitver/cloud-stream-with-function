package ru.vershinin.kafka.listener;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ReceiveMessageListener {

    /*@Bean()
    public Consumer<String> consumer1() {
        return (message) -> {
            System.out.println("Топик 1: " + message);
        };
    }

    @Bean()
    public Consumer<String> consumer2() {
        return (message) -> {
            System.out.println("Топик 2: " + message);
        };
    }
    @Bean()
    public Consumer<String> consumer3() {
        return (message) -> {
            System.out.println("Топик 3: " + message);
        };
    }*/

    @Bean
    public Function<String, String> consumer1() {
        return value -> {
            System.out.println(value);
            // Ваш код обработки сообщений для топика 1
            return value;
        };
    }

    @Bean
    public Function<String, String> consumer2() {
        return value -> {
            System.out.println(value);
            // Ваш код обработки сообщений для топика 2
            return value;
        };
    }

}
