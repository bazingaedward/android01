package cn.edward.android01.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by qiukaixiang on 17/5/5.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;

    }
}
