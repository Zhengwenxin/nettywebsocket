package com.websocket.demo;

import com.websocket.demo.websocket.NioWebSocketServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        new NioWebSocketServer().init();
    }

}
