package com.gcdev.projects.servicios;

import com.gcdev.projects.modelos.apiResponse;
import com.google.gson.Gson;
import static com.gcdev.projects.utils.apiURL.getApiUrl;
import java.util.Map;


public class converter extends apiClient {

    private static final String getApiUrl = getApiUrl();

    public double convertir (String monedaOrigen, String monedaDestino, double monto) throws Exception {
        String endpoint = getApiUrl + monedaOrigen;
        String response = request(endpoint);

        Gson gson = new Gson();
        apiResponse apiResponse = gson.fromJson(response, apiResponse.class);
        Map<String, Double> conversionRates = apiResponse.getConversion_rates();

        if (!conversionRates.containsKey(monedaDestino)) {
            throw new IllegalArgumentException("La moneda destino no está disponible.");
        }

        double tasaDestino = conversionRates.get(monedaDestino);

        return monto * tasaDestino;
    }
}
