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
public enum HTTPHeaders {

    TokenHeader("Aerovibe-Token"), UserHeader("Aerovibe-User"), UserLatitude("Aerovibe-User-Latitude"), UserLongitude("Aerovibe-User-Longitude"), GZIPHeader("gzip");

    private String hTTPHeaderValue;

    private HTTPHeaders(String hTTPHeaderValue) {
        this.hTTPHeaderValue = hTTPHeaderValue;
    }

    public String gethTTPHeaderValue() {
        return hTTPHeaderValue;
    }

    public static final String TokenHeaderValue = "Aerovibe-Token";
    public static final String UserHeaderValue = "Aerovibe-User";
    public static final String GZIPHeaderValue = "gzip";
}
