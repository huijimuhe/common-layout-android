package com.huijimuhe.commonlayout.data.xc;

import java.util.List;

/**
 * Created by Huijimuhe on 2016/6/23.
 * This is a part of Lanwen
 * enjoy
 */
public class xcArticle {

    /**
     * content_type : ARTICLE
     * id : 40754
     * site_id : 903
     * title : 电音风暴 重磅DJ加盟
     * sub_title : 非遗博览园
     * full_image :
     * list_image :
     * thumbnail :
     * type : 5
     * create_time : 2016-06-21 20:42:49
     * publish_date : 2016-06-23
     * start_date : 2016-07-01
     * end_date : 2016-07-02
     * start_time : 15:00:00
     * end_time : 23:55:00
     * view_count : 2060
     * pois : [{"id":354392,"type":5,"poi":"非遗博览园","city":"1","region":"4","name":"非遗博览园","alias":"非遗博览园","tel":"","address":"四川省成都市青羊区光华大道2段601号","area_name":"青羊区","lon":103.922478,"lat":30.674086,"pay_average":0,"pay_type":4,"pay_average2":"暂无","opentime":"每天","busline":"","summary":"非遗博览园","image":"","tags":[{"id":128,"name":"有停车位","type":4}],"site_id":903,"is_foreign":false,"is_favorite":false}]
     * has_video : false
     * status : 0
     * release_time : 2016-06-22 11:48:54
     * intro :
     * author_uid : 1907323224
     * author_account : {"xcid":1078155,"type":1,"ident":"1907323224","nickname":"五花肉好吃","image":"","intro":"","is_editor":false,"is_push":true,"is_block":false,"wemedia_type":2,"site_id":903,"wemedia_image_large":"","wemedia_image_small":"","wemedia_image_small_white":"","credentials":[{"xcid":1078155,"type":1,"ident":"1907323224","token":"2.00otvEFC5EQLLE5e00477b80jvXrXC"}],"fake_id":2607806}
     * server_timestamp : 1466916418958
     * formative_time :
     * h5url :
     * fav_count : 10
     * praise_count : 144
     * is_favorite : false
     * is_praise : false
     * comment_count : 1
     * activity : {"id":7639,"article_id":40754,"type":1,"title":"音乐节双人门票","image":"","icon_id":1,"type_image":"","icon_image":"","icon_image_gray":"","start_time":"2016-06-23 00:00:00","create_time":"2016-06-22 12:22:26","coupon_expire_date":"2016-07-22","hint":"","pid":354392,"otherbrower":0,"desc":"","extra_list":[{"title":"音乐节双人门票","total":3}],"allcnt":3,"expect_cnt":500,"wincnt":3,"left":0,"share":1,"server_timestamp":1466916419025,"site_id":903,"status":3,"coupon_use_type":0,"batch":false}
     */

    private String content_type;
    private int id;
    private int site_id;
    private String title;
    private String sub_title;
    private String full_image;
    private String list_image;
    private String thumbnail;
    private int type;
    private String create_time;
    private String publish_date;
    private String start_date;
    private String end_date;
    private String start_time;
    private String end_time;
    private int view_count;
    private boolean has_video;
    private int status;
    private String release_time;
    private String intro;
    private String author_uid;
    private xcAccount author_account;
    private long server_timestamp;
    private String formative_time;
    private String h5url;
    private int fav_count;
    private int praise_count;
    private boolean is_favorite;
    private boolean is_praise;
    private int comment_count;
    private ActivityEntity activity;
    private List<PoisEntity> pois;

    public void setContent_type(String content_type) {
        this.content_type = content_type;
    }

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

    public void setFull_image(String full_image) {
        this.full_image = full_image;
    }

