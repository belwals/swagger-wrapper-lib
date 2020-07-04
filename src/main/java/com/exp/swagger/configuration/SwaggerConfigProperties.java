package com.exp.swagger.configuration;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "swagger.wrapper")
@Getter
@Setter
@EqualsAndHashCode
public class SwaggerConfigProperties {
    private boolean enabled;
    private String appName;
    private String appDescription;
    private String appVersion;
    private String teamName;
    private String teamWiki;
    private String teamEmail;
    private String basePackage = "";
}
