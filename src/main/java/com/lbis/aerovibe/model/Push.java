package com.lbis.aerovibe.model;

import com.lbis.database.model.KeyObjectIfc;
import com.lbis.database.model.ValueObjectIfc;
import java.io.Serializable;

public class Push implements ValueObjectIfc<Push>, KeyObjectIfc, Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 7059819275789959887L;
    private Long pushId;
    private String pushToken;
    private Long pushUserId;

    public Long getPushId() {
        return pushId;
    }

    public void setPushId(Long pushId) {
        this.pushId = pushId;
    }

    public String getPushToken() {
        return pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }

    public Long getPushUserId() {
        return pushUserId;
    }

    public void setPushUserId(Long pushUserId) {
        this.pushUserId = pushUserId;
    }

    public Class<Push> getClassType() {
        return Push.class;
    }

    public Long getId() {
        return pushId;
    }

    public String getObjectKey() {
        return "push_" + pushId;
    }

    public String getSQLObjectKey() {
        return getObjectKey();
    }

}
