package cn.swjtu.message.service.impl;

import cn.swjtu.message.mapper.PerformanceMapper;
import cn.swjtu.message.model.Performance;
import cn.swjtu.message.model.PerformanceExample;
import cn.swjtu.message.service.PerformanceService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerformanceServiceImpl implements PerformanceService {
    @Autowired
    PerformanceMapper performanceMapper;

    @Override
    public List<Performance> getAll(int currentPage, int pageSize) {
        PerformanceExample performanceExample = new PerformanceExample();
        //查询条件 使用criteria
//        PerformanceExample.Criteria criteria = performanceExample.createCriteria();
//        criteria.andPerGradeBetween("1","2");//查询条件 grade要在 1和2之间 所有查询条件给完之后 执行

        PageHelper.startPage(currentPage, pageSize);
//之后进行查询操作将自动进行分页
        List<Performance> performances = performanceMapper.selectByExample(performanceExample); //返回查询结果
        System.out.println(performances);
        System.out.println("abcd");
        return performances;
    }
}
