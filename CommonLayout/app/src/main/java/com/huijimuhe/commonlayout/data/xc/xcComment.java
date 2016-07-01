package com.huijimuhe.commonlayout.data.xc;

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
public class xcComment {

    /**
     * id : 222805
     * xcid : 1728451
     * floor : 3
     * article_id : 40660
     * create_time : 2016-06-30 05:38:36
     * share : false
     * deleted : false
     * site_id : 903
     * comment : 营养第一
     * account : {"xcid":1728451,"type":2,"ident":"8A658CF6C8C05C973B87D8A279490506","nickname":"凯哥032148","image":"http://q.qlogo.cn/qqapp/1103288490/8A658CF6C8C05C973B87D8A279490506/100","intro":"","is_editor":false,"is_push":true,"is_block":false,"wemedia_type":0,"fake_id":2701046}
     */

    private int id;
    private int xcid;
    private int floor;
    private int article_id;
    private String create_time;
    private boolean share;
    private boolean deleted;
    private int site_id;
    private String comment;
    private xcAccount account;

    public void setId(int id) {
        this.id = id;
    }

    public void setXcid(int xcid) {
        this.xcid = xcid;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public void setShare(boolean share) {
        this.share = share;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public void setSite_id(int site_id) {
        this.site_id = site_id;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setAccount(xcAccount account) {
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public int getXcid() {
        return xcid;
    }

    public int getFloor() {
        return floor;
    }

    public int getArticle_id() {
        return article_id;
    }

    public String getCreate_time() {
        return create_time;
    }

    public boolean getShare() {
        return share;
    }

    public boolean getDeleted() {
        return deleted;
    }

    public int getSite_id() {
        return site_id;
    }

    public String getComment() {
        return comment;
    }

    public xcAccount getAccount() {
        return account;
    }
}
