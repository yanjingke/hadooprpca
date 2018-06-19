package com.itcast.login;

import com.itcast.login.service.UserLoginService;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;


import java.io.IOException;
import java.net.InetSocketAddress;;


public class UserLoginAction {
    public static void main(String[] args) throws IOException {
        UserLoginService userLoginService = RPC.getProxy(UserLoginService.class, 100L, new InetSocketAddress("localhost", 9999), new Configuration());
       String login= userLoginService.login("sdsadsa","sdsdsadsa");
       System.out.println(login);
    }
}
