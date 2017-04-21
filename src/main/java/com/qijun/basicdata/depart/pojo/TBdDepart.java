package com.qijun.basicdata.depart.pojo;

public class TBdDepart {
    private Long departId;

    private String departName;

    private String departTelephone;

    private String departTelephone2;

    private String departFunction;

    private String departIntruductionFilePath;

    private Long departNodeAttributeId;

    private String departNotes;

    public Long getDepartId() {
        return departId;
    }

    public void setDepartId(Long departId) {
        this.departId = departId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName == null ? null : departName.trim();
    }

    public String getDepartTelephone() {
        return departTelephone;
    }

    public void setDepartTelephone(String departTelephone) {
        this.departTelephone = departTelephone == null ? null : departTelephone.trim();
    }

    public String getDepartTelephone2() {
        return departTelephone2;
    }

    public void setDepartTelephone2(String departTelephone2) {
        this.departTelephone2 = departTelephone2 == null ? null : departTelephone2.trim();
    }

    public String getDepartFunction() {
        return departFunction;
    }

    public void setDepartFunction(String departFunction) {
        this.departFunction = departFunction == null ? null : departFunction.trim();
    }

    public String getDepartIntruductionFilePath() {
        return departIntruductionFilePath;
    }

    public void setDepartIntruductionFilePath(String departIntruductionFilePath) {
        this.departIntruductionFilePath = departIntruductionFilePath == null ? null : departIntruductionFilePath.trim();
    }

    public Long getDepartNodeAttributeId() {
        return departNodeAttributeId;
    }

    public void setDepartNodeAttributeId(Long departNodeAttributeId) {
        this.departNodeAttributeId = departNodeAttributeId;
    }

    public String getDepartNotes() {
        return departNotes;
    }

    public void setDepartNotes(String departNotes) {
        this.departNotes = departNotes == null ? null : departNotes.trim();
    }
}