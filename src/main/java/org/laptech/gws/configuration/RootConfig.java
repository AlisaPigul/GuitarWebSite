package org.laptech.gws.configuration;

import org.laptech.gws.aop.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.context.annotation.ComponentScan.*;

/**
 * @author rlapin on 12/12/16.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"org.laptech.gws"},
excludeFilters = {@Filter(type= FilterType.ANNOTATION,value = EnableWebMvc.class)})
public class RootConfig {
    @Autowired
    Logger logger;
}
