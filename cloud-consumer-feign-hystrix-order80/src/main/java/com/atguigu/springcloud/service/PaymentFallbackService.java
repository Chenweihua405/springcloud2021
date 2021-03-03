package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author：cwh
 * @Date: 2021/2/25 16:34
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id){
        return "------ PaymentFallbackService ok";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id){
        return "----   PaymentFallbackService timeout";
    }

}
