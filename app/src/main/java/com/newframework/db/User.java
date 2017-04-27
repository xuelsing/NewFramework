package com.newframework.db;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Transient;
import org.greenrobot.greendao.annotation.Unique;

import java.io.Serializable;

@Entity
public class User implements Serializable {
    public static final long serialVersionUID = 693174934;
    @Id
    @Unique
    private String userId;
    @Property
    private String askNumber;
    @Property
    private String city;
    @Property
    private String department;
    @Property
    private String desc;
    @Property
    private String district;
    @Property
    private String educationTitle;
    @Property
    private String helpCount;
    @Property
    private String hospital;
    @Property
    private String image;
    @Property
    private String name;
    @Property
    private String province;
    @Property
    private String qaCount;
    @Property
    private String qrCode;
    @Property
    private String role;
    @Property
    private String score;
    @Property
    private String title;
    @Property
    private String workYear;
    @Property
    private String phone;
    @Property
    private String sex;
    @Property
    private String birth;
    @Property
    private String experience;
    @Property
    private String good;
    @Property
    private String doccard;
    @Property
    private String cardimg;
    @Property
    private String docNo;
    @Property
    private String flowerNumber;
    @Property
    private String lastAsk;
    @Property
    private String status;
    @Property
    private String regFee;
    @Transient
    private String letters;
    @Property
    private String appointmentFlag;
    @Property
    private String appointmentTimes;

    public String getLetters() {
        return letters;
    }

    public void setLetters(String letters) {
        this.letters = letters;
    }

    @Generated(hash = 56358554)
    public User(String userId, String askNumber, String city, String department, String desc, String district,
                String educationTitle, String helpCount, String hospital, String image, String name, String province,
                String qaCount, String qrCode, String role, String score, String title, String workYear, String phone,
                String sex, String birth, String experience, String good, String doccard, String cardimg,
                String docNo, String flowerNumber, String lastAsk, String status, String regFee,
                String appointmentFlag, String appointmentTimes) {
        this.userId = userId;
        this.askNumber = askNumber;
        this.city = city;
        this.department = department;
        this.desc = desc;
        this.district = district;
        this.educationTitle = educationTitle;
        this.helpCount = helpCount;
        this.hospital = hospital;
        this.image = image;
        this.name = name;
        this.province = province;
        this.qaCount = qaCount;
        this.qrCode = qrCode;
        this.role = role;
        this.score = score;
        this.title = title;
        this.workYear = workYear;
        this.phone = phone;
        this.sex = sex;
        this.birth = birth;
        this.experience = experience;
        this.good = good;
        this.doccard = doccard;
        this.cardimg = cardimg;
        this.docNo = docNo;
        this.flowerNumber = flowerNumber;
        this.lastAsk = lastAsk;
        this.status = status;
        this.regFee = regFee;
        this.appointmentFlag = appointmentFlag;
        this.appointmentTimes = appointmentTimes;
    }

    @Generated(hash = 586692638)
    public User() {
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAskNumber() {
        return this.askNumber;
    }

    public void setAskNumber(String askNumber) {
        this.askNumber = askNumber;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getEducationTitle() {
        return this.educationTitle;
    }

    public void setEducationTitle(String educationTitle) {
        this.educationTitle = educationTitle;
    }

    public String getHelpCount() {
        return this.helpCount;
    }

    public void setHelpCount(String helpCount) {
        this.helpCount = helpCount;
    }

    public String getHospital() {
        return this.hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getQaCount() {
        return this.qaCount;
    }

    public void setQaCount(String qaCount) {
        this.qaCount = qaCount;
    }

    public String getQrCode() {
        return this.qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWorkYear() {
        return this.workYear;
    }

    public void setWorkYear(String workYear) {
        this.workYear = workYear;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return this.birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getExperience() {
        return this.experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getGood() {
        return this.good;
    }

    public void setGood(String good) {
        this.good = good;
    }

    public String getDoccard() {
        return this.doccard;
    }

    public void setDoccard(String doccard) {
        this.doccard = doccard;
    }

    public String getCardimg() {
        return this.cardimg;
    }

    public void setCardimg(String cardimg) {
        this.cardimg = cardimg;
    }

    public String getDocNo() {
        return this.docNo;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", askNumber='" + askNumber + '\'' +
                ", city='" + city + '\'' +
                ", department='" + department + '\'' +
                ", desc='" + desc + '\'' +
                ", district='" + district + '\'' +
                ", educationTitle='" + educationTitle + '\'' +
                ", helpCount='" + helpCount + '\'' +
                ", hospital='" + hospital + '\'' +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", province='" + province + '\'' +
                ", qaCount='" + qaCount + '\'' +
                ", qrCode='" + qrCode + '\'' +
                ", role='" + role + '\'' +
                ", score='" + score + '\'' +
                ", title='" + title + '\'' +
                ", workYear='" + workYear + '\'' +
                ", phone='" + phone + '\'' +
                ", sex='" + sex + '\'' +
                ", birth='" + birth + '\'' +
                ", experience='" + experience + '\'' +
                ", good='" + good + '\'' +
                ", doccard='" + doccard + '\'' +
                ", cardimg='" + cardimg + '\'' +
                ", docNo='" + docNo + '\'' +
                '}';
    }

    public String getLastAsk() {
        return this.lastAsk;
    }

    public void setLastAsk(String lastAsk) {
        this.lastAsk = lastAsk;
    }

    public String getFlowerNumber() {
        return this.flowerNumber;
    }

    public void setFlowerNumber(String flowerNumber) {
        this.flowerNumber = flowerNumber;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRegFee() {
        return this.regFee;
    }

    public void setRegFee(String regFee) {
        this.regFee = regFee;
    }

    public String getAppointmentFlag() {
        return this.appointmentFlag;
    }

    public void setAppointmentFlag(String appointmentFlag) {
        this.appointmentFlag = appointmentFlag;
    }

    public String getAppointmentTimes() {
        return this.appointmentTimes;
    }

    public void setAppointmentTimes(String appointmentTimes) {
        this.appointmentTimes = appointmentTimes;
    }
}