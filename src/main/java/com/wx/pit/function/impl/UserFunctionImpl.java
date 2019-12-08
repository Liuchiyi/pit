package com.wx.pit.function.impl;

import com.wx.common.ThisSystemException;
import static com.wx.common.AssertThrowUtil.*;
import com.wx.pit.dao.UserDao;
import com.wx.pit.entity.UserEntity;
import com.wx.pit.function.UserFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserFunctionImpl implements UserFunction {
    @Autowired
    UserDao udao;
    @Override
    public UserEntity login(String account, String password) throws Exception {
       /*if (account==null||account.trim().length()==0){
       throw new ThisSystemException("账户不能为空");
}*/
        account=$("账号不能为空",account);
        password=$("密码不能为空",password);

        UserEntity u=udao.select("account",account);
     if (u==null){
    throw  new  ThisSystemException("账户不存在");
     }
    if(!u.getPassword().equals(password)){
    throw  new  ThisSystemException("密码错误");
    }
        return u;
    }

    @Override
    public UserEntity updatePassword(String id,String oldPassword, String newPassword, String newPasswordConfirm)
            throws Exception {
        //验证参数
        id=$("id不能为空",id);
        oldPassword=$("旧密码必须填写！",oldPassword);
        newPassword=$("新密码必须填写！",newPassword);
        newPasswordConfirm=$("新密码必须确认填写！",newPasswordConfirm);
       assertNotEquals("新密码和旧密码不能一致",oldPassword,newPassword);
        assertEquals("两次密码不一致",newPassword,newPasswordConfirm);
        //2找到用户
        UserEntity u=udao.select("id",id);
        /*
        if (u==null){
       throw new ThisSystemException("无法找到用户");
        }*/
        assertNotNull("无法找到用户",u);
       //3验证旧密码

        assertEquals("旧密码不正确",u.getPassword(),oldPassword);
       //4更新密码
        u.setPassword(newPassword);
        udao.update(u);
        return u;
    }
}
