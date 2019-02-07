package com.salim.seelaptop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.telecom.Call;
import android.util.Log;

import java.util.List;

import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.list);

        list.setLayoutManager(new LinearLayoutManager(this));

        getData1();
    }

    private void getData1() {
        ApiService apiService = ConfigureRetrofit.getInstence();

        retrofit2.Call<ResponseLaptop> call = apiService.tampil();

        call.enqueue(new Callback<ResponseLaptop>() {
            @Override
            public void onResponse(retrofit2.Call<ResponseLaptop> call, Response<ResponseLaptop> response) {
                Log.d("Response", "Success" + response.body().toString());

                int status = response.body().getStatus();

                if (status == 1){
                    List<DataLaptop> dataLaptop = response.body().getDataLaptop();

                    Log.d("Data Laptop", dataLaptop.toString());

                    ListAdapter adapter = new ListAdapter(MainActivity.this, dataLaptop);

                    list.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(retrofit2.Call<ResponseLaptop> call, Throwable t) {

            }
        });
    }
}
