package com.example.abduhalimwibowo.nstnewsapp.Model;

import java.util.List;

/**
 * Created by Abdu Halim Wibowo on 23/04/2018.
 */

public class WebSite {
    private String status;
    private List<Source> sources;

    public WebSite() {
    }

    public WebSite(String status, List<Source> sources) {
        this.status = status;
        this.sources = sources;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Source> getSources() {
        return sources;
    }

    public void setSources(List<Source> sources) {
        this.sources = sources;
    }

}
