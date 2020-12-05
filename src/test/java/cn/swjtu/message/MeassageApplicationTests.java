package cn.swjtu.message;

import cn.swjtu.message.model.Broker;
import cn.swjtu.message.model.Result;
import cn.swjtu.message.model.Staff;
import cn.swjtu.message.service.BrokerService;
import cn.swjtu.message.service.LoginService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class  MeassageApplicationTests {


    @Autowired
    BrokerService brokerService;
    @Test
    void contextLoads() {
        Broker broker = new Broker();
        broker.setBrokerMessage("1");
        broker.setBrokerDialog("1");
        broker.setBrokerUse("0");
        broker.setBrokerRemark("");
    }

    @Autowired
    LoginService loginService;

    @Test
    void login(){
        Staff staff = loginService.login("3","4");
        System.out.println(staff);
    }
}
