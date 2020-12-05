package cn.swjtu.message.service.impl;

import cn.swjtu.message.mapper.BrokerMapper;
import cn.swjtu.message.model.Broker;
import cn.swjtu.message.model.Result;
import cn.swjtu.message.service.BrokerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class BrokerServiceImpl implements BrokerService {
    @Autowired
    BrokerMapper brokerMapper;

    @Override
    public List<Result> selectAllBrokerByStaffId(String staffId) {
        List<Broker> lists = brokerMapper.selectAllBrokerByStaffId(staffId);
        List<Result> results = new ArrayList<>();
        for (int i = 0; i < lists.size();i++){
            Result result = new Result();
            result.setBrokerDialog(lists.get(i).getBrokerDialog());
            result.setBrokerMessage(lists.get(i).getBrokerMessage());
            result.setBrokerMobile(lists.get(i).getBrokerMobile());
            result.setBrokerName(lists.get(i).getBrokerName());
            result.setBrokerRemark(lists.get(i).getBrokerRemark());
            result.setBrokerUse(lists.get(i).getBrokerUse());
            results.add(result);
        }
        return results;
    }

    @Override
    public List<Result> getAll(int currentPage, int pagesize) {
        return brokerMapper.getAll(currentPage,pagesize);
    }

    @Override
    public int getAllById() {
        return brokerMapper.getAllById();
    }

    @Override
    public List<Result> selectBroker(Map<String,Object> params) {
        List<Broker> lists = brokerMapper.selectBroker(params);
        List<Result> results = new ArrayList<>();
        for (int i = 0; i < lists.size();i++){
            Result result = new Result();
            result.setBrokerDialog(lists.get(i).getBrokerDialog());
            result.setBrokerMessage(lists.get(i).getBrokerMessage());
            result.setBrokerMobile(lists.get(i).getBrokerMobile());
            result.setBrokerName(lists.get(i).getBrokerName());
            result.setBrokerRemark(lists.get(i).getBrokerRemark());
            result.setBrokerUse(lists.get(i).getBrokerUse());
            results.add(result);
        }
        return results;
    }

    @Override
    public int selectBrokerCount(Map<String, Object> params) {
        return brokerMapper.selectBrokerCount(params);
    }


    public void updateBroker(String brokerMessage,String brokerDialog,String brokerUse,String brokerRemark,String brokerMobile){
        brokerMapper.updateBroker(brokerMessage,brokerDialog,brokerUse,brokerRemark,brokerMobile);
    }
//    /**
//     *
//     * @param broker_message
//     * @param broker_dialog
//     * @param broker_use
//     * @return
//     */
//    @Override
//    public List<Result> selectBroker(String broker_message, String broker_dialog, String broker_use,String other_con){
//        List<Broker> lists = brokerMapper.selectBroker(broker_message,broker_dialog,broker_use,other_con);
//        List<Result> results = new ArrayList<>();
//        for (int i = 0; i < lists.size();i++){
//            Result result = new Result();
//            result.setBrokerDialog(lists.get(i).getBrokerDialog());
//            result.setBrokerMessage(lists.get(i).getBrokerMessage());
//            result.setBrokerMobile(lists.get(i).getBrokerMobile());
//            result.setBrokerName(lists.get(i).getBrokerName());
//            result.setBrokerRemark(lists.get(i).getBrokerRemark());
//            result.setBrokerUse(lists.get(i).getBrokerUse());
//            results.add(result);
//        }
//        return results;
//    }



//    @Override
//    public List<Result> selectBrokerByMessageAndOther(String broker_message,String other_con) {
////        return brokerMapper.selectBrokerByMessage(broker_message);
//        List<Broker> lists = brokerMapper.selectBrokerByMessageAndOther(broker_message,other_con);
//        List<Result> results = new ArrayList<>();
//        for (int i = 0; i < lists.size();i++){
//            Result result = new Result();
//            result.setBrokerDialog(lists.get(i).getBrokerDialog());
//            result.setBrokerMessage(lists.get(i).getBrokerMessage());
//            result.setBrokerMobile(lists.get(i).getBrokerMobile());
//            result.setBrokerName(lists.get(i).getBrokerName());
//            result.setBrokerRemark(lists.get(i).getBrokerRemark());
//            result.setBrokerUse(lists.get(i).getBrokerUse());
//            results.add(result);
//        }
//        return results;
//    }
//
//    @Override
//    public List<Result> selectBrokerByDialogAndOther(String broker_dialog,String other_con) {
//        List<Broker> lists = brokerMapper.selectBrokerByDialogAndOther(broker_dialog,other_con);
//        List<Result> results = new ArrayList<>();
//        for (int i = 0; i < lists.size();i++){
//            Result result = new Result();
//            result.setBrokerDialog(lists.get(i).getBrokerDialog());
//            result.setBrokerMessage(lists.get(i).getBrokerMessage());
//            result.setBrokerMobile(lists.get(i).getBrokerMobile());
//            result.setBrokerName(lists.get(i).getBrokerName());
//            result.setBrokerRemark(lists.get(i).getBrokerRemark());
//            result.setBrokerUse(lists.get(i).getBrokerUse());
//            results.add(result);
//        }
//        return results;
//    }
//
//    @Override
//    public List<Result> selectBrokerByUseAndOther(String broker_use,String other_con) {
//        List<Broker> lists = brokerMapper.selectBrokerByUseAndOther(broker_use,other_con);
//        List<Result> results = new ArrayList<>();
//        for (int i = 0; i < lists.size();i++){
//            Result result = new Result();
//            result.setBrokerDialog(lists.get(i).getBrokerDialog());
//            result.setBrokerMessage(lists.get(i).getBrokerMessage());
//            result.setBrokerMobile(lists.get(i).getBrokerMobile());
//            result.setBrokerName(lists.get(i).getBrokerName());
//            result.setBrokerRemark(lists.get(i).getBrokerRemark());
//            result.setBrokerUse(lists.get(i).getBrokerUse());
//            results.add(result);
//        }
//        return results;
//    }
//
//    @Override
//    public List<Result> selectBrokerByMessage(String broker_message) {
//        List<Broker> lists = brokerMapper.selectBrokerByMessage(broker_message);
//        List<Result> results = new ArrayList<>();
//        for (int i = 0; i < lists.size();i++){
//            Result result = new Result();
//            result.setBrokerDialog(lists.get(i).getBrokerDialog());
//            result.setBrokerMessage(lists.get(i).getBrokerMessage());
//            result.setBrokerMobile(lists.get(i).getBrokerMobile());
//            result.setBrokerName(lists.get(i).getBrokerName());
//            result.setBrokerRemark(lists.get(i).getBrokerRemark());
//            result.setBrokerUse(lists.get(i).getBrokerUse());
//            results.add(result);
//        }
//        return results;
//    }
//
//    @Override
//    public List<Result> selectBrokerByDialog(String broker_dialog) {
//        List<Broker> lists = brokerMapper.selectBrokerByDialog(broker_dialog);
//        List<Result> results = new ArrayList<>();
//        for (int i = 0; i < lists.size();i++){
//            Result result = new Result();
//            result.setBrokerDialog(lists.get(i).getBrokerDialog());
//            result.setBrokerMessage(lists.get(i).getBrokerMessage());
//            result.setBrokerMobile(lists.get(i).getBrokerMobile());
//            result.setBrokerName(lists.get(i).getBrokerName());
//            result.setBrokerRemark(lists.get(i).getBrokerRemark());
//            result.setBrokerUse(lists.get(i).getBrokerUse());
//            results.add(result);
//        }
//        return results;
//    }

//    @Override
//    public List<Result> selectBrokerByUse(String broker_use) {
//        List<Broker> lists = brokerMapper.selectBrokerByUse(broker_use);
//        List<Result> results = new ArrayList<>();
//        for (int i = 0; i < lists.size();i++){
//            Result result = new Result();
//            result.setBrokerDialog(lists.get(i).getBrokerDialog());
//            result.setBrokerMessage(lists.get(i).getBrokerMessage());
//            result.setBrokerMobile(lists.get(i).getBrokerMobile());
//            result.setBrokerName(lists.get(i).getBrokerName());
//            result.setBrokerRemark(lists.get(i).getBrokerRemark());
//            result.setBrokerUse(lists.get(i).getBrokerUse());
//            results.add(result);
//        }
//        return results;
//    }
//
////    /**
////     * 根据groupId获取一个组的broker
////     * @param groupId
////     * @return
////     */
////    @Override
////    public List<Broker> getAllByGroupId(Integer groupId){
////        return brokerMapper.getAllByGroupId(groupId);
////    }
////
////    /**
////     * 根据是否发送短信筛选broker
////     * @param brokerMessage
////     * @return
////     */
////    @Override
////    public List<Broker> getAllByBrokerMessage(Integer brokerMessage){
////        return brokerMapper.getAllByBrokerMessage(brokerMessage);
////    }
////
////    /**
////     * 根据是否拨打电话筛选broker
////     * @param brokerDialog
////     * @return
////     */
////    @Override
////    public List<Broker> getAllByBrokerDialog(Integer brokerDialog){
////        return brokerMapper.getAllByBrokerDialog(brokerDialog);
////    }
////
////    /**
////     * 根据是否使用软件筛选broker
////     * @param brokerUse
////     * @return
////     */
////    @Override
////    public List<Broker> getAllByBrokerUse(Integer brokerUse){
////        return brokerMapper.getAllByBrokerUse(brokerUse);
////    }
////
////    /**
////     * 根据brokerId更新数据
////     * @param broker
////     */
////    @Override
////    public void updateBroker(Broker broker){
////        brokerMapper.updateBroker(broker.getBrokerMessage(),broker.getBrokerDialog(),broker.getBrokerUse(),broker.getBrokerRemark(),broker.getBrokerId());
////    }


}
