package com.lbis.aerovibe.utils;

import com.lbis.aerovibe.enums.DBEnums.DBTables;
import com.lbis.aerovibe.enums.PollutantsEnums;
import com.lbis.aerovibe.model.User;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.validator.GenericValidator;

public class AerovibeUtils {

    private static AerovibeUtils utils;

    public static final int DISCARD = 4;
    public static final int SHARE = 5;

    public static final String PROTOTYPE = "prototype";
    public static final String SINGLETON = "singleton";

    public static AerovibeUtils getInstance() {
        if (utils == null) {
            utils = new AerovibeUtils();
        }

        return utils;
    }

    public List<String> getTablesNames() {
        ArrayList<String> tables = new ArrayList<String>();
        for (DBTables table : DBTables.values()) {
            tables.add(table.toString());
        }
        return tables;
    }

    public double distanceBetween2Points(double firstLatitude, double firstLongitude, double secondLatitude, double secondLongitude, char unit) {
        double theta = firstLongitude - secondLongitude;
        double dist = Math.sin(deg2rad(firstLatitude)) * Math.sin(deg2rad(secondLatitude)) + Math.cos(deg2rad(firstLatitude)) * Math.cos(deg2rad(secondLatitude)) * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;
        if (unit == 'K') {
            dist = dist * 1.609344;
        } else if (unit == 'N') {
            dist = dist * 0.8684;
        }
        return (dist);
    }

    private double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    private double rad2deg(double rad) {
        return (rad * 180.0 / Math.PI);
    }

    public boolean checkIfIsValidUser(User user) {
        if (user == null || user.getUserPicture() == null || GenericValidator.isBlankOrNull(user.getUserPicture()) || user.getUserFirstName() == null) {
            return false;
        }
        return true;
    }

    public PollutantsEnums validatePollutant(String pollutantName, Float pollutantValue) {
        PollutantsEnums currentPollutantEnum = getPollutantsEnumsForText(pollutantName);
        if (currentPollutantEnum == null) {
            return null;
        }
        return isValueValidForPollutant(currentPollutantEnum, pollutantValue) ? currentPollutantEnum : null;
    }

    private PollutantsEnums getPollutantsEnumsForText(String pollutantName) {
        for (PollutantsEnums value : PollutantsEnums.values()) {
            String[] strings = value.getPollutantsEnumAliases();

            if (strings == null) {
                return null;
            }

            for (String string : strings) {
                if (pollutantName.toLowerCase().contains(string.toLowerCase())) {
                    return value;
                }
            }
        }
        return null;
    }

    private boolean isValueValidForPollutant(PollutantsEnums currentPollutantEnum, Float pollutantValue) {

        if (pollutantValue <= 0 || pollutantValue > currentPollutantEnum.getPollutantsEnumMaxLevel()) {
            return false;
        }
        return true;
    }

    public Long getKeyForSensorMeasurement(String string, Double lon, Double lat) {
        Long longRep = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        int stringToInt = 0;
        for (char currentChar : string.toCharArray()) {
            stringToInt = stringToInt + ((int) currentChar);
        }

        stringBuilder.append(stringToInt);

        double oneIntFor2Doubles = lat + lon;

        String oneIntFor2DoublesString = "" + oneIntFor2Doubles;
        oneIntFor2DoublesString = oneIntFor2DoublesString.replaceAll("\\.", "");
        oneIntFor2DoublesString = oneIntFor2DoublesString.replaceAll("-", "");
        stringBuilder.append(oneIntFor2DoublesString);

        String stringToParse = stringBuilder.toString();

        for (int i = 0; i < stringToParse.length(); i++) {
            try {
                longRep = Long.parseLong(stringToParse);
                break;
            } catch (Throwable th) {
                if (stringToParse.length() > 1) {
                    stringToParse = stringToParse.substring(1, stringToParse.length());
                }
            }
        }

        return longRep;
    }

    public String formatDist(float meters) {
        if (meters < 1000) {
            return ((int) meters) + "m";
        } else if (meters < 10000) {
            return formatDec(meters / 1000f, 1) + "km";
        } else {
            return ((int) (meters / 1000f)) + "km";
        }
    }

    private String formatDec(float val, int dec) {
        int factor = (int) Math.pow(10, dec);

        int front = (int) (val);
        int back = (int) Math.abs(val * (factor)) % factor;

        return front + "." + back;
    }

}
