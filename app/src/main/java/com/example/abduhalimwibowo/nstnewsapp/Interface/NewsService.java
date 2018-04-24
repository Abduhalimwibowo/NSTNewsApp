package com.example.abduhalimwibowo.nstnewsapp.Interface;

import com.example.abduhalimwibowo.nstnewsapp.Common.Common;
import com.example.abduhalimwibowo.nstnewsapp.Model.News;
import com.example.abduhalimwibowo.nstnewsapp.Model.WebSite;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Abdu Halim Wibowo on 23/04/2018.
 */

public interface NewsService {
    @GET("v2/sources?language=en&apiKey="+ Common.API_KEY)
    Call<WebSite> getSources();

    @GET
    Call<News> getNewestArticles(@Url String url);
}
