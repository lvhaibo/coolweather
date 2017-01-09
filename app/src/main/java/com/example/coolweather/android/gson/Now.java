package com.example.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by T5-SK on 2017/1/9.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
