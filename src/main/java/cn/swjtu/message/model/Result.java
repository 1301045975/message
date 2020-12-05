package cn.swjtu.message.model;

public class Result {
    private String brokerName;
    private String brokerMobile;
    private String brokerMessage;
    private String brokerDialog;
    private String brokerUse;
    private String brokerRemark;

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    public String getBrokerMobile() {
        return brokerMobile;
    }

    public void setBrokerMobile(String brokerMobile) {
        this.brokerMobile = brokerMobile;
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

    @Override
    public String toString() {
        return "Result{" +
                "brokerName='" + brokerName + '\'' +
                ", brokerMobile='" + brokerMobile + '\'' +
                ", brokerMessage=" + brokerMessage +
                ", brokerDialog=" + brokerDialog +
                ", brokerUse=" + brokerUse +
                ", brokerRemark='" + brokerRemark + '\'' +
                '}';
    }
}
