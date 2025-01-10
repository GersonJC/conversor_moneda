package com.gcdev.projects.utils;

public class apiURL {
    private static final String url = "https://v6.exchangerate-api.com/v6/";
    private static final String apikey = "8d417e5c4b366fd6ccd0a0ab";
    private static final String API_URL = url + apikey + "/latest/";

    public static String getApiUrl() {
        return API_URL;
    }
}
