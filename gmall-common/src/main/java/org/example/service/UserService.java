package org.example.service;

import org.example.entity.UserAddress;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zhang
 * date: 2020/7/16 13:20
 * description:
 */
public interface UserService {
    List<UserAddress> getUserAddressList(String userId);
}
