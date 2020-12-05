package cn.swjtu.message.controller;

import cn.swjtu.message.model.Staff;
import cn.swjtu.message.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin
public class LoginController {
    @Resource
    StaffService staffService;

    @RequestMapping(value="/login", method= RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> login(HttpSession session, String telephone, String password){
        Map<String, Object> map = new HashMap<String, Object>();
        int flag = 0;
        if(telephone.equalsIgnoreCase("17726368141") && password.equals("admin")){
            map.put("mydata","管理员登录");
            flag = 1;
        }else {
            map.put("mydata","用户名或密码错误");
        }

        if(null != telephone && null != password){
            if(flag == 0){

                Staff staff = staffService.existStaff(telephone);
                if(staff == null){
                    map.put("mydata","此用户不存在，请注册后登录");
                }else {
                    staff = staffService.login(telephone,password);
                    if(staff == null){
                        System.out.println("用户名或密码错误");
                        map.put("mydata","用户名或密码错误");
                    }else {
                        System.out.println("登录成功");
                        String groupId = staffService.getGroupId(telephone);
                        System.out.println(groupId);
                        session.setAttribute("groupId",groupId);
                        map.put("mydata","登录成功");
                        map.put("groupId",groupId);
                    }
                }
            }
        }else {
            map.put("mydata","用户名或密码不能为空");
        }
        return map;
    }
}

