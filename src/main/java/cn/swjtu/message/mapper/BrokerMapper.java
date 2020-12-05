package cn.swjtu.message.mapper;

import cn.swjtu.message.model.Broker;
import cn.swjtu.message.model.Result;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface BrokerMapper {
//    @Select("select * from broker where broker_id=#{broker_id}")
////    @Results({@Result(property = "brokerId",column = "broker_id"), @Result(property = "brokerName",column = "broker_name")})
//    Broker getBrokerByBrokerId(Integer brokerId);
//
//    @Select("select * from broker where ((broker_message=#{broker_message} or broker_message is null) and (broker_dialog=#{broker_dialog} or broker_dialog is null) and (broker_use=#{broker_use} or broker_use is null)) and (broker_name=#{other_con} or broker_mobile=#{other_con} or broker_remark=#{other_con})")
//    List<Broker> selectBroker(String broker_message, String broker_dialog, String broker_use,String other_con);
//
//    @Select("select * from broker where broker_message=#{broker_message}")
//    List<Broker> selectBrokerByMessage(String broker_message);
//
//    @Select("select * from broker where broker_dialog=#{broker_dialog}")
//    List<Broker> selectBrokerByDialog(String broker_dialog);
//
//    @Select("select * from broker where broker_use=#{broker_use}")
//    List<Broker> selectBrokerByUse(String broker_use);
//
//
//    @Select("select * from broker where broker_message=#{broker_message} and (broker_name=#{other_con} or broker_mobile=#{other_con} or broker_remark=#{other_con})")
//    List<Broker> selectBrokerByMessageAndOther(String broker_message,String other_con);
//
//    @Select("select * from broker where broker_dialog=#{broker_dialog} and (broker_name=#{other_con} or broker_mobile=#{other_con} or broker_remark=#{other_con})")
//    List<Broker> selectBrokerByDialogAndOther(String broker_dialog,String other_con);
//
//    @Select("select * from broker where broker_use=#{broker_use} and (broker_name=#{other_con} or broker_mobile=#{other_con} or broker_remark=#{other_con})")
//    List<Broker> selectBrokerByUseAndOther(String broker_use,String other_con);
//
////
////    @Select("select * from broker where broker_message=#{broker_message}")
////    List<Broker> getAllByBrokerMessage(Integer brokerMessage);
////
////    @Select("select * from broker where broker_dialog=#{broker_dialog}")
////    List<Broker> getAllByBrokerDialog(Integer brokerDialog);
////
//    @Select("select * from broker where group_id = #{groupId}")
//    List<Broker> getAllByGroupId(String groupId);
//
//
//    @Select("select group_id from broker where broker_telephone=#{telephone}")
////    String getGroupId(String telephone);

    List<Broker> selectBroker(Map<String,Object> params);

    int selectBrokerCount(Map<String,Object> params);

    @Select("select * from broker where group_id = #{groupId}")
    List<Broker> selectAllBrokerByStaffId(String staffId);


    @Select("select * from broker limit #{currentPage},#{pagesize}")
    List<Result> getAll(int currentPage,int pagesize);


    @Select("select count(broker_id) from broker")
    int getAllById();

    @Update("update broker set broker_message=#{brokerMessage},broker_dialog=#{brokerDialog},broker_use=#{brokerUse},broker_remark=#{brokerRemark} where broker_mobile=#{brokerMobile}")
    void updateBroker(String brokerMessage,String brokerDialog,String brokerUse,String brokerRemark,String brokerMobile);
}
