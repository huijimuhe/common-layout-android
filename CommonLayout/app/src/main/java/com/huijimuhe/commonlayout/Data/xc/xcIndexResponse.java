package com.huijimuhe.commonlayout.data.xc;

/**
 * Created by Huijimuhe on 2016/6/22.
 * This is a part of Lanwen
 * enjoy
 */
public class xcIndexResponse {


    /**
     * code : 0
     * msg : success
     */

    private int code;
    private String msg;

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public class Banner{

        /**
         * id : 1249
         * type : 2
         * title : 钢琴体验券免费送
         * desc : 星空琴行-渠道（吴春威）
         * image : http://ww4.sinaimg.cn/large/6ef77e5ejw3f51u8t8xjtj20hs08c0vc.jpg
         * start_time : 2016-06-22 14:35:28
         * url : http://www.51xiancheng.com/article/40634
         * article_id : 40634
         */

        private int id;
        private int type;
        private String title;
        private String desc;
        private String image;
        private String start_time;
        private String url;
        private int article_id;

        public void setId(int id) {
            this.id = id;
        }

        public void setType(int type) {
            this.type = type;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public void setStart_time(String start_time) {
            this.start_time = start_time;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setArticle_id(int article_id) {
            this.article_id = article_id;
        }

        public int getId() {
            return id;
        }

        public int getType() {
            return type;
        }

        public String getTitle() {
            return title;
        }

        public String getDesc() {
            return desc;
        }

        public String getImage() {
            return image;
        }

        public String getStart_time() {
            return start_time;
        }

        public String getUrl() {
            return url;
        }

        public int getArticle_id() {
            return article_id;
        }
    }
}
