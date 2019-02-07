package com.salim.seelaptop;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

/**
 * Created by salim on 5/1/18.
 */

public interface ApiService {
    @GET("getLaptop")
    Call<ResponseLaptop> tampil();
}
