package com.example.gmalluserprovider.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.entity.UserAddress;
import org.example.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zhang
 * date: 2020/7/16 13:38
 * description:
 */
@DubboService(timeout = 300, retries = 3, loadbalance = "roundrobin")
@Component
public class UserServiceImpl implements UserService {

    @HystrixCommand
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        List<UserAddress> list = new ArrayList<>();
        UserAddress address1 = new UserAddress(1, "上海市杨浦区xxx路xxx号", "1", "王某某", "0");
        UserAddress address2 = new UserAddress(2, "上海市徐汇区xxx路xxx号", "1", "张某某", "1");

        list.add(address1);
        list.add(address2);

        //构造不定期访问错误
        if (Math.random() > 0.5) {
            throw new RuntimeException();
        }

        return list;
    }
}
