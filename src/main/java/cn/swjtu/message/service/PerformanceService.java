package cn.swjtu.message.service;

import cn.swjtu.message.model.Performance;

import java.util.List;

public interface PerformanceService {
    public List<Performance> getAll(int currentPage, int pageSize);
}
