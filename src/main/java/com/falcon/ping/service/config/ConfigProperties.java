package com.falcon.ping.service.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix = "service.config")
public class ConfigProperties {
    private String pongUrl;

    public String getPongUrl() {
        return pongUrl;
    }

    public void setPongUrl(String pongUrl) {
        this.pongUrl = pongUrl;
    }
}
