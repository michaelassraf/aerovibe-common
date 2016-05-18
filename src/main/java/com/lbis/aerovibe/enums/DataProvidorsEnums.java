package com.lbis.aerovibe.enums;

public enum DataProvidorsEnums {

    IsraeliMinistryofEnvoirment("Israeli Ministry of Envoirment", "imoe_", "http://www.j-v.org.il/_uploads/imagesgallery/haganat_hasviva.gif", "The Ministry of Environmental Protection is responsible for the formulation of a nationwide, integrated, and inclusive policy for the protection of the environment.\nThe ministry was established in December 1988 by Govt. Decision No. 5. This proved a landmark in Israel\'s environmental development and in the government\'s determination to tackle environmental issues.\nIn June 2006, in Decision No. 193, Israel\'s Cabinet approved a request by Environmental Minister Gideon Ezra to change the ministry\'s name to the Ministry of Environmental Protection. Ezra explained, \"The change in name better reflects our current perception of the ministry\'s aims. The environment in Israel needs protection and we do this day by day, hour by hour.\"", "http://www.sviva.gov.il/"), 
    ELM("ELM", "elm_", "http://legacy.lbisgroup.com/Airbase/elm-logo.jpg","For more than 75 years, we at PerkinElmer have devoted our technologies, our expertise, and our energies in furthering the science of human and environmental health. We\u2019re leading the way, leveraging our technologies and expertise in detection, imaging, informatics, and services to deliver the real-world solutions that help our customers meet their customers\u2019 most daunting scientific challenges.", "http://elm.perkinelmer.com/"), 
    AirQualityBeijing("Air Quality Beijing", "air_quality_beijing_", "http://li600-131.members.linode.com/aqicn.png", "The aqicn.org is a young and dynamic team located in Beijing, China, and composed of several contributors working in the area of System Engineering, Product Design, Sensor and IOT Technologies as well as Linguistic. \nThe team is also getting support from several mentors and advisers in the area of Environmental Studies and Engineering.","http://aqicn.org/"), 
    AirQualityEgg("Air Quality Egg", "air_qulity_egg_", "https://s3.amazonaws.com/ksr/projects/107365/photo-main.jpg?1397775036", "The Air Quality Egg is a sensor system designed to allow anyone to collect very high resolution readings of NO2 and CO concentrations outside of their home.  These two gases are the most indicative elements related to urban air pollution that are sense-able by inexpensive, DIY sensors.", "http://airqualityegg.com/");

    private final String name;
    private final String objectKeyPrefix;
    private final String photoUrl;
    private final String about;
    private final String link;
    
    public static final transient String DATA_PROVIDOR_ENUM_ID = "dataProvidorsEnumsId";

    DataProvidorsEnums(String name, String objectKeyPrefix, String photoUrl, String about, String link) {
        this.name = name;
        this.objectKeyPrefix = objectKeyPrefix;
        this.photoUrl = photoUrl;
        this.about = about;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public String getObjectKeyPrefix() {
        return objectKeyPrefix;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

	public String getAbout() {
		return about;
	}

	public String getLink() {
		return link;
	}
    
}
