package com.byd.coolweather.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {

    private int mId;
    private String mProvinceName;
    private int mProvinceCode;

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmProvinceName() {
        return mProvinceName;
    }

    public void setmProvinceName(String mProvinceName) {
        this.mProvinceName = mProvinceName;
    }

    public int getmProvinceCode() {
        return mProvinceCode;
    }

    public void setmProvinceCode(int mProvinceCode) {
        this.mProvinceCode = mProvinceCode;
    }
}
