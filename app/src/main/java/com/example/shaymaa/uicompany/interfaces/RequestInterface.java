package com.example.shaymaa.uicompany.interfaces;

import com.example.shaymaa.uicompany.data.JSONResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Shaymaa on 6/23/2017.
 */

public interface RequestInterface {

    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON();
}
