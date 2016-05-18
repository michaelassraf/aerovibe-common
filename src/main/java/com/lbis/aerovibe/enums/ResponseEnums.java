package com.lbis.aerovibe.enums;

public class ResponseEnums {

    public enum Responses {

        recordNotFound("The record was not found in the DB"), OK("All OK");
        private final String response;

        Responses(String response) {
            this.response = response;
        }

        public String getValue() {
            return response;
        }
    }
}
