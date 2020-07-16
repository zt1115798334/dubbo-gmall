package com.example.gmallorderconsumer.service.impl;

import com.example.gmallorderconsumer.service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.dubbo.config.annotation.DubboReference;
import org.example.entity.UserAddress;
import org.example.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zhang
 * date: 2020/7/16 13:42
 * description:
 */
@Service
public class OrderServiceImpl implements OrderService {
    @DubboReference(stub = "com.example.gmallorderconsumer.service.sub.UserServiceStub",loadbalance = "roundrobin")
    private UserService userService;

    @HystrixCommand(fallbackMethod = "hello")
    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println( "用户id : " + userId );
        //查询用户地址
        return userService.getUserAddressList( userId );
    }

    public List<UserAddress> hello(String userId) {
        return Arrays.asList( new UserAddress( 3, "出错地址", "1", "出错", "出错" ) );
    }

}
