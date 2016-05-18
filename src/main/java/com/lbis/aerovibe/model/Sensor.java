package com.lbis.aerovibe.model;

import com.lbis.aerovibe.annotations.Translate;
import com.lbis.aerovibe.enums.DataProvidorsEnums;
import com.lbis.database.model.KeyObjectIfc;
import com.lbis.database.model.ValueObjectIfc;

import java.io.Serializable;

public class Sensor implements ValueObjectIfc<Sensor>, KeyObjectIfc, Serializable, Comparable<Sensor> {

	/**
     *
     */
    
    public transient final static String SENSOR_ID = "sensor_id";
    public transient final static String PAGE = "page";
    
    private static final long serialVersionUID = -8945879431996505103L;
    protected String sensorId;
    protected String sensorExternalId;
    protected DataProvidorsEnums sensorDataProvidor;
    @Translate
    protected String sensorCity;
    @Translate
    protected String sensorCountry;
    protected String sensorAddressImage;
    protected Double sensorLatitude;
    protected Double sensorLongitude;
    @Translate
    protected String sensorDescription;
    @Translate
    protected String sensorDetails;
    protected Float sensorDistance;

	public Sensor() {
	}

	public Sensor(String sensorExternalId, DataProvidorsEnums sensorDataProvidor, String sensorCity, String sensorCountry, String sensorAddressImage, Double sensorLatitude, Double sensorLongitude, String sensorDescription, String sensorDetails) {
		this.sensorExternalId = sensorExternalId;
		this.sensorDataProvidor = sensorDataProvidor;
		this.sensorCity = sensorCity;
		this.sensorCountry = sensorCountry;
		this.sensorAddressImage = sensorAddressImage;
		this.sensorLatitude = sensorLatitude;
		this.sensorLongitude = sensorLongitude;
		this.sensorDescription = sensorDescription;
		this.sensorDetails = sensorDetails;
		this.sensorId = "sensor_details_" + sensorDataProvidor.getObjectKeyPrefix() + sensorLatitude + "_" + sensorLongitude;
	}

	public Sensor(DataProvidorsEnums sensorDataProvidor, Double sensorLatitude, Double sensorLongitude) {
		this.sensorDataProvidor = sensorDataProvidor;
		this.sensorLatitude = sensorLatitude;
		this.sensorLongitude = sensorLongitude;
		this.sensorId = "sensor_details_" + sensorDataProvidor.getObjectKeyPrefix() + sensorLatitude + "_" + sensorLongitude;
	}

	public Sensor(DataProvidorsEnums sensorDataProvidor, String sensorDescription, Double sensorLatitude, Double sensorLongitude) {
		this.sensorDataProvidor = sensorDataProvidor;
		this.sensorLatitude = sensorLatitude;
		this.sensorLongitude = sensorLongitude;
		this.sensorDescription = sensorDescription;
		this.sensorId = "sensor_details_" + sensorDataProvidor.getObjectKeyPrefix() + sensorLatitude + "_" + sensorLongitude;
	}

	public Float getSensorDistance() {
		return sensorDistance;
	}

	public void setSensorDistance(Float sensorDistance) {
		this.sensorDistance = sensorDistance;
	}

	public String getObjectKey() {
		return sensorId;
	}

	public Class<Sensor> getClassType() {
		return Sensor.class;
	}

	public String getSensorId() {
		return sensorId;
	}

	public void setSensorId(String sensorId) {
		this.sensorId = sensorId;
	}

	public String getSensorExternalId() {
		return sensorExternalId;
	}

	public void setSensorExternalId(String sensorExternalId) {
		this.sensorExternalId = sensorExternalId;
	}

	public DataProvidorsEnums getSensorDataProvidor() {
		return sensorDataProvidor;
	}

	public void setSensorDataProvidor(DataProvidorsEnums sensorDataProvidor) {
		this.sensorDataProvidor = sensorDataProvidor;
	}

	public String getSensorCity() {
		return sensorCity;
	}

	public void setSensorCity(String sensorCity) {
		this.sensorCity = sensorCity;
	}

	public String getSensorCountry() {
		return sensorCountry;
	}

	public void setSensorCountry(String sensorCountry) {
		this.sensorCountry = sensorCountry;
	}

	public String getSensorAddressImage() {
		return sensorAddressImage;
	}

	public void setSensorAddressImage(String sensorAddressImage) {
		this.sensorAddressImage = sensorAddressImage;
	}

	public Double getSensorLatitude() {
		return sensorLatitude;
	}

	public void setSensorLatitude(Double sensorLatitude) {
		this.sensorLatitude = sensorLatitude;
	}

	public Double getSensorLongitude() {
		return sensorLongitude;
	}

	public void setSensorLongitude(Double sensorLongitude) {
		this.sensorLongitude = sensorLongitude;
	}

	public String getSensorDescription() {
		return sensorDescription;
	}

	public void setSensorDescription(String sensorDescription) {
		this.sensorDescription = sensorDescription;
	}

	public String getSensorDetails() {
		return sensorDetails;
	}

	public void setSensorDetails(String sensorDetails) {
		this.sensorDetails = sensorDetails;
	}

	public String getSQLObjectKey() {
		return getObjectKey();
	}

	public int compareTo(Sensor otherSensor) {
		return getSensorDistance().compareTo(otherSensor.getSensorDistance());
	}
}
