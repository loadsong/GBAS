package com.service.core.configurer;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @Date： created in 15:56 2019/11/23
 */
@Configuration
public class WebSocketConfig {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

    @Bean
    public MyEndpointConfigure newConfigure() {
        return new MyEndpointConfigure();
    }
}