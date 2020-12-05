package cn.swjtu.message.service.impl;

import cn.swjtu.message.mapper.LoginMapper;
import cn.swjtu.message.model.Staff;
import cn.swjtu.message.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginMapper loginMapper;

    @Override
    public Staff login(String telephone, String password) {
        return loginMapper.login(telephone,password);
    }
}
