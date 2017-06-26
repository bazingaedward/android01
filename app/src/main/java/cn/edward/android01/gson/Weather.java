package cn.edward.android01.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by qiukaixiang on 17/5/5.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
