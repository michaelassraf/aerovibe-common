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
public enum PollutantsEnums {

    PM2_5("ug/m3", "Fine atmospheric particulate matter", "Particle pollution (also known as \"particulate matter\") in the air includes a mixture of solids and liquid droplets. Particles less than 2.5 micrometers in diameter are called \"fine\" particles. These particles are so small they can be detected only with an electron microscope. Sources of fine particles include all types of combustion, including motor vehicles, power plants, residential wood burning, forest fires, agricultural burning, and some industrial processes.", new String[]{"PM2.5", "PM25", "PM2_5"}, 500.4f, "Fine atmospheric\nparticulate matter(PM2.5)"),
    PM10("ug/m3", "Coarse dust particles", "Particle pollution (also known as \"particulate matter\") in the air includes a mixture of solids and liquid droplets. Particles between 2.5 and 10 micrometers in diameter are referred to as \"coarse.\" Sources of coarse particles include crushing or grinding operations, and dust stirred up by vehicles traveling on roads.", new String[]{"PM10", "PM_10"}, 500f, "Coarse dust\nparticles(PM10)"),
    CO2("ppm", "Carbon dioxide", "Colourless, odourless and non-poisonous gas formed by combustion of carbon and in the respiration of living organisms and is considered a greenhouse gas. Emissions means the release of greenhouse gases and/or their precursors into the atmosphere over a specified area and period of time.", new String[]{"CO2", "CO_2"}, 600f, "Carbon\ndioxide(CO2)"),
    CO("ppm", "Carbon monoxide", " a colorless, odorless and tasteless gas. Too much carbon monoxide in the air you breathe can greatly diminish your ability to absorb oxygen, leading to serious tissue damage. Carbon monoxide poisoning can lead to death.", new String[]{"CO", "C_O"}, 500f, "Carbon\nmonoxide(CO)"),
    SO2("ppb", "Sulfur dioxide", "Fossil fuels contain traces of sulphur compounds, and SO2 is produced when they are burnt. The majority of the SO2 emitted to the air is from power generation, and the contribution from transport sources is small (shipping being an exception). Exposure to SO2 can damage health by its action on the bronchial system. Sulphuric acid generated from atmospheric reactions of SO2 is the main constituent of acid rain, and ammonium sulphate particles are the most abundant secondary particles found in air.", new String[]{"SO2", "SO_2"}, 500f, "Sulfur\ndioxide(SO2)"),
    O3("ppb", "Ground-level ozone (O3)", "Unlike other pollutants mentioned, is not emitted directly into the atmosphere, but is a secondary pollutant produced by reaction between nitrogen dioxide (NO2), hydrocarbons and sunlight. Ozone levels are not as high in urban areas (where high levels of NO are emitted from vehicles) as in rural areas. Sunlight provides the energy to initiate ozone formation; consequently, high levels of ozone are generally observed during hot, still sunny, summertime weather.", new String[]{"O_3", "O3"}, 500f, "Ground-level\nozone(O3)"),
    No2("ppb", "Nitrogen dioxide", "A poisonous brown gas, NO2, often found in smog and automobile exhaust fumes and synthesized for use as a nitrating agent, a catalyst, and an oxidizing agent.", new String[]{"No2", "NO2", "NO_2"}, 500f, "Nitrogen\ndioxide(NO2)"),
    Nox("ppb", "Nitrogen oxides", "Describe a mixture of nitric oxide (NO) and nitrogen dioxide (NO2). They are inorganic gases formed by combination of oxygen with nitrogen from the air. NO is produced in much greater quantities than NO2, but oxidises to NO2 in the atmosphere. NO2 causes detrimental effects to the bronchial system. Nitrogen dioxide concentrations frequently approach, and sometimes exceed air quality standards in many European cities. NOx is emitted when fuel is being burned e.g. in transport, industrial processes and power generation.", new String[]{"Nox", "NOX", "NO_X"}, 600f, "Nitrogen\noxides(NOx)"),
    Temperature("°c", "Temperature", "A measure of the warmth or coldness of an object or substance with reference to some standard value. The temperature of two systems is the same when the systems are in thermal equilibrium.", new String[]{"Temperature", "Temp"}, 65f, "Temperature"),
    Dust("µg/m3", "Dust", "fine, dry powder consisting of tiny particles of earth or waste matter lying on the ground or on surfaces or carried in the air.", new String[]{"Dust"}, 1000f, "Dust"),
    HCAndTotalVOC("ppb", "Hydrocarbons (HC) and volatile organic compounds (VOC)", "HC belong to a larger group of chemicals known as volatile organic compounds (VOC). HC are compounds of hydrogen and carbon only, while VOC may contain other elements. They are produced by incomplete combustion of hydrocarbon fuels, and also by their evaporation. Because there are many hundreds of different compounds, HC and VOC display a wide range of properties. Some, such as benzene, are carcinogenic; some are toxic and others harmless to health.", new String[]{"HC", "TotalVOC", "Total_VOC", "VOC"}, 999f, "Hydrocarbons (HC) and volatile\norganic compounds (VOC)"),
    Noise("db", "Noise pollution", "Refers to a type of energy pollution in which distracting, irritating or damaging sounds are freely audible. With this type of pollution, contaminants are not physical particles, but rather waves that interfere with naturally-occurring waves of a similar type in the same environment. Industries, automobiles and some entertainment joints are some of the sources of noise pollution.", new String[]{"Noise"}, 100f, "Noise\npollution"),
    Benzene("ppb", "Benzene", "A liquid hydrocarbon, C6H6, from coal tar; used as a solvent. It is toxic by transdermal absorption, ingestion, or inhalation; chronic exposure may cause bone marrow depression and aplasia and leukemia.", new String[]{"Benzene", "Benzen"}, 70f, "Benzene(C6H6)"),
    Toluene("ppb", "Toluene", "A liquid aromatic hydrocarbon C7H8 that resembles benzene but is less volatile, flammable, and toxic and is used especially as a solvent, in organic synthesis, and as an antiknock agent for gasoline.", new String[]{"Toluene", "Toluen"}, 600f, "Toluene(CH3)"),
    AirQualityIndex("aqi", "Air Quality Index", "The AQI is an index for reporting daily air quality. It tells you how clean or polluted your air is, and what associated health effects might be a concern for you.", null, 500f, "Air Quality Index");

