package cn.swjtu.message.service;

import cn.swjtu.message.model.Staff;

public interface StaffService {
    /**
     * 根据电话号码查询是否存在该用户
     * @param telephone
     * @return
     */
    Staff existStaff(String telephone);

    /**
     * 根据电话号码和密码进行登录
     * @param telephone
     * @param password
     * @return
     */
    Staff login(String telephone,String password);

    /**
     * 注册一个新的账号
     * @param telephone
     * @param password
     * @param groupId
     */
    void register(String telephone,String password,Integer groupId);

    String getGroupId(String telephone);
}
