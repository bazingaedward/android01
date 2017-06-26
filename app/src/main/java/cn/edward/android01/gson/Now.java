package cn.edward.android01.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by qiukaixiang on 17/5/5.
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
