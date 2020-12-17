package com.example.weatherapp.gson;

import com.google.gson.annotations.SerializedName;
/*gson解析高德api返回的lives信息*/
public class Gaode {
    @SerializedName("0")
    public More more;

    public class More {
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

        @SerializedName("humidity")
        public String humidityName;

        @SerializedName("reporttime")
        public String reportTimeName;
    }
}
