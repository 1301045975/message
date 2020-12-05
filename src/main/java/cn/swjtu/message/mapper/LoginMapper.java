package cn.swjtu.message.mapper;

import cn.swjtu.message.model.Staff;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface LoginMapper {
    @Select("select * from staff where staff_telephone=#{telephone} and staff_password=#{password}")
    Staff login(String telephone,String password);
}
