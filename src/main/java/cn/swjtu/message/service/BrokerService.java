package cn.swjtu.message.service;

import cn.swjtu.message.model.Broker;
import cn.swjtu.message.model.Result;
import org.apache.logging.log4j.message.ReusableMessage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface BrokerService {

    void updateBroker(String brokerMessage,String brokerDialog,String brokerUse,String brokerRemark,String brokerMobile);

    List<Result> selectAllBrokerByStaffId(String staffId);

    List<Result> getAll(int currentPage,int pagesize);

    int getAllById();

    List<Result> selectBroker(Map<String,Object> params);

    int selectBrokerCount(Map<String,Object> params);
    /**
     * 根据id获取一个broker
     * @param brokerId
     * @return
     */
//    Broker getAgentByBrokerId(Integer brokerId);

    /**
     *
     * @param broker_message
     * @param broker_dialog
     * @param broker_use
     * @return
     */
//    List<Result> selectBroker(String broker_message, String broker_dialog, String broker_use,String other_con);
//
//
//
//    List<Result> selectBrokerByMessageAndOther(String broker_message,String other_con);
//
//    List<Result> selectBrokerByDialogAndOther(String broker_dialog,String other_con);
//
//    List<Result> selectBrokerByUseAndOther(String broker_use,String other_con);
//
//
//    List<Result> selectBrokerByMessage(String broker_message);
//
//    List<Result> selectBrokerByDialog(String broker_dialog);
//
//    List<Result> selectBrokerByUse(String broker_use);
//
////    /**
////     * 根据是否发送短信筛选broker
////     * @param brokerMessage
////     * @return
////     */
////    List<Broker> getAllByBrokerMessage(Integer brokerMessage);
////
////    /**
////     * 根据是否拨打电话筛选broker
////     * @param brokerDialog
////     * @return
////     */
////    List<Broker> getAllByBrokerDialog(Integer brokerDialog);
////
////    /**
////     * 根据是否使用软件筛选broker
////     * @param brokerUse
////     * @return
////     */
////    List<Broker> getAllByBrokerUse(Integer brokerUse);
////
////    /**
////     * 根据brokerId更新数据
////     * @param broker
////     */
////    void updateBroker(Broker broker);
//

}
