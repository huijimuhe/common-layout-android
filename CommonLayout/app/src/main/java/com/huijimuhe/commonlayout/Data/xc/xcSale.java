package com.huijimuhe.commonlayout.data.xc;

import java.util.List;

/**
 * Created by Huijimuhe on 2016/6/23.
 * This is a part of Lanwen
 * enjoy
 */
public class xcSale {

    /**
     * id : 7550
     * article_id : 40463
     * type : 6
     * title :
     * image : 7003965.jpg
     * icon_id : 7
     * start_time : 2016-06-21 09:31:00
     * end_time : 2016-06-30 18:00:00
     * create_time : 2016-06-16 14:19:37
     * hint :
     * selling_point :
     * limited_count : 0
     * otherbrower : 0
     * desc :
     * extra_list : [{"title":"欧洲杯零嘴套餐","original_price":7500,"selling_price":5650,"unit":"份","total":100,"left":94}]
     * allcnt : 100
     * wincnt : 6
     * left : 94
     * share : 0
     * site_id : 903
     * status : 3
     * coupon_use_type : 2
     */

    private int id;
    private int article_id;
    private int type;
    private String title;
    private String image;
    private int icon_id;
    private String start_time;
    private String end_time;
    private String create_time;
    private String hint;
    private String selling_point;
    private int limited_count;
    private int otherbrower;
    private String desc;
    private int allcnt;
    private int wincnt;
    private int left;
    private int share;
    private int site_id;
    private int status;
    private int coupon_use_type;
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

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public void setSelling_point(String selling_point) {
        this.selling_point = selling_point;
    }

    public void setLimited_count(int limited_count) {
        this.limited_count = limited_count;
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

    public void setWincnt(int wincnt) {
        this.wincnt = wincnt;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public void setShare(int share) {
        this.share = share;
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

    public String getStart_time() {
        return start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public String getCreate_time() {
        return create_time;
    }

    public String getHint() {
        return hint;
    }

    public String getSelling_point() {
        return selling_point;
    }

    public int getLimited_count() {
        return limited_count;
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

    public int getWincnt() {
        return wincnt;
    }

    public int getLeft() {
        return left;
    }

    public int getShare() {
        return share;
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

    public List<ExtraListEntity> getExtra_list() {
        return extra_list;
    }

    public static class ExtraListEntity {
        /**
         * title : 欧洲杯零嘴套餐
         * original_price : 7500
         * selling_price : 5650
         * unit : 份
         * total : 100
         * left : 94
         */

        private String title;
        private int original_price;
        private int selling_price;
        private String unit;
        private int total;
        private int left;

        public void setTitle(String title) {
            this.title = title;
        }

        public void setOriginal_price(int original_price) {
            this.original_price = original_price;
        }

        public void setSelling_price(int selling_price) {
            this.selling_price = selling_price;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public void setLeft(int left) {
            this.left = left;
        }

        public String getTitle() {
            return title;
        }

        public int getOriginal_price() {
            return original_price;
        }

        public int getSelling_price() {
            return selling_price;
        }

        public String getUnit() {
            return unit;
        }

        public int getTotal() {
            return total;
        }

        public int getLeft() {
            return left;
        }
    }
}
