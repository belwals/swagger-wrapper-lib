package com.exp.swagger;

import com.exp.swagger.configuration.SwaggerConfigProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = SwaggerWrapperAutoConfiguration.class)
@ConditionalOnProperty(prefix = "swagger.wrapper", name = "enabled", havingValue = "true", matchIfMissing = false)
@EnableConfigurationProperties({SwaggerConfigProperties.class})
public class SwaggerWrapperAutoConfiguration {
}
