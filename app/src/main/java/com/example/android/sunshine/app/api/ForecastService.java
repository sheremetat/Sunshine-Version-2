package com.example.android.sunshine.app.api;

import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Sunshine-Version-2
 * Created by sheremetat on 3/17/15.
 */
public interface ForecastService {
    public String BASE_API_URL = "http://api.openweathermap.org/data/2.5";

    @GET("/forecast/daily")
    DailyForecast getDailyForecast(@Query("q") String query,
                                   @Query("mode") String mode,
                                   @Query("units") String units,
                                   @Query("ctn") int days);
}
