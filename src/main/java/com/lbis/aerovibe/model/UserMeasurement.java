package com.lbis.aerovibe.model;

import com.lbis.database.model.KeyObjectIfc;
import com.lbis.database.model.ValueObjectIfc;
import java.io.Serializable;

public class UserMeasurement implements ValueObjectIfc<UserMeasurement>, KeyObjectIfc, Serializable {

    private static final long serialVersionUID = -353132868817206925L;
    private String userMeasurementId;
    private UserLocation userMeasurementUserLocation;
    private SensorMeasurement userMeasurementSensorMeasurement;
    private Long userMeasurementTimeStamp;

    public UserMeasurement(UserLocation userMeasurementUserLocation, SensorMeasurement userMeasurementSensorMeasurement, Long userMeasurementTimeStamp) {
        this.userMeasurementId = "user_measurement_" + userMeasurementUserLocation.getObjectKey() + "_" + userMeasurementSensorMeasurement.getObjectKey();
        this.userMeasurementUserLocation = userMeasurementUserLocation;
        this.userMeasurementSensorMeasurement = userMeasurementSensorMeasurement;
        this.userMeasurementTimeStamp = userMeasurementTimeStamp;
    }

    public UserMeasurement() {
    }

    public UserMeasurement(UserLocation userMeasurementUserLocation) {
        this.userMeasurementUserLocation = userMeasurementUserLocation;
    }

    public String getUserMeasurementId() {
        return userMeasurementId;
    }

    public void setUserMeasurementId(String userMeasurementId) {
        this.userMeasurementId = userMeasurementId;
    }

    public UserLocation getUserMeasurementUserLocation() {
        return userMeasurementUserLocation;
    }

    public void setUserMeasurementUserLocation(UserLocation userMeasurementUserLocation) {
        this.userMeasurementUserLocation = userMeasurementUserLocation;
    }

    public SensorMeasurement getUserMeasurementSensorMeasurement() {
        return userMeasurementSensorMeasurement;
    }

    public void setUserMeasurementSensorMeasurement(SensorMeasurement userMeasurementSensorMeasurement) {
        this.userMeasurementSensorMeasurement = userMeasurementSensorMeasurement;
    }

    public Long getUserMeasurementTimeStamp() {
        return userMeasurementTimeStamp;
    }

    public void setUserMeasurementTimeStamp(Long userMeasurementTimeStamp) {
        this.userMeasurementTimeStamp = userMeasurementTimeStamp;
    }

    public Class<UserMeasurement> getClassType() {
        return UserMeasurement.class;
    }

    public String getObjectKey() {
        return userMeasurementId;
    }

    public String getSQLObjectKey() {
        return userMeasurementId;
    }

}
