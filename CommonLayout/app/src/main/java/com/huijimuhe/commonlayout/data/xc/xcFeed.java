package com.huijimuhe.commonlayout.data.xc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C) 2016 Huijimuhe Technologies. All rights reserved.
 * Contact: 20903213@qq.com Zengweizhou
 */
public class xcFeed {

    /**
     * content_type : FRESH
     * id : 490290
     * site_id : 930
     * account : {"xcid":1079417,"type":1,"ident":"1234504172","nickname":"","image":"h","intro":"7","is_editor":false,"is_push":false,"is_block":false,"wemedia_type":0,"site_id":0,"fake_id":2611052}
     * content :
     * praise_count : 119
     * is_praise : false
     * is_favorite : false
     * is_accuse : false
     * poi : {"name":"绿)","address":"崇层","area_name":"东城区","lon":116.418039,"lat":39.898459,"site_id":0,"is_foreign":false,"is_favorite":false}
     * images : [{"pid":"00107879jw3f5wsbk8xvyj20zk0np116","text":"","width":1280,"height":853}]
     * create_time : 2016-07-17 12:20:12
     * status : 0
     * audit_status : 0
     * from : 1
     * top_set : 0
     * comment_count : 2
     * credit : {"total":120,"praise_need":0}
     */

    private String content_type;
    private int id;
    private int site_id;
    private AccountEntity account;
    private String content;
    private int praise_count;
    private boolean is_praise;
    private boolean is_favorite;
    private boolean is_accuse;
    private PoiEntity poi;
    private String create_time;
    private int status;
    private int audit_status;
    private int from;
    private int top_set;
    private int comment_count;
    private CreditEntity credit;
    private List<ImagesEntity> images;

    public List<String> getImageUrlList() {
        List<String> urls = new ArrayList<>();
        for (ImagesEntity img : images) {
            urls.add(String.format("http://ww3.sinaimg.cn/wap360/%s.jpg", img.getPid()));
        }
        return urls;
    }

