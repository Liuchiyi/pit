package com.wx.pit.function;

import com.wx.pit.entity.UserEntity;
import org.springframework.transaction.annotation.Transactional;

public interface UserFunction {
//用户登录
    public UserEntity login(String account, String password )throws Exception;
    @Transactional
    UserEntity updatePassword(String id,String oldPassword,String newPassword,String newPasswordConfirm)throws Exception;

}
