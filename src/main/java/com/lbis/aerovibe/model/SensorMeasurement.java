package com.lbis.aerovibe.model;

import com.lbis.aerovibe.enums.ComparedLevel;
import com.lbis.aerovibe.enums.DataProvidorsEnums;
import com.lbis.database.model.KeyObjectIfc;
import com.lbis.database.model.ValueObjectIfc;
import java.io.Serializable;
import java.util.ArrayList;

public class SensorMeasurement implements ValueObjectIfc<SensorMeasurement>, KeyObjectIfc, Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -5357654020220075461L;
    private String sensorMeasurementId;
    private String sensorMeasurementSensorId;
    private DataProvidorsEnums sensorMeasurementDataProvidor;
    private int sensorMeasurementAQILevel;
    private Long sensorMeasurementTimeStamp;
    private ArrayList<SensorMeasurementValue> sensorMeasurementValues;
    private ComparedLevel sensorMeasurementComparedLevel;

    public transient final static String PROVIDER = "provider";
    public transient final static String PAGE = "page";
    public transient final static String NO_OF_MEASUREMENTS = "no_of_measurements";

    public SensorMeasurement() {
    }

    public SensorMeasurement(Long sensorMeasurementTimeStamp, String sensorMeasurementSensorId, DataProvidorsEnums sensorMeasurementDataProvidor, ArrayList<SensorMeasurementValue> sensorMeasurementValues) {
        this.sensorMeasurementTimeStamp = sensorMeasurementTimeStamp;
        this.sensorMeasurementSensorId = sensorMeasurementSensorId;
        this.sensorMeasurementDataProvidor = sensorMeasurementDataProvidor;
        this.sensorMeasurementValues = sensorMeasurementValues;
        this.sensorMeasurementId = "sensor_measurement_" + sensorMeasurementDataProvidor.getObjectKeyPrefix() + sensorMeasurementSensorId + "_" + sensorMeasurementTimeStamp;
    }

    public ComparedLevel getSensorMeasurementComparedLevel() {
        return sensorMeasurementComparedLevel;
    }

    public void setSensorMeasurementComparedLevel(ComparedLevel sensorMeasurementComparedLevel) {
        this.sensorMeasurementComparedLevel = sensorMeasurementComparedLevel;
    }
    
    @Override
    public String getObjectKey() {
        return sensorMeasurementId;
    }

    @Override
    public Class<SensorMeasurement> getClassType() {
        return SensorMeasurement.class;
    }

    public String getSensorMeasurementId() {
        return sensorMeasurementId;
    }

    public void setSensorMeasurementId(String sensorMeasurementId) {
        this.sensorMeasurementId = sensorMeasurementId;
    }

    public String getSensorMeasurementSensorId() {
        return sensorMeasurementSensorId;
    }

    public void setSensorMeasurementSensorId(String sensorMeasurementSensorId) {
        this.sensorMeasurementSensorId = sensorMeasurementSensorId;
    }

    public DataProvidorsEnums getSensorMeasurementDataProvidor() {
        return sensorMeasurementDataProvidor;
    }

    public void setSensorMeasurementDataProvidor(DataProvidorsEnums sensorMeasurementDataProvidor) {
        this.sensorMeasurementDataProvidor = sensorMeasurementDataProvidor;
    }

    public int getSensorMeasurementAQILevel() {
        return sensorMeasurementAQILevel;
    }

    public void setSensorMeasurementAQILevel(int sensorMeasurementAQILevel) {
        this.sensorMeasurementAQILevel = sensorMeasurementAQILevel;
    }

    public Long getSensorMeasurementTimeStamp() {
        return sensorMeasurementTimeStamp;
    }

    public void setSensorMeasurementTimeStamp(Long sensorMeasurementTimeStamp) {
        this.sensorMeasurementTimeStamp = sensorMeasurementTimeStamp;
    }

    public ArrayList<SensorMeasurementValue> getSensorMeasurementValues() {
        return sensorMeasurementValues;
    }

    public void setSensorMeasurementValues(ArrayList<SensorMeasurementValue> sensorMeasurementValues) {
        this.sensorMeasurementValues = sensorMeasurementValues;
    }

    public String getSQLObjectKey() {
        return getSensorMeasurementSensorId();
    }
}
