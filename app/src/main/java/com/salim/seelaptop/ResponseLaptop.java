package com.salim.seelaptop;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by salim on 5/1/18.
 */

class ResponseLaptop {
    @SerializedName("data_laptop")
    private List<DataLaptop> dataLaptop;

    @SerializedName("status")
    private int status;

    public List<DataLaptop> getDataLaptop() {
        return dataLaptop;
    }

    public void setDataLaptop(List<DataLaptop> dataLaptop) {
        this.dataLaptop = dataLaptop;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return "ResponseLaptop{"+"data_laptop = "+dataLaptop+"status"+status+"}";
    }
}
