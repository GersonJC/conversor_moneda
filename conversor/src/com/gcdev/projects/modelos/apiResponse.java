package com.gcdev.projects.modelos;

import java.util.Map;

public class apiResponse {
    private Map<String,Double> conversion_rates;

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }

    public void setConversion_rates(Map<String, Double> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }
}
