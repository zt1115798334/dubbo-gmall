package com.example.gmallorderconsumer.service.sub;

import org.apache.dubbo.common.utils.StringUtils;
import org.example.entity.UserAddress;
import org.example.service.UserService;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zhang
 * date: 2020/7/16 14:13
 * description:
 */
public class UserServiceStub implements UserService {

    private final UserService userService;

    // 构造函数传入真正的远程代理对象
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceStub ...");
        // 此代码在客户端执行, 你可以在客户端做ThreadLocal本地缓存，或预先验证参数是否合法，等等
        if (!StringUtils.isEmpty( userId )) {
            return userService.getUserAddressList( userId );
        }

        // 你可以容错，可以做任何AOP拦截事项
        return null;
    }
}
