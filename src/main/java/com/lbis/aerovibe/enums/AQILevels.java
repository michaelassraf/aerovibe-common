/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lbis.aerovibe.enums;

/**
 *
 * @author Development User
 */
public enum AQILevels {

    Excellent("#00e400", 120.0f, "Excellent"), Good("#d2d600", 60.0f, "Good"), Lightly_Polluted("#ff7e00", 30.0f, "Lightly Polluted"), Moderately_Polluted("#ff0000", 0.0f, "Moderately Polluted"), Heavily_Polluted("#99004c", 270.0f, "Heavily Polluted"), Severely_Polluted("#7e0023", 270.0f, "Severely Polluted"), NOT_ACTIVE("#C0C0C0", 270.0f, "Non Active");

    public static final transient String AQI_LEVEL_ENUM_ID = "aQILevelEnumId";
    
    private String aQILevelsColor;
    private Float aQILevelsMarkerColor;
    private String aQILevelsName;

    private AQILevels(String aQILevelsColor, Float aQILevelsMarkerColor, String aQILevelsName) {
        this.aQILevelsColor = aQILevelsColor;
        this.aQILevelsMarkerColor = aQILevelsMarkerColor;
        this.aQILevelsName = aQILevelsName;
    }

    public String getaQILevelsColor() {
        return aQILevelsColor;
    }

    public String getaQILevelsName() {
        return aQILevelsName;
    }

    public Float getaQILevelsMarkerColor() {
        return aQILevelsMarkerColor;
    }

}
