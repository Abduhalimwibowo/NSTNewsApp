package com.example.abduhalimwibowo.nstnewsapp.Common;

import com.example.abduhalimwibowo.nstnewsapp.Interface.IconBetterIdeaService;
import com.example.abduhalimwibowo.nstnewsapp.Interface.NewsService;
import com.example.abduhalimwibowo.nstnewsapp.Remote.IconBetterIdeaClient;
import com.example.abduhalimwibowo.nstnewsapp.Remote.RetrofitClient;

/**
 * Created by Abdu Halim Wibowo on 23/04/2018.
 */

public class Common {
    private static final String BASE_URL="https://newsapi.org/";

    public  static final String API_KEY="0f388c1592944077b56b78ed3ce9977d";

    public static NewsService getNewsService()
    {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }

    public static IconBetterIdeaService getIconService()
    {
        return IconBetterIdeaClient.getClient().create(IconBetterIdeaService.class);
    }

    //https://newsapi.org/v1/articles?source=the-next-web&sortBy=latest&apiKey=a7072d9c2ad9495a8dd5cb58a7fd30df
    public static String getAPIUrl(String source,String sortBy,String apiKEY)
    {
        StringBuilder apiUrl = new StringBuilder("https://newsapi.org/v2/top-headlines?sources=");
        return apiUrl.append(source)
                .append("&apiKey=")
                .append(apiKEY)
                .toString();
    }


}
