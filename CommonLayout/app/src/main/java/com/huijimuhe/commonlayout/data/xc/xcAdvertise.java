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
public class xcAdvertise {

    /**
     * id : -1
     * type : 2
     * title : 天凉别吼 风风火火吃烤肉
     * desc : 记不记得，《水浒传》里的108位好汉，大碗喝酒，大口吃肉，一身豪气行走人间。当烤肉碰上了“梁山好汉”，也变得豪放霸气起来。
     * image : http://s3img.city.sina.com.cn/xiancheng/common/thumbnail/1/95d194131fcc84ea916238fbecfbc889.jpg
     * location : 1
     * article_id : 1294
     */

    private int id;
    private int type;
    private String title;
    private String desc;
    private String image;
    private int location;
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

    public void setLocation(int location) {
        this.location = location;
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

    public int getLocation() {
        return location;
    }

    public int getArticle_id() {
        return article_id;
    }
}
