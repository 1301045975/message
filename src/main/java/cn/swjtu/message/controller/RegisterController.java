package cn.swjtu.message.controller;

import cn.swjtu.message.model.Staff;
import cn.swjtu.message.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin
public class RegisterController {
    @Resource
    StaffService staffService;

    @RequestMapping(value="/register", method= RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> register(String telephone, String password,Integer groupId){
        Map<String, Object> map = new HashMap<String, Object>();
        System.out.println(telephone + "  " + password + "  " + groupId);
        if(null != telephone && null != password){
            Staff staff = staffService.existStaff(telephone);
            if(staff != null){
                map.put("mydata","此用户已存在");
            }else {
                staffService.register(telephone,password,groupId);
                staff = staffService.login(telephone,password);
                if(staff == null){
                    map.put("mydata","注册失败");
                }else {
                    map.put("mydata","注册成功");
                }
            }
        }else {
            map.put("mydata","用户名或密码不能为空");
        }
        return map;
    }
}

