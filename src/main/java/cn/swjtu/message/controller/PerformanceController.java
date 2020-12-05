package cn.swjtu.message.controller;
import cn.swjtu.message.model.Broker;
import cn.swjtu.message.model.Performance;
import cn.swjtu.message.model.Result;
import cn.swjtu.message.service.BrokerService;
import cn.swjtu.message.service.PerformanceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin
@Api(tags = "PerformanceController",description = "业绩管理")
@RequestMapping("/perform")
public class PerformanceController {
//    @Resource
//    PerformanceService performanceService;
//    @RequestMapping(value="/selectperformance", method= RequestMethod.POST)
//    @ResponseBody
//    public Map<String,Object> selectPerformance(String currentPage,String pagesize){
//        System.out.println("currentPage"+currentPage);
//        System.out.println("pagesize"+pagesize);
//        List<Result> results = performanceService.getAll((Integer.valueOf(currentPage)-1)*10,Integer.valueOf(pagesize));
//        System.out.println(results);
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("allBrokers",results);
//        System.out.println("查全部");
//        return map;
//    }

    @Autowired
    PerformanceService performanceService;

    @ResponseBody
    @PostMapping("/getAll")
    public Map<String,Object> getPerformance(@ApiParam("当前所在页") @RequestParam("currentPage") Integer currentPage,
                                            @ApiParam("每页条数") @RequestParam("pageSize") Integer pageSize){
        Map<String,Object> map = new HashMap<>();
        map.put("performance",performanceService.getAll(currentPage,pageSize));
        map.put("count",performanceService.getAll(currentPage,pageSize).size());
        return map;
    }

}
