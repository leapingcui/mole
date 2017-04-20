package com.qijun.basicdata.person.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class VBdPersonDepartUnit {
    private String tPersonId;

    private String tPersonType;

    private String tPersonUsername;

    private String tPersonPwd;

    private String tPersonTruename;

    private String tPersonSex;

    private String tPersonEnName;

    private String tPersonNameUsed;

    private String tPersonTelephone;

    private String tPersonFax;

    private String tPersonAddr;

    private String tPersonMobilephone;

    private String tPersonEmail;

    private String tPersonQq;

    private String tPersonWetchat;

    private String tPersonDuty;

    private String tPersonTitle;

    private String tPersonIdentifyNum;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date tPersonBirth;

    private String tPersonNation;

    private String tPersonHighestDegree;

    private String tPersonPoliticsStatus;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date tPersonTakeJobDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date tPersonJoinWorkDate;

    private String tPersonHobbay;

    private Long tPersonNodeAttributeId;

    private String tPersonNotes;

    private Long tPersonDepartId;

    private Long tPersonUnitId;

    private String departName;

    private String unitName;

    public String gettPersonId() {
        return tPersonId;
    }

    public void settPersonId(String tPersonId) {
        this.tPersonId = tPersonId == null ? null : tPersonId.trim();
    }

    public String gettPersonType() {
        return tPersonType;
    }

    public void settPersonType(String tPersonType) {
        this.tPersonType = tPersonType == null ? null : tPersonType.trim();
    }

    public String gettPersonUsername() {
        return tPersonUsername;
    }

    public void settPersonUsername(String tPersonUsername) {
        this.tPersonUsername = tPersonUsername == null ? null : tPersonUsername.trim();
    }

    public String gettPersonPwd() {
        return tPersonPwd;
    }

    public void settPersonPwd(String tPersonPwd) {
        this.tPersonPwd = tPersonPwd == null ? null : tPersonPwd.trim();
    }

    public String gettPersonTruename() {
        return tPersonTruename;
    }

    public void settPersonTruename(String tPersonTruename) {
        this.tPersonTruename = tPersonTruename == null ? null : tPersonTruename.trim();
    }

    public String gettPersonSex() {
        return tPersonSex;
    }

    public void settPersonSex(String tPersonSex) {
        this.tPersonSex = tPersonSex == null ? null : tPersonSex.trim();
    }

    public String gettPersonEnName() {
        return tPersonEnName;
    }

    public void settPersonEnName(String tPersonEnName) {
        this.tPersonEnName = tPersonEnName == null ? null : tPersonEnName.trim();
    }

    public String gettPersonNameUsed() {
        return tPersonNameUsed;
    }

    public void settPersonNameUsed(String tPersonNameUsed) {
        this.tPersonNameUsed = tPersonNameUsed == null ? null : tPersonNameUsed.trim();
    }

    public String gettPersonTelephone() {
        return tPersonTelephone;
    }

    public void settPersonTelephone(String tPersonTelephone) {
        this.tPersonTelephone = tPersonTelephone == null ? null : tPersonTelephone.trim();
    }

    public String gettPersonFax() {
        return tPersonFax;
    }

    public void settPersonFax(String tPersonFax) {
        this.tPersonFax = tPersonFax == null ? null : tPersonFax.trim();
    }

    public String gettPersonAddr() {
        return tPersonAddr;
    }

    public void settPersonAddr(String tPersonAddr) {
        this.tPersonAddr = tPersonAddr == null ? null : tPersonAddr.trim();
    }

    public String gettPersonMobilephone() {
        return tPersonMobilephone;
    }

    public void settPersonMobilephone(String tPersonMobilephone) {
        this.tPersonMobilephone = tPersonMobilephone == null ? null : tPersonMobilephone.trim();
    }

    public String gettPersonEmail() {
        return tPersonEmail;
    }

    public void settPersonEmail(String tPersonEmail) {
        this.tPersonEmail = tPersonEmail == null ? null : tPersonEmail.trim();
    }

    public String gettPersonQq() {
        return tPersonQq;
    }

    public void settPersonQq(String tPersonQq) {
        this.tPersonQq = tPersonQq == null ? null : tPersonQq.trim();
    }

    public String gettPersonWetchat() {
        return tPersonWetchat;
    }

    public void settPersonWetchat(String tPersonWetchat) {
        this.tPersonWetchat = tPersonWetchat == null ? null : tPersonWetchat.trim();
    }

    public String gettPersonDuty() {
        return tPersonDuty;
    }

    public void settPersonDuty(String tPersonDuty) {
        this.tPersonDuty = tPersonDuty == null ? null : tPersonDuty.trim();
    }

    public String gettPersonTitle() {
        return tPersonTitle;
    }

    public void settPersonTitle(String tPersonTitle) {
        this.tPersonTitle = tPersonTitle == null ? null : tPersonTitle.trim();
    }

    public String gettPersonIdentifyNum() {
        return tPersonIdentifyNum;
    }

    public void settPersonIdentifyNum(String tPersonIdentifyNum) {
        this.tPersonIdentifyNum = tPersonIdentifyNum == null ? null : tPersonIdentifyNum.trim();
    }

    public Date gettPersonBirth() {
        return tPersonBirth;
    }

    public void settPersonBirth(Date tPersonBirth) {
        this.tPersonBirth = tPersonBirth;
    }

    public String gettPersonNation() {
        return tPersonNation;
    }

    public void settPersonNation(String tPersonNation) {
        this.tPersonNation = tPersonNation == null ? null : tPersonNation.trim();
    }

    public String gettPersonHighestDegree() {
        return tPersonHighestDegree;
    }

    public void settPersonHighestDegree(String tPersonHighestDegree) {
        this.tPersonHighestDegree = tPersonHighestDegree == null ? null : tPersonHighestDegree.trim();
    }

    public String gettPersonPoliticsStatus() {
        return tPersonPoliticsStatus;
    }

    public void settPersonPoliticsStatus(String tPersonPoliticsStatus) {
        this.tPersonPoliticsStatus = tPersonPoliticsStatus == null ? null : tPersonPoliticsStatus.trim();
    }

    public Date gettPersonTakeJobDate() {
        return tPersonTakeJobDate;
    }

    public void settPersonTakeJobDate(Date tPersonTakeJobDate) {
        this.tPersonTakeJobDate = tPersonTakeJobDate;
    }

    public Date gettPersonJoinWorkDate() {
        return tPersonJoinWorkDate;
    }

    public void settPersonJoinWorkDate(Date tPersonJoinWorkDate) {
        this.tPersonJoinWorkDate = tPersonJoinWorkDate;
    }

    public String gettPersonHobbay() {
        return tPersonHobbay;
    }

    public void settPersonHobbay(String tPersonHobbay) {
        this.tPersonHobbay = tPersonHobbay == null ? null : tPersonHobbay.trim();
    }

    public Long gettPersonNodeAttributeId() {
        return tPersonNodeAttributeId;
    }

    public void settPersonNodeAttributeId(Long tPersonNodeAttributeId) {
        this.tPersonNodeAttributeId = tPersonNodeAttributeId;
    }

    public String gettPersonNotes() {
        return tPersonNotes;
    }

    public void settPersonNotes(String tPersonNotes) {
        this.tPersonNotes = tPersonNotes == null ? null : tPersonNotes.trim();
    }

    public Long gettPersonDepartId() {
        return tPersonDepartId;
    }

    public void settPersonDepartId(Long tPersonDepartId) {
        this.tPersonDepartId = tPersonDepartId;
    }

    public Long gettPersonUnitId() {
        return tPersonUnitId;
    }

    public void settPersonUnitId(Long tPersonUnitId) {
        this.tPersonUnitId = tPersonUnitId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName == null ? null : departName.trim();
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }
}