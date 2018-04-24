package com.example.abduhalimwibowo.nstnewsapp.Interface;

import com.example.abduhalimwibowo.nstnewsapp.Model.IconBetterIdea;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Abdu Halim Wibowo on 23/04/2018.
 */

public interface IconBetterIdeaService {
    @GET
    Call<IconBetterIdea> getIconUrl(@Url String url);

}
