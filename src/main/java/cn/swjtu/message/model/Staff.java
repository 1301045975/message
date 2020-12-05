package cn.swjtu.message.model;

public class Staff {
    private Integer staffId;
    private String staffTelephone;
    private String staffPassword;
    private Integer groupId;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffTelephone() {
        return staffTelephone;
    }

    public void setStaffTelephone(String staffTelephone) {
        this.staffTelephone = staffTelephone;
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", staffTelephone='" + staffTelephone + '\'' +
                ", staffPassword='" + staffPassword + '\'' +
                ", groupId=" + groupId +
                '}';
    }
}
