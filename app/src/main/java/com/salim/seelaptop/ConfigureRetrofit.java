package com.salim.seelaptop;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by salim on 5/1/18.
 */

class ConfigureRetrofit {
    public static String SERVER_URL = "http://192.168.20.30/Laptop/index.php/Api/";

    public static Retrofit setInit(){
        return new Retrofit.Builder().baseUrl(SERVER_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static ApiService getInstence(){
        return setInit().create(ApiService.class);
    }
}
