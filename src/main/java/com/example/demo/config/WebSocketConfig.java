package com.example.demo.config;


import com.example.demo.interceptor.ChatHandshakeInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.handler.TextWebSocketHandler;

//@Configuration
//@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(chatMessageHandler(),"/webSocketServer").addInterceptors(new ChatHandshakeInterceptor());
        registry.addHandler(chatMessageHandler(), "/sockjs/webSocketServer").addInterceptors(new ChatHandshakeInterceptor()).withSockJS();
    }

    @Bean
    public TextWebSocketHandler chatMessageHandler(){
        return new ChatMessageHandler();
    }

}
