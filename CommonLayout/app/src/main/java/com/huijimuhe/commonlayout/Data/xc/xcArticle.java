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
     * id : 38196
     * site_id : 903
     * title : 在绿茵场上醉生梦死一场
     * sub_title : 星期六的地图
     * full_image : http://s3img.city.sina.com.cn/xiancheng/common/thumbnail/0/c7a4af137a1b4a7af5dfa834efe2e042.jpg
     * list_image : http://s3img.city.sina.com.cn/xiancheng/common/thumbnail/0/ccefd3271980babe41a860fcd1c8a433.jpg
     * thumbnail : http://s3img.city.sina.com.cn/xiancheng/common/thumbnail/1/c7a4af137a1b4a7af5dfa834efe2e042.jpg
     * type : 6
     * create_time : 2016-05-11 15:33:09
     * publish_date : 2016-06-18
     * view_count : 5008
     * pois : [{"id":352299,"type":6,"poi":"","city":"1","region":"5","name":"星期六的地图","alias":"","tel":"18602831655;028-83262283","address":"府青路二段2号财富又一城B1楼下沉广场(面包新语旁)","area_name":"成华区","lon":104.09432,"lat":30.67775,"pay_average":50,"pay_type":1,"pay_average2":"￥50/人","opentime":"每天18:00-01:00","busline":"","summary":"","image":"http://s3img.city.sina.com.cn/xiancheng/common/thumbnail/0/84d0f559a15cc6e01cd089d4ee12517f.jpg","tags":[{"id":26,"name":"建设路","type":3},{"id":1142,"name":"酒吧","type":5},{"id":148,"name":"有无烟区","type":4},{"id":151,"name":"有表演","type":4},{"id":1196,"name":"接受预定","type":4},{"id":141,"name":"有WIFI","type":4},{"id":130,"name":"可以刷卡","type":4},{"id":128,"name":"有停车位","type":4}],"site_id":903,"is_foreign":false,"is_favorite":false}]
     * has_video : false
     * status : 0
     * release_time : 2016-06-17 22:44:12
     * intro : 绿茵场上的酣畅淋漓，必须要小麦香气的精酿啤酒来相伴。在超大LED屏幕的影射下，每一次精彩的射门都让你仿佛身临赛场。干杯欢呼吧，为了UEFA！星期六的地图不仅为你准备了看球的LED大屏，豪迈的啤酒和可口的鸡尾酒，还有超多重欧洲杯主题优惠活动。
     * author_uid : 5293055556
     * author_account : {"xcid":104581,"type":1,"ident":"5293055556","nickname":"LIN三千","image":"http://tp1.sinaimg.cn/5293055556/180/40065986055/0","intro":"模糊地迷戀你一场","is_editor":true,"is_push":true,"is_block":false,"wemedia_type":4,"site_id":0,"wemedia_image_large":"http://img.iot.sina.cn/ota/image/xiancheng/badge_bianji_large/file1440988492570.png","wemedia_image_small":"http://img.iot.sina.cn/ota/image/xiancheng/bianji_small_v2.1/file1441008255907.png","wemedia_image_small_white":"http://img.iot.sina.cn/ota/image/xiancheng/badge_white_bianji/file1440989963194.png","credentials":[{"xcid":104581,"type":1,"ident":"5293055556"}],"fake_id":1537928}
     * server_timestamp : 1466610806498
     * h5url : http://chengdu.51xiancheng.com/article/38196
     * fav_count : 82
     * praise_count : 319
     * is_favorite : false
     * is_praise : false
     * comment_count : 0
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
    private int view_count;
    private boolean has_video;
    private int status;
    private String release_time;
    private String intro;
    private long author_uid;
    private AuthorAccountEntity author_account;
    private long server_timestamp;
    private String h5url;
    private int fav_count;
    private int praise_count;
    private boolean is_favorite;
    private boolean is_praise;
    private int comment_count;
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

    public void setAuthor_uid(long author_uid) {
        this.author_uid = author_uid;
    }

    public void setAuthor_account(AuthorAccountEntity author_account) {
        this.author_account = author_account;
    }

    public void setServer_timestamp(long server_timestamp) {
        this.server_timestamp = server_timestamp;
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

    public long getAuthor_uid() {
        return author_uid;
    }

    public AuthorAccountEntity getAuthor_account() {
        return author_account;
    }

    public long getServer_timestamp() {
        return server_timestamp;
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

    public List<PoisEntity> getPois() {
        return pois;
    }

    public static class AuthorAccountEntity {
        /**
         * xcid : 104581
         * type : 1
         * ident : 5293055556
         * nickname : LIN三千
         * image : http://tp1.sinaimg.cn/5293055556/180/40065986055/0
         * intro : 模糊地迷戀你一场
         * is_editor : true
         * is_push : true
         * is_block : false
         * wemedia_type : 4
         * site_id : 0
         * wemedia_image_large : http://img.iot.sina.cn/ota/image/xiancheng/badge_bianji_large/file1440988492570.png
         * wemedia_image_small : http://img.iot.sina.cn/ota/image/xiancheng/bianji_small_v2.1/file1441008255907.png
         * wemedia_image_small_white : http://img.iot.sina.cn/ota/image/xiancheng/badge_white_bianji/file1440989963194.png
         * credentials : [{"xcid":104581,"type":1,"ident":"5293055556"}]
         * fake_id : 1537928
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
        private String wemedia_image_large;
        private String wemedia_image_small;
        private String wemedia_image_small_white;
        private int fake_id;
        private List<CredentialsEntity> credentials;

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

        public void setWemedia_image_large(String wemedia_image_large) {
            this.wemedia_image_large = wemedia_image_large;
        }

        public void setWemedia_image_small(String wemedia_image_small) {
            this.wemedia_image_small = wemedia_image_small;
        }

        public void setWemedia_image_small_white(String wemedia_image_small_white) {
            this.wemedia_image_small_white = wemedia_image_small_white;
        }

        public void setFake_id(int fake_id) {
            this.fake_id = fake_id;
        }

        public void setCredentials(List<CredentialsEntity> credentials) {
            this.credentials = credentials;
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

        public String getWemedia_image_large() {
            return wemedia_image_large;
        }

        public String getWemedia_image_small() {
            return wemedia_image_small;
        }

        public String getWemedia_image_small_white() {
            return wemedia_image_small_white;
        }

        public int getFake_id() {
            return fake_id;
        }

        public List<CredentialsEntity> getCredentials() {
            return credentials;
        }

        public static class CredentialsEntity {
            /**
             * xcid : 104581
             * type : 1
             * ident : 5293055556
             */

            private int xcid;
            private int type;
            private String ident;

            public void setXcid(int xcid) {
                this.xcid = xcid;
            }

            public void setType(int type) {
                this.type = type;
            }

            public void setIdent(String ident) {
                this.ident = ident;
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
        }
    }

    public static class PoisEntity {
        /**
         * id : 352299
         * type : 6
         * poi :
         * city : 1
         * region : 5
         * name : 星期六的地图
         * alias :
         * tel : 18602831655;028-83262283
         * address : 府青路二段2号财富又一城B1楼下沉广场(面包新语旁)
         * area_name : 成华区
         * lon : 104.09432
         * lat : 30.67775
         * pay_average : 50
         * pay_type : 1
         * pay_average2 : ￥50/人
         * opentime : 每天18:00-01:00
         * busline :
         * summary :
         * image : http://s3img.city.sina.com.cn/xiancheng/common/thumbnail/0/84d0f559a15cc6e01cd089d4ee12517f.jpg
         * tags : [{"id":26,"name":"建设路","type":3},{"id":1142,"name":"酒吧","type":5},{"id":148,"name":"有无烟区","type":4},{"id":151,"name":"有表演","type":4},{"id":1196,"name":"接受预定","type":4},{"id":141,"name":"有WIFI","type":4},{"id":130,"name":"可以刷卡","type":4},{"id":128,"name":"有停车位","type":4}]
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
             * id : 26
             * name : 建设路
             * type : 3
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
