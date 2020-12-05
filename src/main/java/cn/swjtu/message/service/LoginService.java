package cn.swjtu.message.service;

import cn.swjtu.message.model.Staff;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    Staff login(String telephone, String password);
}
