//package com.neueda.employee_management.Config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
////@Profile("!swagger") // Disable Swagger configuration unless 'swagger' profile is active
//public class SwaggerConfig {
//
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.neueda.employee_management.controller"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//}
////return new Docket(DocumentationType.SWAGGER_2) .select() .apis(RequestHandlerSelectors.basePackage("com.example.controller")) .paths(PathSelectors.any()) .build() .apiInfo(apiInfo());