/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lbis.aerovibe.model;

import com.lbis.aerovibe.enums.PollutantsEnums;
import java.io.Serializable;

/**
 *
 * @author Development User
 */
public class SensorMeasurementValue implements Comparable<SensorMeasurementValue>, Serializable {

    private static final long serialVersionUID = -2739554396428597539L;
    private PollutantsEnums sensorMeasurementPollutantsEnums;
    private Long sensorMeasurementValueTimeStamp;
    private float sensorMeasurementValueValue;
    private String sensorMeasurementValueUserMeasurementId;

    public SensorMeasurementValue(PollutantsEnums sensorMeasurementPollutantsEnums, float sensorMeasurementValueValue, Long sensorMeasurementValueTimeStamp) {
        this.sensorMeasurementPollutantsEnums = sensorMeasurementPollutantsEnums;
        this.sensorMeasurementValueTimeStamp = sensorMeasurementValueTimeStamp;
        this.sensorMeasurementValueValue = sensorMeasurementValueValue;
    }
    
    public SensorMeasurementValue(PollutantsEnums sensorMeasurementPollutantsEnums, float sensorMeasurementValueValue, Long sensorMeasurementValueTimeStamp, String sensorMeasurementValudUserMeasurementId) {
        this.sensorMeasurementPollutantsEnums = sensorMeasurementPollutantsEnums;
        this.sensorMeasurementValueTimeStamp = sensorMeasurementValueTimeStamp;
        this.sensorMeasurementValueValue = sensorMeasurementValueValue;
        this.sensorMeasurementValueUserMeasurementId = sensorMeasurementValudUserMeasurementId;
    }

    public PollutantsEnums getSensorMeasurementPollutantsEnums() {
        return sensorMeasurementPollutantsEnums;
    }

    public void setSensorMeasurementPollutantsEnums(PollutantsEnums sensorMeasurementPollutantsEnums) {
        this.sensorMeasurementPollutantsEnums = sensorMeasurementPollutantsEnums;
    }

    public Long getSensorMeasurementValueTimeStamp() {
        return sensorMeasurementValueTimeStamp;
    }

    public void setSensorMeasurementValueTimeStamp(Long sensorMeasurementValueTimeStamp) {
        this.sensorMeasurementValueTimeStamp = sensorMeasurementValueTimeStamp;
    }

    public float getSensorMeasurementValueValue() {
        return sensorMeasurementValueValue;
    }

    public void setSensorMeasurementValueValue(float sensorMeasurementValueValue) {
        this.sensorMeasurementValueValue = sensorMeasurementValueValue;
    }

    public int compareTo(SensorMeasurementValue o) {
        return Double.compare(getSensorMeasurementValueTimeStamp(), o.getSensorMeasurementValueTimeStamp());
    }

	public String getSensorMeasurementValueUserMeasurementId() {
		return sensorMeasurementValueUserMeasurementId;
	}

	public void setSensorMeasurementValueUserMeasurementId(String sensorMeasurementValueUserMeasurementId) {
		this.sensorMeasurementValueUserMeasurementId = sensorMeasurementValueUserMeasurementId;
	}

}
