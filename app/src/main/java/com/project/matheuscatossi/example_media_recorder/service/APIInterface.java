package com.project.matheuscatossi.example_media_recorder.service;


import com.project.matheuscatossi.example_media_recorder.model.Balance;
import com.project.matheuscatossi.example_media_recorder.utils.Constants;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by matheuscatossi on 5/15/17.
 */

public interface APIInterface {

    @GET(Constants.GET_BALANCE)
    Call<Balance> getBalance();



}
