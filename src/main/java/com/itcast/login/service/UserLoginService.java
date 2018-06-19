package com.itcast.login.service;

public interface UserLoginService {
    public  static final  long versionID=100L;
    public String login(String name,String passwd);
}
