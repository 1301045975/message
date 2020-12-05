package cn.swjtu.message.mapper;

import cn.swjtu.message.model.Staff;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface StaffMapper {
    @Select("select * from staff where staff_telephone = #{telephone}")
    Staff existStaff(String telephone);

    @Select("select * from staff where staff_telephone=#{telephone} and staff_password=#{password}")
    Staff login(String telephone,String password);

    @Insert("insert into staff(staff_telephone,staff_password,group_id) values(#{telephone},#{password},#{groupId})")
    void register(String telephone,String password,Integer groupId);

    @Select("select group_id from staff where staff_telephone=#{telephone}")
    String getGroupId(String telephone);
}
