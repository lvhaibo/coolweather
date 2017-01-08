package com.example.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by T5-SK on 2017/1/8.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public Province(int id, int provinceCode, String provinceName) {
        this.id = id;
        this.provinceCode = provinceCode;
        this.provinceName = provinceName;
    }

    public Province() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
