package com.huijimuhe.commonlayout.data.xc;

import java.util.List;

/**
 * Created by Huijimuhe on 2016/6/22.
 * This is a part of Lanwen
 * enjoy
 */
public class xcIndexResponse {

    private List<xcBanner> ads_top;
    private List<xcSale> sales;
    private List<xcArticle> week_praise;
    private List<xcArticleGroup> subjects;
    private List<xcArticle> foods;
    private List<xcArticle> plays;

    public List<xcBanner> getAds_top() {
        return ads_top;
    }

    public void setAds_top(List<xcBanner> ads_top) {
        this.ads_top = ads_top;
    }

    public List<xcSale> getSales() {
        return sales;
    }

    public void setSales(List<xcSale> sales) {
        this.sales = sales;
    }

    public List<xcArticle> getWeek_praise() {
        return week_praise;
    }

    public void setWeek_praise(List<xcArticle> week_praise) {
        this.week_praise = week_praise;
    }

    public List<xcArticleGroup> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<xcArticleGroup> subjects) {
        this.subjects = subjects;
    }

    public List<xcArticle> getFoods() {
        return foods;
    }

    public void setFoods(List<xcArticle> foods) {
        this.foods = foods;
    }

    public List<xcArticle> getPlays() {
        return plays;
    }

    public void setPlays(List<xcArticle> plays) {
        this.plays = plays;
    }
}
