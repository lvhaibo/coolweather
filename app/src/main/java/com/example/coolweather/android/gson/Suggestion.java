package com.example.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by T5-SK on 2017/1/9.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfor;
    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
