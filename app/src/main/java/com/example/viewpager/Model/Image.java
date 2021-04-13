package com.example.viewpager.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Image {

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("responseArray")
    @Expose
    private ResponseArray responseArray;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ResponseArray getResponseArray() {
        return responseArray;
    }

    public void setResponseArray(ResponseArray responseArray) {
        this.responseArray = responseArray;
    }

}