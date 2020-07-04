#swagger-wrapper-lib


------------------------------------------------------------------------------------------------------------------------

swagger-wrapper-lib is a SpringBoot based library that allows users to configure Swagger just by adding a maven dependency along with some configuration properties.

------------------------------------------------------------------------------------------------------------------------

## Uses:

1. Add maven dependency (Get latest version of app)

        <dependency>
           <groupId>com.exp.swagger</groupId>
           <artifactId>swagger-wrapper-lib</artifactId>
           <version>1.0.0</version>
        </dependency>

2. Configure the below properties on application.yml or on .properties.
        
        swagger:
          wrapper:
            enabled: true
            basePackage: ###
            appName: ${spring.application.name}
            appDescription: ###
            appVersion: ####
            teamName: ###
            teamWiki: https://github.com
            
------------------------------------------------------------------------------------------------------------------------