    public static final transient String POLLUTANT_ENUM_ID = "pollutantsEnumId";

    private final String pollutantsEnumUnitsName;
    private final String pollutantsEnumUnitsDescription;
    private final String pollutantsEnumUnitsTitle;
    private final Float pollutantsEnumMaxLevel;
    private final String[] pollutantsEnumAliases;
    private final String pollutantsEnumUnitsFormattedTitle;

    private PollutantsEnums(String pollutantsEnumUnitsName, String pollutantsEnumUnitsTitle, String pollutantsEnumUnitsDescription, String[] pollutantsEnumAliases, Float pollutantsEnumMaxLevel, String pollutantsEnumUnitsFormattedTitle) {
        this.pollutantsEnumUnitsName = pollutantsEnumUnitsName;
        this.pollutantsEnumUnitsTitle = pollutantsEnumUnitsTitle;
        this.pollutantsEnumUnitsDescription = pollutantsEnumUnitsDescription;
        this.pollutantsEnumMaxLevel = pollutantsEnumMaxLevel;
        this.pollutantsEnumAliases = pollutantsEnumAliases;
        this.pollutantsEnumUnitsFormattedTitle = pollutantsEnumUnitsFormattedTitle;
    }

    public String getPollutantsEnumUnitsName() {
        return pollutantsEnumUnitsName;
    }

    public String getPollutantsEnumUnitsDescription() {
        return pollutantsEnumUnitsDescription;
    }

    public String getPollutantsEnumUnitsTitle() {
        return pollutantsEnumUnitsTitle;
    }

    public Float getPollutantsEnumMaxLevel() {
        return pollutantsEnumMaxLevel;
    }

    public String[] getPollutantsEnumAliases() {
        return pollutantsEnumAliases;
    }

    public String getPollutantsEnumUnitsFormattedTitle() {
        return pollutantsEnumUnitsFormattedTitle;
    }

}
