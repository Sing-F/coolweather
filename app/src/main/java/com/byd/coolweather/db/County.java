package com.byd.coolweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int mId;
    private String mCountyName;
    private String mWeatherId;
    private int mCityId;

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmCountyName() {
        return mCountyName;
    }

    public void setmCountyName(String mCountyName) {
        this.mCountyName = mCountyName;
    }

    public String getmWeatherId() {
        return mWeatherId;
    }

    public void setmWeatherId(String mWeatherId) {
        this.mWeatherId = mWeatherId;
    }

    public int getmCityId() {
        return mCityId;
    }

    public void setmCityId(int mCityId) {
        this.mCityId = mCityId;
    }
}
