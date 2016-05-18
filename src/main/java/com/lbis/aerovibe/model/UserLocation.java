package com.lbis.aerovibe.model;

import com.lbis.database.model.KeyObjectIfc;
import com.lbis.database.model.ValueObjectIfc;
import java.io.Serializable;

public class UserLocation implements ValueObjectIfc<UserLocation>, KeyObjectIfc, Serializable {

    private static final long serialVersionUID = -4228431956450310287L;
    private Double userLocationLatitude;
    private Double userLocationLongitude;
    private String userLocationUserId;
    private String userLocationClosestSensorId;

    public UserLocation(Double userLocationLatitude, Double userLocationLongitude, String userLocationUserId, String userLocationClosestSensorId) {
        this.userLocationLatitude = userLocationLatitude;
        this.userLocationLongitude = userLocationLongitude;
        this.userLocationUserId = userLocationUserId;
        this.userLocationClosestSensorId = userLocationClosestSensorId;
    }

    public String getUserLocationClosestSensorId() {
        return userLocationClosestSensorId;
    }

    public void setUserLocationClosestSensorId(String userLocationClosestSensorId) {
        this.userLocationClosestSensorId = userLocationClosestSensorId;
    }

    public Double getUserLocationLatitude() {
        return userLocationLatitude;
    }

    public void setUserLocationLatitude(Double userLocationLatitude) {
        this.userLocationLatitude = userLocationLatitude;
    }

    public Double getUserLocationLongitude() {
        return userLocationLongitude;
    }

    public void setUserLocationLongitude(Double userLocationLongitude) {
        this.userLocationLongitude = userLocationLongitude;
    }

    public String getUserLocationUserId() {
        return userLocationUserId;
    }

    public void setUserLocationUserId(String userLocationUserId) {
        this.userLocationUserId = userLocationUserId;
    }

    public String getObjectKey() {
        return userLocationUserId;
    }

    public String getSQLObjectKey() {
        return userLocationUserId;
    }

    public Class<UserLocation> getClassType() {
        return UserLocation.class;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("User Id is ").append(userLocationUserId).append(" user latitude is ").append(userLocationLatitude).append(" user Longitude is ").append(userLocationLongitude).toString();
    }

}
