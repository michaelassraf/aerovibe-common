package com.lbis.aerovibe.model;

import com.lbis.database.model.KeyObjectIfc;
import com.lbis.database.model.ValueObjectIfc;
import java.io.Serializable;
import java.util.ArrayList;

public class UserProfile implements ValueObjectIfc<UserProfile>, KeyObjectIfc, Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 8435254723394202767L;
    private String userProfileId;
    private Long userProfileUserId;
    private int userProfileAQILevel;
    private ArrayList<SensorMeasurementValue> userProfileValues;

    public UserProfile(String userProfileId, Long userProfileUserId, int userProfileAQILevel, ArrayList<SensorMeasurementValue> userProfileValues) {
        this.userProfileId = userProfileId;
        this.userProfileUserId = userProfileUserId;
        this.userProfileAQILevel = userProfileAQILevel;
        this.userProfileValues = userProfileValues;
    }

    public int getUserProfileAQILevel() {
        return userProfileAQILevel;
    }

    public void setUserProfileAQILevel(int userProfileAQILevel) {
        this.userProfileAQILevel = userProfileAQILevel;
    }

    public String getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(String userProfileId) {
        this.userProfileId = userProfileId;
    }

    public Long getUserProfileUserId() {
        return userProfileUserId;
    }

    public void setUserProfileUserId(Long userProfileUserId) {
        this.userProfileUserId = userProfileUserId;
    }

    public ArrayList<SensorMeasurementValue> getUserProfileValues() {
        return userProfileValues;
    }

    public void setUserProfileValues(ArrayList<SensorMeasurementValue> userProfileValues) {
        this.userProfileValues = userProfileValues;
    }

    public String getObjectKey() {
        return userProfileId;
    }

    public String getSQLObjectKey() {
        return userProfileId;
    }

    public Class<UserProfile> getClassType() {
        return UserProfile.class;
    }

}
