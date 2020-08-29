package com.byd.coolweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {

    private int mId;
    private String mCityName;
    private int mCityCode;
    private int mProvinceId;

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmCityName() {
        return mCityName;
    }

    public void setmCityName(String mCityName) {
        this.mCityName = mCityName;
    }

    public int getmCityCode() {
        return mCityCode;
    }

    public void setmCityCode(int mCityCode) {
        this.mCityCode = mCityCode;
    }

    public int getmProvinceId() {
        return mProvinceId;
    }

    public void setmProvinceId(int mProvinceId) {
        this.mProvinceId = mProvinceId;
    }
}
