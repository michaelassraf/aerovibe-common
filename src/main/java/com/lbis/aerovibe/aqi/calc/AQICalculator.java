/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lbis.aerovibe.aqi.calc;

import com.lbis.aerovibe.enums.AQILevels;
import com.lbis.aerovibe.model.SensorMeasurement;
import com.lbis.aerovibe.model.SensorMeasurementValue;
import java.util.ArrayList;

public class AQICalculator {

    static AQICalculator instance = null;

    public static AQICalculator getInstance() {
        if (instance == null) {
            instance = new AQICalculator();
        }
        return instance;
    }

    public int calcMaxAQI(SensorMeasurement sensorMeasurement) {
        ArrayList<SensorMeasurementValue> values = sensorMeasurement.getSensorMeasurementValues();
        int maxAQIValue = 0;

        for (SensorMeasurementValue currentValue : values) {
            float currentFloatValue = currentValue.getSensorMeasurementValueValue();
            int currentAQIValue = 0;
            switch (currentValue.getSensorMeasurementPollutantsEnums()) {
                case CO:
                    if (currentFloatValue >= 0f && currentFloatValue < 4.5f) {
                        currentAQIValue = getAQIForPoluttant(50f, 0f, 4.4f, 0f, currentFloatValue);
                    } else if (currentFloatValue >= 4.5 && currentFloatValue < 9.5) {
                        currentAQIValue = getAQIForPoluttant(100f, 51f, 9.4f, 4.5f, currentFloatValue);
                    } else if (currentFloatValue >= 9.5f && currentFloatValue < 12.5f) {
                        currentAQIValue = getAQIForPoluttant(150f, 101f, 12.4f, 9.5f, currentFloatValue);
                    } else if (currentFloatValue >= 12.5f && currentFloatValue < 15.5f) {
                        currentAQIValue = getAQIForPoluttant(200f, 151f, 15.4f, 12.5f, currentFloatValue);
                    } else if (currentFloatValue >= 15.5f && currentFloatValue < 30.5f) {
                        currentAQIValue = getAQIForPoluttant(300f, 201f, 30.4f, 15.5f, currentFloatValue);
                    } else if (currentFloatValue >= 30.5f && currentFloatValue < 40.5f) {
                        currentAQIValue = getAQIForPoluttant(400f, 301f, 40.4f, 30.5f, currentFloatValue);
                    } else if (currentFloatValue >= 40.5f && currentFloatValue < 50.5f) {
                        currentAQIValue = getAQIForPoluttant(500f, 401f, 50.4f, 40.5f, currentFloatValue);
                    }
                    break;
                case PM10:
                    if (currentFloatValue >= 0f && currentFloatValue < 55f) {
                        currentAQIValue = getAQIForPoluttant(50f, 0f, 54f, 0f, currentFloatValue);
                    } else if (currentFloatValue >= 55f && currentFloatValue < 155f) {
                        currentAQIValue = getAQIForPoluttant(100f, 51f, 154f, 55f, currentFloatValue);
                    } else if (currentFloatValue >= 155f && currentFloatValue < 255f) {
                        currentAQIValue = getAQIForPoluttant(150f, 101f, 254f, 155f, currentFloatValue);
                    } else if (currentFloatValue >= 255f && currentFloatValue < 355f) {
                        currentAQIValue = getAQIForPoluttant(200f, 151f, 354f, 255f, currentFloatValue);
                    } else if (currentFloatValue >= 355f && currentFloatValue < 425f) {
                        currentAQIValue = getAQIForPoluttant(300f, 201f, 424f, 355f, currentFloatValue);
                    } else if (currentFloatValue >= 425f && currentFloatValue < 505f) {
                        currentAQIValue = getAQIForPoluttant(400f, 301f, 504f, 425f, currentFloatValue);
                    } else if (currentFloatValue >= 505f && currentFloatValue < 605f) {
                        currentAQIValue = getAQIForPoluttant(500f, 401f, 604f, 505f, currentFloatValue);
                    }
                    break;
                case PM2_5:
                    if (currentFloatValue >= 0f && currentFloatValue < 12.1f) {
                        currentAQIValue = getAQIForPoluttant(50f, 0f, 12f, 0f, currentFloatValue);
                    } else if (currentFloatValue >= 12.1f && currentFloatValue < 35.5f) {
                        currentAQIValue = getAQIForPoluttant(100f, 51f, 35.4f, 12.1f, currentFloatValue);
                    } else if (currentFloatValue >= 35.5f && currentFloatValue < 55.5f) {
                        currentAQIValue = getAQIForPoluttant(150f, 101f, 55.4f, 35.5f, currentFloatValue);
                    } else if (currentFloatValue >= 55.5f && currentFloatValue < 150.5f) {
                        currentAQIValue = getAQIForPoluttant(200f, 151f, 150.4f, 55.5f, currentFloatValue);
                    } else if (currentFloatValue >= 150.5f && currentFloatValue < 250.5f) {
                        currentAQIValue = getAQIForPoluttant(300f, 201f, 250.4f, 150.5f, currentFloatValue);
                    } else if (currentFloatValue >= 250.5f && currentFloatValue < 350.5f) {
                        currentAQIValue = getAQIForPoluttant(400f, 301f, 350.4f, 250.5f, currentFloatValue);
                    } else if (currentFloatValue >= 350.5f && currentFloatValue < 500.5f) {
                        currentAQIValue = getAQIForPoluttant(500f, 401f, 500.4f, 350.5f, currentFloatValue);
                    }
                    break;
                case SO2:
                    if (currentFloatValue >= 0f && currentFloatValue < 36f) {
                        currentAQIValue = getAQIForPoluttant(50f, 0f, 35f, 0f, currentFloatValue);
                    } else if (currentFloatValue >= 36f && currentFloatValue < 76f) {
                        currentAQIValue = getAQIForPoluttant(100f, 51f, 75f, 36f, currentFloatValue);
                    } else if (currentFloatValue >= 76f && currentFloatValue < 186f) {
                        currentAQIValue = getAQIForPoluttant(150f, 101f, 185f, 76f, currentFloatValue);
                    } else if (currentFloatValue >= 186f && currentFloatValue <= 304f) {
                        currentAQIValue = getAQIForPoluttant(200f, 151f, 304f, 186f, currentFloatValue);
                    }
                    break;
                case O3:
                    if (currentFloatValue > 1) {
                        currentFloatValue = currentFloatValue / 1000;
                    }
                    if (currentFloatValue >= .125f && currentFloatValue < .165f) {
                        currentAQIValue = getAQIForPoluttant(150f, 101f, .164f, .125f, currentFloatValue);
                    } else if (currentFloatValue >= .165f && currentFloatValue < .205f) {
                        currentAQIValue = getAQIForPoluttant(200f, 151f, .204f, .165f, currentFloatValue);
                    } else if (currentFloatValue >= .205f && currentFloatValue < .405f) {
                        currentAQIValue = getAQIForPoluttant(300f, 201f, .404f, .205f, currentFloatValue);
                    } else if (currentFloatValue >= .405f && currentFloatValue < .505f) {
                        currentAQIValue = getAQIForPoluttant(400f, 301f, .504f, .405f, currentFloatValue);
                    } else if (currentFloatValue >= .505f && currentFloatValue < .605f) {
                        currentAQIValue = getAQIForPoluttant(500f, 401f, .604f, .505f, currentFloatValue);
                    }

                    break;
                case No2:
                    currentFloatValue = currentFloatValue / 1000;
                    if (currentFloatValue >= 0f && currentFloatValue < .054f) {
                        currentAQIValue = getAQIForPoluttant(50f, 0f, .053f, 0f, currentFloatValue);
                    } else if (currentFloatValue >= .054f && currentFloatValue < .101f) {
                        currentAQIValue = getAQIForPoluttant(100f, 51f, .100f, .054f, currentFloatValue);
                    } else if (currentFloatValue >= .101f && currentFloatValue < .361f) {
                        currentAQIValue = getAQIForPoluttant(150f, 101f, .360f, .101f, currentFloatValue);
                    } else if (currentFloatValue >= .361f && currentFloatValue < .650f) {
                        currentAQIValue = getAQIForPoluttant(200f, 151f, .649f, .361f, currentFloatValue);
                    } else if (currentFloatValue >= .650f && currentFloatValue < 1.250f) {
                        currentAQIValue = getAQIForPoluttant(300f, 201f, 1.249f, .650f, currentFloatValue);
                    } else if (currentFloatValue >= 1.250f && currentFloatValue < 1.650f) {
                        currentAQIValue = getAQIForPoluttant(400f, 301f, 1.649f, 1.250f, currentFloatValue);
                    } else if (currentFloatValue >= 1.650f && currentFloatValue <= 2.049f) {
                        currentAQIValue = getAQIForPoluttant(500f, 401f, 2.049f, 1.650f, currentFloatValue);
                    }
                    break;
                default:
                    break;
            }
            if (currentAQIValue > maxAQIValue) {
                maxAQIValue = currentAQIValue;
            }
        }
        return maxAQIValue;
    }

    private int getAQIForPoluttant(float highAQI, float lowAQI, float highConc, float lowConc, float value) {
        int aQIForPoluttant;
        float aQIForPoluttantFloat = ((value - lowConc) / (highConc - lowConc)) * (highAQI - lowAQI) + lowAQI;
        aQIForPoluttant = Math.round(aQIForPoluttantFloat);
        return aQIForPoluttant;
    }

    public AQILevels getAQILevelForAQILevelNumber(int aQILevel) {
        if (aQILevel > 0 && aQILevel <= 50) {
            return AQILevels.Excellent;
        }

        if (aQILevel > 50 && aQILevel <= 100) {
            return AQILevels.Good;
        }

        if (aQILevel > 100 && aQILevel <= 150) {
            return AQILevels.Lightly_Polluted;
        }

        if (aQILevel > 150 && aQILevel <= 200) {
            return AQILevels.Moderately_Polluted;
        }

        if (aQILevel > 200 && aQILevel <= 300) {
            return AQILevels.Heavily_Polluted;
        }

        if (aQILevel > 300) {
            return AQILevels.Severely_Polluted;
        }
        return AQILevels.NOT_ACTIVE;

    }

}