    public void setList_image(String list_image) {
        this.list_image = list_image;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public void setView_count(int view_count) {
        this.view_count = view_count;
    }

    public void setHas_video(boolean has_video) {
        this.has_video = has_video;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setRelease_time(String release_time) {
        this.release_time = release_time;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setAuthor_uid(String author_uid) {
        this.author_uid = author_uid;
    }

    public void setAuthor_account(xcAccount author_account) {
        this.author_account = author_account;
    }

    public void setServer_timestamp(long server_timestamp) {
        this.server_timestamp = server_timestamp;
    }

    public void setFormative_time(String formative_time) {
        this.formative_time = formative_time;
    }

    public void setH5url(String h5url) {
        this.h5url = h5url;
    }

    public void setFav_count(int fav_count) {
        this.fav_count = fav_count;
    }

    public void setPraise_count(int praise_count) {
        this.praise_count = praise_count;
    }

    public void setIs_favorite(boolean is_favorite) {
        this.is_favorite = is_favorite;
    }

    public void setIs_praise(boolean is_praise) {
        this.is_praise = is_praise;
    }

    public void setComment_count(int comment_count) {
        this.comment_count = comment_count;
    }

    public void setActivity(ActivityEntity activity) {
        this.activity = activity;
    }

    public void setPois(List<PoisEntity> pois) {
        this.pois = pois;
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

    public String getTitle() {
        return title;
    }

    public String getSub_title() {
        return sub_title;
    }

    public String getFull_image() {
        return full_image;
    }

    public String getList_image() {
        return list_image;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public int getType() {
        return type;
    }

    public String getCreate_time() {
        return create_time;
    }

    public String getPublish_date() {
        return publish_date;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public String getStart_time() {
        return start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public int getView_count() {
        return view_count;
    }

    public boolean getHas_video() {
        return has_video;
    }

    public int getStatus() {
        return status;
    }

    public String getRelease_time() {
        return release_time;
    }

    public String getIntro() {
        return intro;
    }

    public String getAuthor_uid() {
        return author_uid;
    }

    public xcAccount getAuthor_account() {
        return author_account;
    }

    public long getServer_timestamp() {
        return server_timestamp;
    }

    public String getFormative_time() {
        return formative_time;
    }

    public String getH5url() {
        return h5url;
    }

    public int getFav_count() {
        return fav_count;
    }

    public int getPraise_count() {
        return praise_count;
    }

    public boolean getIs_favorite() {
        return is_favorite;
    }

    public boolean getIs_praise() {
        return is_praise;
    }

    public int getComment_count() {
        return comment_count;
    }

    public ActivityEntity getActivity() {
        return activity;
    }

    public List<PoisEntity> getPois() {
        return pois;
    }

    public static class ActivityEntity {
        /**
         * id : 7639
         * article_id : 40754
         * type : 1
         * title : 音乐节双人门票
         * image :
         * icon_id : 1
         * type_image :
         * icon_image :
         * icon_image_gray :
         * start_time : 2016-06-23 00:00:00
         * create_time : 2016-06-22 12:22:26
         * coupon_expire_date : 2016-07-22
         * hint :
         * pid : 354392
         * otherbrower : 0
         * desc :
         * extra_list : [{"title":"音乐节双人门票","total":3}]
         * allcnt : 3
         * expect_cnt : 500
         * wincnt : 3
         * left : 0
         * share : 1
         * server_timestamp : 1466916419025
         * site_id : 903
         * status : 3
         * coupon_use_type : 0
         * batch : false
         */

        private int id;
        private int article_id;
        private int type;
        private String title;
        private String image;
        private int icon_id;
        private String type_image;
        private String icon_image;
        private String icon_image_gray;
        private String start_time;
        private String create_time;
        private String coupon_expire_date;
        private String hint;
        private int pid;
        private int otherbrower;
        private String desc;
        private int allcnt;
        private int expect_cnt;
        private int wincnt;
        private int left;
        private int share;
        private long server_timestamp;
        private int site_id;
        private int status;
        private int coupon_use_type;
        private boolean batch;
        private List<ExtraListEntity> extra_list;

        public void setId(int id) {
            this.id = id;
        }

        public void setArticle_id(int article_id) {
            this.article_id = article_id;
        }

        public void setType(int type) {
            this.type = type;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public void setIcon_id(int icon_id) {
            this.icon_id = icon_id;
        }

        public void setType_image(String type_image) {
            this.type_image = type_image;
        }

        public void setIcon_image(String icon_image) {
            this.icon_image = icon_image;
        }

        public void setIcon_image_gray(String icon_image_gray) {
            this.icon_image_gray = icon_image_gray;
        }

        public void setStart_time(String start_time) {
            this.start_time = start_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public void setCoupon_expire_date(String coupon_expire_date) {
            this.coupon_expire_date = coupon_expire_date;
        }

        public void setHint(String hint) {
            this.hint = hint;
        }

        public void setPid(int pid) {
            this.pid = pid;
        }

        public void setOtherbrower(int otherbrower) {
            this.otherbrower = otherbrower;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void setAllcnt(int allcnt) {
            this.allcnt = allcnt;
        }

        public void setExpect_cnt(int expect_cnt) {
            this.expect_cnt = expect_cnt;
        }

        public void setWincnt(int wincnt) {
            this.wincnt = wincnt;
        }

        public void setLeft(int left) {
            this.left = left;
        }

        public void setShare(int share) {
            this.share = share;
        }

        public void setServer_timestamp(long server_timestamp) {
            this.server_timestamp = server_timestamp;
        }

        public void setSite_id(int site_id) {
            this.site_id = site_id;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public void setCoupon_use_type(int coupon_use_type) {
            this.coupon_use_type = coupon_use_type;
        }

        public void setBatch(boolean batch) {
            this.batch = batch;
        }

        public void setExtra_list(List<ExtraListEntity> extra_list) {
            this.extra_list = extra_list;
        }

        public int getId() {
            return id;
        }

        public int getArticle_id() {
            return article_id;
        }

        public int getType() {
            return type;
        }

        public String getTitle() {
            return title;
        }

        public String getImage() {
            return image;
        }

        public int getIcon_id() {
            return icon_id;
        }

        public String getType_image() {
            return type_image;
        }

        public String getIcon_image() {
            return icon_image;
        }

        public String getIcon_image_gray() {
            return icon_image_gray;
        }

        public String getStart_time() {
            return start_time;
        }

        public String getCreate_time() {
            return create_time;
        }

        public String getCoupon_expire_date() {
            return coupon_expire_date;
        }

        public String getHint() {
            return hint;
        }

        public int getPid() {
            return pid;
        }

        public int getOtherbrower() {
            return otherbrower;
        }

        public String getDesc() {
            return desc;
        }

        public int getAllcnt() {
            return allcnt;
        }

        public int getExpect_cnt() {
            return expect_cnt;
        }

        public int getWincnt() {
            return wincnt;
        }

        public int getLeft() {
            return left;
        }

        public int getShare() {
            return share;
        }

        public long getServer_timestamp() {
            return server_timestamp;
        }

        public int getSite_id() {
            return site_id;
        }

        public int getStatus() {
            return status;
        }

        public int getCoupon_use_type() {
            return coupon_use_type;
        }

        public boolean getBatch() {
            return batch;
        }

        public List<ExtraListEntity> getExtra_list() {
            return extra_list;
        }

        public static class ExtraListEntity {
            /**
             * title : 音乐节双人门票
             * total : 3
             */

            private String title;
            private int total;

            public void setTitle(String title) {
                this.title = title;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public String getTitle() {
                return title;
            }

            public int getTotal() {
                return total;
            }
        }
    }

    public static class PoisEntity {
        /**
         * id : 354392
         * type : 5
         * poi : 非遗博览园
         * city : 1
         * region : 4
         * name : 非遗博览园
         * alias : 非遗博览园
         * tel :
         * address : 四川省成都市青羊区光华大道2段601号
         * area_name : 青羊区
         * lon : 103.922478
         * lat : 30.674086
         * pay_average : 0
         * pay_type : 4
         * pay_average2 : 暂无
         * opentime : 每天
         * busline :
         * summary : 非遗博览园
         * image :
         * tags : [{"id":128,"name":"有停车位","type":4}]
         * site_id : 903
         * is_foreign : false
         * is_favorite : false
         */

        private int id;
        private int type;
        private String poi;
        private String city;
        private String region;
        private String name;
        private String alias;
        private String tel;
        private String address;
        private String area_name;
        private double lon;
        private double lat;
        private int pay_average;
        private int pay_type;
        private String pay_average2;
        private String opentime;
        private String busline;
        private String summary;
        private String image;
        private int site_id;
        private boolean is_foreign;
        private boolean is_favorite;
        private List<TagsEntity> tags;

        public void setId(int id) {
            this.id = id;
        }

        public void setType(int type) {
            this.type = type;
        }

        public void setPoi(String poi) {
            this.poi = poi;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public void setTel(String tel) {
            this.tel = tel;
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

        public void setPay_average(int pay_average) {
            this.pay_average = pay_average;
        }

        public void setPay_type(int pay_type) {
            this.pay_type = pay_type;
        }

        public void setPay_average2(String pay_average2) {
            this.pay_average2 = pay_average2;
        }

        public void setOpentime(String opentime) {
            this.opentime = opentime;
        }

        public void setBusline(String busline) {
            this.busline = busline;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public void setImage(String image) {
            this.image = image;
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

        public void setTags(List<TagsEntity> tags) {
            this.tags = tags;
        }

        public int getId() {
            return id;
        }

        public int getType() {
            return type;
        }

        public String getPoi() {
            return poi;
        }

        public String getCity() {
            return city;
        }

        public String getRegion() {
            return region;
        }

        public String getName() {
            return name;
        }

        public String getAlias() {
            return alias;
        }

        public String getTel() {
            return tel;
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

        public int getPay_average() {
            return pay_average;
        }

        public int getPay_type() {
            return pay_type;
        }

        public String getPay_average2() {
            return pay_average2;
        }

        public String getOpentime() {
            return opentime;
        }

        public String getBusline() {
            return busline;
        }

        public String getSummary() {
            return summary;
        }

        public String getImage() {
            return image;
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

        public List<TagsEntity> getTags() {
            return tags;
        }

        public static class TagsEntity {
            /**
             * id : 128
             * name : 有停车位
             * type : 4
             */

            private int id;
            private String name;
            private int type;

            public void setId(int id) {
                this.id = id;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getId() {
                return id;
            }

            public String getName() {
                return name;
            }

            public int getType() {
                return type;
            }
        }
    }
}