package com.lbis.aerovibe.enums;

public class URLEnums {
	private static final String baseURL = "http://api.aerovibe.com";
//    private static final String baseURL = "http://rafiq.lbisgroup.com:8080/aerovibe-api-server";
    //private static final String baseURL = "http://192.168.0.133:8080/aerovibe-api-server";

    public enum URLs {

        GetActiveSensors(baseURL + "/sensor/activeSensors"),
        GetLatestMeasurements(baseURL + "/sensorMeasurement/latestMeasurements"),
        AddNewUserLocation(baseURL + "/userMeasurement/addNewUserMeasurement"),
        GetLastWeek(baseURL + "/userMeasurement/getLastWeekUserMeasurements"),
        UpdateUser(baseURL + "/user/update"),
        SignupOrLoginForFacebook(baseURL + "/user/signupOrLoginFacebookUser"),
        NativeSignup(baseURL + "/user/signup"),
        NativeLogin(baseURL + "/user/login"),
        GetLatestMeasurementsPaged(baseURL + "/sensorMeasurement/latestMeasurementsPaged"),
        GetActiveSensorsPaged(baseURL + "/sensor/activeSensorsPaged"),
        GetPhotoUrl(baseURL + "/file/getPhoto?id="),
        UploadUrl(baseURL + "/file/upload"),
        GetLastMeasurements(baseURL + "/sensorMeasurement/getLastMeasurementsForSensor");
        private final String url;

        URLs(String url) {
            this.url = url;
        }

        public String getValue() {
            return url;
        }

    }

    public enum GoogleMapsAPI {

        PlacesAPI("https://maps.googleapis.com/maps/api/place/queryautocomplete/json?sensor=false&key=AIzaSyA25COcV0MTrDxOgsmVkHA_8-qeRbOVjQc&input="), GeoCodingAPI("https://maps.googleapis.com/maps/api/geocode/json?address=%10%&sensor=true&oe=utf8&key=AIzaSyCS7MgvoZTQQ16CuqGdniAEL6R8lLiyfCU");
        String url;

        private GoogleMapsAPI(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }

    }
}
