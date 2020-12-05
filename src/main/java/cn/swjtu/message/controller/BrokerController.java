package cn.swjtu.message.controller;

import cn.swjtu.message.model.Broker;
import cn.swjtu.message.model.Result;
import cn.swjtu.message.service.BrokerService;
import io.swagger.annotations.Api;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin
@Api(tags = "BrokerController")
public class BrokerController {
    @Resource
    BrokerService brokerService;

    @RequestMapping(value="/select", method= RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> selectBroker(String message_select, String dialog_select, String use_select,String other_con,int currentPage, int pagesize){
//        Broker broker = new Broker();
//        broker.setBrokerMessage(message_select);
//        broker.setBrokerDialog(dialog_select);
//        broker.setBrokerUse(use_select);
//        broker.setBrokerRemark(other_con);
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("brokerMessage",message_select);
        params.put("brokerDialog",dialog_select);
        params.put("brokerUse",use_select);
        params.put("brokerRemark",other_con);
        params.put("currentPage",(currentPage-1)*10);
        params.put("pagesize",pagesize);
        Map<String, Object> map = new HashMap<String, Object>();
        List<Result> results = new ArrayList<Result>();
        results = brokerService.selectBroker(params);
        System.out.println(results);
        System.out.println("查部分");
        map.put("selectBrokers",results);
        return map;
    }

    @RequestMapping(value="/selectCount", method= RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> selectBrokerCount(String message_select, String dialog_select, String use_select,String other_con){
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("brokerMessage",message_select);
        params.put("brokerDialog",dialog_select);
        params.put("brokerUse",use_select);
        params.put("brokerRemark",other_con);
        Map<String,Object> map = new HashMap<>();
        int count = brokerService.selectBrokerCount(params);
        map.put("count",count);
        System.out.println(count);
        return map;
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public void updateBroker(String brokerMessage,String brokerDialog,String brokerUse,String brokerRemark,String brokerMobile){
        brokerService.updateBroker(brokerMessage,brokerDialog,brokerUse,brokerRemark,brokerMobile);
    }

    @RequestMapping(value="/selectAllById", method= RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> selectAllBrokerByStaffId(String staffId){
        List<Result> results = brokerService.selectAllBrokerByStaffId(staffId);
        System.out.println(results);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("allBrokers",results);
        System.out.println("查个人全部");
        return map;
    }

    @RequestMapping(value="/selectAll", method= RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> selectAllBroker(String currentPage,String pagesize){
        System.out.println("currentPage"+currentPage);
        System.out.println("pagesize"+pagesize);
        List<Result> results = brokerService.getAll((Integer.valueOf(currentPage)-1)*10,Integer.valueOf(pagesize));
        System.out.println(results);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("allBrokers",results);
        System.out.println("查全部");
        return map;
    }

    @RequestMapping(value="/selectCountById", method= RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> selectAllById (){
        Map<String,Object> map = new HashMap<>();
        int count = brokerService.getAllById();
        map.put("count",count);
        return map;
    }
}
