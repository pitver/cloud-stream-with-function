package ru.vershinin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
public class StreamListenerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamListenerApplication.class, args);
    }

}
