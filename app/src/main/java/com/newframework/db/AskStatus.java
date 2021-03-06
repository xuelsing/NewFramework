package com.newframework.db;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Unique;

/**
 * Entity mapped to table "ask_status".
 */
@Entity
public class AskStatus {
    @Id
    @Unique
    private String targetId;
    @Property
    private String senderId;
    @Property
    private Integer status;
    @Property
    private String askId;
    @Property
    private int conversationType;
    @Property
    private long date;

    @Generated(hash = 1591025373)
    public AskStatus(String targetId, String senderId, Integer status, String askId,
                     int conversationType, long date) {
        this.targetId = targetId;
        this.senderId = senderId;
        this.status = status;
        this.askId = askId;
        this.conversationType = conversationType;
        this.date = date;
    }

    @Generated(hash = 1110316901)
    public AskStatus() {
    }

    public String getTargetId() {
        return this.targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getSenderId() {
        return this.senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAskId() {
        return this.askId;
    }

    public void setAskId(String askId) {
        this.askId = askId;
    }

    public long getDate() {
        return this.date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public int getConversationType() {
        return this.conversationType;
    }

    public void setConversationType(int conversationType) {
        this.conversationType = conversationType;
    }

}
