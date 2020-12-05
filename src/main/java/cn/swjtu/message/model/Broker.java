package cn.swjtu.message.model;

public class Broker {
    private Integer brokerId;
    private String brokerName;
    private String brokerCompanyName;
    private String brokerMobile;
    private String brokerCity;
    private String brokerPlatform;
    private String brokerAddr;
    private String brokerEstate;
    private String brokerNote;
    private String brokerMessage;
    private String brokerDialog;
    private String brokerUse;
    private String brokerRemark;
    private String groupId;
    private Integer staffId;

    @Override
    public String toString() {
        return "Broker{" +
                "brokerId=" + brokerId +
                ", brokerName='" + brokerName + '\'' +
                ", brokerCompanyName='" + brokerCompanyName + '\'' +
                ", brokerMobile='" + brokerMobile + '\'' +
                ", brokerCity='" + brokerCity + '\'' +
                ", brokerPlatform='" + brokerPlatform + '\'' +
                ", brokerAddr='" + brokerAddr + '\'' +
                ", brokerEstate='" + brokerEstate + '\'' +
                ", brokerNote='" + brokerNote + '\'' +
                ", brokerMessage='" + brokerMessage + '\'' +
                ", brokerDialog='" + brokerDialog + '\'' +
                ", brokerUse='" + brokerUse + '\'' +
                ", brokerRemark='" + brokerRemark + '\'' +
                ", groupId='" + groupId + '\'' +
                ", staffId=" + staffId +
                '}';
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(Integer brokerId) {
        this.brokerId = brokerId;
    }

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    public String getBrokerCompanyName() {
        return brokerCompanyName;
    }

    public void setBrokerCompanyName(String brokerCompanyName) {
        this.brokerCompanyName = brokerCompanyName;
    }

    public String getBrokerMobile() {
        return brokerMobile;
    }

    public void setBrokerMobile(String brokerMobile) {
        this.brokerMobile = brokerMobile;
    }

    public String getBrokerCity() {
        return brokerCity;
    }

    public void setBrokerCity(String brokerCity) {
        this.brokerCity = brokerCity;
    }

    public String getBrokerPlatform() {
        return brokerPlatform;
    }

    public void setBrokerPlatform(String brokerPlatform) {
        this.brokerPlatform = brokerPlatform;
    }

    public String getBrokerAddr() {
        return brokerAddr;
    }

    public void setBrokerAddr(String brokerAddr) {
        this.brokerAddr = brokerAddr;
    }

    public String getBrokerEstate() {
        return brokerEstate;
    }

    public void setBrokerEstate(String brokerEstate) {
        this.brokerEstate = brokerEstate;
    }

    public String getBrokerNote() {
        return brokerNote;
    }

    public void setBrokerNote(String brokerNote) {
        this.brokerNote = brokerNote;
    }

    public String getBrokerMessage() {
        return brokerMessage;
    }

    public void setBrokerMessage(String brokerMessage) {
        this.brokerMessage = brokerMessage;
    }

    public String getBrokerDialog() {
        return brokerDialog;
    }

    public void setBrokerDialog(String brokerDialog) {
        this.brokerDialog = brokerDialog;
    }

    public String getBrokerUse() {
        return brokerUse;
    }

    public void setBrokerUse(String brokerUse) {
        this.brokerUse = brokerUse;
    }

    public String getBrokerRemark() {
        return brokerRemark;
    }

    public void setBrokerRemark(String brokerRemark) {
        this.brokerRemark = brokerRemark;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

}
