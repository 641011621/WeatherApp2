package com.example.weatherapp.db;

import org.litepal.crud.LitePalSupport;
/*用litepal数据库保存所有的省级数据*/
public class Province extends LitePalSupport {
    private String provinceName;
    private String  provinceCode;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String  getProvinceCode() { return provinceCode; }

    public void setProvinceCode(String  provinceCode) {
        this.provinceCode = provinceCode;
    }
}
