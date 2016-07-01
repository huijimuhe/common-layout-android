package com.huijimuhe.commonlayout.data.xc;

import java.util.List;

/**
 * Copyright (C) 2016 Huijimuhe Technologies. All rights reserved.
 * <p>
 * Contact: 20903213@qq.com Zengweizhou
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class xcAccount {
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
