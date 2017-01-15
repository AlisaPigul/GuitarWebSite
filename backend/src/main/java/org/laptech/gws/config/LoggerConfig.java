package org.laptech.gws.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author rlapin
 */
@Configuration
public class LoggerConfig {
    @Bean
    public org.slf4j.Logger logger(){
        return LoggerFactory.getLogger("application");
    }
}
