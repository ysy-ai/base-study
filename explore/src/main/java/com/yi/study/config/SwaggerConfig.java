package com.yi.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration //声明该类为配置类
@EnableSwagger2 //声明启动Swagger2

public class SwaggerConfig {
    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("swagger").apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.yi.study.controller"))//扫描的包路径
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("swagger功能接口")//文档说明
                .version("1.0.0")//文档版本说明
                .termsOfServiceUrl("http://127.0.0.1:8888/swagger-ui.html") // swagger地址
                .build();
    }


    @Bean
    public Docket customDocket1() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("swagger1").apiInfo(apiInfo1()).select()
                .apis(RequestHandlerSelectors.basePackage("com.yi.study.controller"))//扫描的包路径
                .build();
    }

    private ApiInfo apiInfo1() {
        return new ApiInfoBuilder().title("swagger1功能接口")//文档说明
                .version("1.0.0")//文档版本说明
                .termsOfServiceUrl("http://127.0.0.1:8888/swagger-ui.html") // swagger地址
                .build();
    }
}