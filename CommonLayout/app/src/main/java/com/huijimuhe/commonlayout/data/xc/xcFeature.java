package com.huijimuhe.commonlayout.data.xc;

import java.util.List;

/**
 * Copyright (C) 2016 Huijimuhe Technologies. All rights reserved.
 * Contact: 20903213@qq.com Zengweizhou
 */
public class xcFeature {

    /**
     * id : 10567
     * site_id : 930
     * title : 拿技术说话的
     十家精品咖啡馆
     * sub_title : TOP1 ON.E Cafe & Bar
     * image : h
     * thumbnail : h
     * icon : http://www.51xiancheng.com/public/img/subject_icons/icon_perimeter.png
     * h5url : http://beijing.51xiancheng.com/index/hot/detail?id=10567
     * desc : 帝都里值得慢品度过的咖啡小店
     * tag : 休闲时光 Relaxation
     * color2 : #0ac145
     * icon1 : http://img.iot.sina.cn/ota/image/xiancheng/subjectV2_icon_leisure/file1434443630344.png
     * icon2 : http://img.iot.sina.cn/ota/image/xiancheng/subjectV2_icon2_leisure/file1434443299048.png
     * type : 6
     */

    private int id;
    private int site_id;
    private String title;
    private String sub_title;
    private String image;
    private String thumbnail;
    private String icon;
    private String h5url;
    private String desc;
    private String tag;
    private String color2;
    private String icon1;
    private String icon2;
    private int type;
    private List<xcArticle> articles;
    public void setId(int id) {
        this.id = id;
    }

    public void setSite_id(int site_id) {
        this.site_id = site_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSub_title(String sub_title) {
        this.sub_title = sub_title;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setH5url(String h5url) {
        this.h5url = h5url;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public void setIcon1(String icon1) {
        this.icon1 = icon1;
    }

    public void setIcon2(String icon2) {
        this.icon2 = icon2;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public int getSite_id() {
        return site_id;
    }

    public String getTitle() {
        return title;
    }

    public String getSub_title() {
        return sub_title;
    }

    public String getImage() {
        return image;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getIcon() {
        return icon;
    }

    public String getH5url() {
        return h5url;
    }

    public String getDesc() {
        return desc;
    }

    public String getTag() {
        return tag;
    }

    public String getColor2() {
        return color2;
    }

    public String getIcon1() {
        return icon1;
    }

    public String getIcon2() {
        return icon2;
    }

    public int getType() {
        return type;
    }

    public List<xcArticle> getArticles() {
        return articles;
    }

    public void setArticles(List<xcArticle> articles) {
        this.articles = articles;
    }
}
