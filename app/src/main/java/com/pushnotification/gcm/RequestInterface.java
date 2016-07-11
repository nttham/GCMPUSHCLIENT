package com.pushnotification.gcm;

import com.pushnotification.gcm.models.RequestBody;
import com.pushnotification.gcm.models.ResponseBody;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestInterface {

    @POST("devices")
    Call<ResponseBody> registerDevice(@Body RequestBody body);
}
