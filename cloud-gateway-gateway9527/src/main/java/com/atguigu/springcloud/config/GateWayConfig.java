package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author：cwh
 * @Date: 2021/3/3 9:19
 */
@Configuration
public class GateWayConfig {

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
//        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
//
//        routes.route("path_route_atguigu",
//                r -> r.path("/guonei")
//                        .uri("http://news.baidu.com/guonei")).build();
//
//        return routes.build();
//    }

}
