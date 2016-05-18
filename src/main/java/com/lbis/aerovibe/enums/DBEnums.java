package com.lbis.aerovibe.enums;

public class DBEnums {

    public enum MANAGEMENT_BASIC_COMMANDS {

        BUILD("CREATE TABLE IF NOT EXISTS Management (userId TEXT PRIMARY KEY, tokenValue BLOB)", "Create"), DESTROY("DROP TABLE IF EXISTS Management (userId TEXT PRIMARY KEY, tokenValue BLOB)", "Destroy");

        private String command;
        private String description;

        MANAGEMENT_BASIC_COMMANDS(String command, String description) {
            this.command = command;
            this.description = description;
        }

        public String getCommandValue() {
            return command;
        }

        public String getCommandDescription() {
            return description;
        }
    }

    public enum BASIC_COMMANDS {

        BUILD("CREATE TABLE IF NOT EXISTS ", " (k TEXT PRIMARY KEY, v BLOB)", "Create"), DESTROY("DROP TABLE IF EXISTS ", "", "Destroy");

        private String basicCommandValue;
        private String bottomCommandValue;
        private String commandValueDescription;

        BASIC_COMMANDS(String basicCommandValue, String bottomCommandValue, String commandValueDescription) {
            this.basicCommandValue = basicCommandValue;
            this.bottomCommandValue = bottomCommandValue;
            this.commandValueDescription = commandValueDescription;
        }

        public String getBasicCommandValue() {
            return basicCommandValue;
        }

        public String getBottomCommandValue() {
            return bottomCommandValue;
        }

        public String getCommandValueDescription() {
            return commandValueDescription;
        }
    }

    public enum DBTables {

        Users, Sensors, SensorMeasurements, UserLocations, UserProfiles, UserMeasurements;
    }
}
