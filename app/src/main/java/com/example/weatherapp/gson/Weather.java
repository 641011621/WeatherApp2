package com.example.weatherapp.gson;

import com.google.gson.annotations.SerializedName;
/*此类用来创建一个weather对象，在显示天气功能中可直接调用*/
public class Weather {
    @SerializedName("province")
    public String provinceName;

    @SerializedName("city")
    public String cityName;

    @SerializedName("adcode")
    public String adcodeName;

    @SerializedName("weather")
    public String weatherName;

    @SerializedName("temperature")
    public String temperatureName;

    @SerializedName("winddirection")
    public String windDirection;

    @SerializedName("windpower")
    public String windPower;

    @SerializedName("humidity")
    public String humidityName;

    @SerializedName("reporttime")
    public String reportTimeName;

}
