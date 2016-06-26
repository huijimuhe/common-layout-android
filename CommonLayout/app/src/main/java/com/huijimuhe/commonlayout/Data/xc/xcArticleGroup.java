package com.huijimuhe.commonlayout.data.xc;

import java.util.List;

/**
 * Created by Huijimuhe on 2016/6/23.
 * This is a part of Lanwen
 * enjoy
 */
public class xcArticleGroup {

    /**
     * id : 11083
     * site_id : 903
     * title : 吹着空调吃火锅，爽！
     * sub_title : 不管雨天或暴晒 选火锅没错
     * image : http://s3img.city.sina.com.cn/xiancheng/common/thumbnail/0/cc515c0d4376be9e87525cbb86b0eb5e.jpg
     * date : 2016-06-22
     * color : #2e77e3
     * thumbnail : http://s3img.city.sina.com.cn/xiancheng/common/thumbnail/1/cc515c0d4376be9e87525cbb86b0eb5e.jpg
     * icon : http://www.51xiancheng.com/public/img/subject_icons/icon_food.png
     * h5url : http://chengdu.51xiancheng.com/subject/11083
     * tag : 美食佳肴 Delicacies
     * color2 : #f45a45
     * icon1 : http://img.iot.sina.cn/ota/image/xiancheng/subjectV2_icon_food/file1434443406123.png
     * icon2 : http://img.iot.sina.cn/ota/image/xiancheng/subjectV2_icon2_food/file1434443002640.png
     * type : 1
     */

    private int id;
    private int site_id;
    private String title;
    private String sub_title;
    private String image;
    private String date;
    private String color;
    private String thumbnail;
    private String icon;
    private String h5url;
    private String tag;
    private String color2;
    private String icon1;
    private String icon2;
    private List<xcArticle> articles;
    private int type;

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

    public void setDate(String date) {
        this.date = date;
    }

    public void setColor(String color) {
        this.color = color;
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

    public String getDate() {
        return date;
    }

    public String getColor() {
        return color;
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
}
