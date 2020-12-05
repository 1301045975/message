package cn.swjtu.message.service.impl;

import cn.swjtu.message.mapper.StaffMapper;
import cn.swjtu.message.model.Staff;
import cn.swjtu.message.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceeImpl implements StaffService {

    @Autowired
    StaffMapper staffMapper;

    @Override
    public Staff existStaff(String telephone) {
        return staffMapper.existStaff(telephone);
    }

    @Override
    public Staff login(String telephone, String password) {
        return staffMapper.login(telephone,password);
    }

    @Override
    public void register(String telephone, String password, Integer groupId) {
        staffMapper.register(telephone,password,groupId);
    }

    public String getGroupId(String telephone){
        return staffMapper.getGroupId(telephone);
    }
}
