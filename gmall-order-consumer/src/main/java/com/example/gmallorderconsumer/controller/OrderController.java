package com.example.gmallorderconsumer.controller;

import com.example.gmallorderconsumer.service.OrderService;
import org.example.entity.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zhang
 * date: 2020/7/16 13:44
 * description:
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("userId") String userId) {
        return orderService.initOrder(userId);
    }
}
