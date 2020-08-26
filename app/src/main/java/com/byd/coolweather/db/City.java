package com.byd.coolweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {

    private int mId;
    private String mCityName;
    private int mCityCode;
    private int mProvinceId;

    public int getId() {
        return mId;
    }

    public void setInt(int id) {
        mId = id;
    }

    public String getCityName() {
        return mCityName;
    }

    public void setCityName(String cityName) {
        mCityName = cityName;
    }

    public int getCityCode() {
        return mCityCode;
    }

    public void setCityCode(int cityCode) {
        mCityCode = cityCode;
    }

    public int getProvinceId() {
        return mProvinceId;
    }

    public void setProvinceId(int provinceId) {
        mProvinceId = provinceId;
    }
}