    public void setContent_type(String content_type) {
        this.content_type = content_type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSite_id(int site_id) {
        this.site_id = site_id;
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPraise_count(int praise_count) {
        this.praise_count = praise_count;
    }

    public void setIs_praise(boolean is_praise) {
        this.is_praise = is_praise;
    }

    public void setIs_favorite(boolean is_favorite) {
        this.is_favorite = is_favorite;
    }

    public void setIs_accuse(boolean is_accuse) {
        this.is_accuse = is_accuse;
    }

    public void setPoi(PoiEntity poi) {
        this.poi = poi;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setAudit_status(int audit_status) {
        this.audit_status = audit_status;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public void setTop_set(int top_set) {
        this.top_set = top_set;
    }

    public void setComment_count(int comment_count) {
        this.comment_count = comment_count;
    }

    public void setCredit(CreditEntity credit) {
        this.credit = credit;
    }

    public void setImages(List<ImagesEntity> images) {
        this.images = images;
    }

    public String getContent_type() {
        return content_type;
    }

    public int getId() {
        return id;
    }

    public int getSite_id() {
        return site_id;
    }

    public AccountEntity getAccount() {
        return account;
    }

    public String getContent() {
        return content;
    }

    public int getPraise_count() {
        return praise_count;
    }

    public boolean getIs_praise() {
        return is_praise;
    }

    public boolean getIs_favorite() {
        return is_favorite;
    }

    public boolean getIs_accuse() {
        return is_accuse;
    }

    public PoiEntity getPoi() {
        return poi;
    }

    public String getCreate_time() {
        return create_time;
    }

    public int getStatus() {
        return status;
    }

    public int getAudit_status() {
        return audit_status;
    }

    public int getFrom() {
        return from;
    }

    public int getTop_set() {
        return top_set;
    }

    public int getComment_count() {
        return comment_count;
    }

    public CreditEntity getCredit() {
        return credit;
    }

    public List<ImagesEntity> getImages() {
        return images;
    }

    public static class AccountEntity {
        /**
         * xcid : 1079417
         * type : 1
         * ident : 1234504172
         * nickname :
         * image : h
         * intro : 7
         * is_editor : false
         * is_push : false
         * is_block : false
         * wemedia_type : 0
         * site_id : 0
         * fake_id : 2611052
         */

        private int xcid;
        private int type;
        private String ident;
        private String nickname;
        private String image;
        private String intro;
        private boolean is_editor;
        private boolean is_push;
        private boolean is_block;
        private int wemedia_type;
        private int site_id;
        private int fake_id;

        public void setXcid(int xcid) {
            this.xcid = xcid;
        }

        public void setType(int type) {
            this.type = type;
        }

        public void setIdent(String ident) {
            this.ident = ident;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public void setIntro(String intro) {
            this.intro = intro;
        }

        public void setIs_editor(boolean is_editor) {
            this.is_editor = is_editor;
        }

        public void setIs_push(boolean is_push) {
            this.is_push = is_push;
        }

        public void setIs_block(boolean is_block) {
            this.is_block = is_block;
        }

        public void setWemedia_type(int wemedia_type) {
            this.wemedia_type = wemedia_type;
        }

        public void setSite_id(int site_id) {
            this.site_id = site_id;
        }

        public void setFake_id(int fake_id) {
            this.fake_id = fake_id;
        }

        public int getXcid() {
            return xcid;
        }

        public int getType() {
            return type;
        }

        public String getIdent() {
            return ident;
        }

        public String getNickname() {
            return nickname;
        }

        public String getImage() {
            return image;
        }

        public String getIntro() {
            return intro;
        }

        public boolean getIs_editor() {
            return is_editor;
        }

        public boolean getIs_push() {
            return is_push;
        }

        public boolean getIs_block() {
            return is_block;
        }

        public int getWemedia_type() {
            return wemedia_type;
        }

        public int getSite_id() {
            return site_id;
        }

        public int getFake_id() {
            return fake_id;
        }
    }

    public static class PoiEntity {
        /**
         * name : 绿)
         * address : 崇层
         * area_name : 东城区
         * lon : 116.418039
         * lat : 39.898459
         * site_id : 0
         * is_foreign : false
         * is_favorite : false
         */

        private String name;
        private String address;
        private String area_name;
        private double lon;
        private double lat;
        private int site_id;
        private boolean is_foreign;
        private boolean is_favorite;

        public void setName(String name) {
            this.name = name;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setArea_name(String area_name) {
            this.area_name = area_name;
        }

        public void setLon(double lon) {
            this.lon = lon;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public void setSite_id(int site_id) {
            this.site_id = site_id;
        }

        public void setIs_foreign(boolean is_foreign) {
            this.is_foreign = is_foreign;
        }

        public void setIs_favorite(boolean is_favorite) {
            this.is_favorite = is_favorite;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public String getArea_name() {
            return area_name;
        }

        public double getLon() {
            return lon;
        }

        public double getLat() {
            return lat;
        }

        public int getSite_id() {
            return site_id;
        }

        public boolean getIs_foreign() {
            return is_foreign;
        }

        public boolean getIs_favorite() {
            return is_favorite;
        }
    }

    public static class CreditEntity {
        /**
         * total : 120
         * praise_need : 0
         */

        private int total;
        private int praise_need;

        public void setTotal(int total) {
            this.total = total;
        }

        public void setPraise_need(int praise_need) {
            this.praise_need = praise_need;
        }

        public int getTotal() {
            return total;
        }

        public int getPraise_need() {
            return praise_need;
        }
    }

    public static class ImagesEntity {
        /**
         * pid : 00107879jw3f5wsbk8xvyj20zk0np116
         * text :
         * width : 1280
         * height : 853
         */

        private String pid;
        private String text;
        private int width;
        private int height;

        public void setPid(String pid) {
            this.pid = pid;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public String getPid() {
            return pid;
        }

        public String getText() {
            return text;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }
    }
}
