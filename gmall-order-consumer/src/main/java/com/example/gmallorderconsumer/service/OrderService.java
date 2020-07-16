package com.example.gmallorderconsumer.service;

import org.example.entity.UserAddress;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zhang
 * date: 2020/7/16 13:41
 * description:
 */
public interface OrderService {
    List<UserAddress> initOrder(String userId);
}
