package com.example.weatherapp.db;

import org.litepal.crud.LitePalSupport;
/*用litepal数据库保存所有的市级数据*/
public class City extends LitePalSupport {
    private String cityName;
    private String cityCode;
    private String provinceCode;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getProvinceCode(){
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
}
