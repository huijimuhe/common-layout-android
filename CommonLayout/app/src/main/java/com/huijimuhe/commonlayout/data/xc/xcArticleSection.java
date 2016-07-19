package com.huijimuhe.commonlayout.data.xc;

import android.util.Log;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C) 2016 Huijimuhe Technologies. All rights reserved.
 * <p/>
 * Contact: 20903213@qq.com Zengweizhou
 * <p/>
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

@JsonAdapter(xcArticleSection.xcSectionJsonAdapter.class)
public class xcArticleSection<T extends xcArticleSection.IParagraph> {

    private int type;
    private IParagraph contentObject;
    private List<T> contentArray;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<T> getContentArray() {
        return contentArray;
    }

    public void setContentArray(List<T> contentArray) {
        this.contentArray = contentArray;
    }

    public IParagraph getContentObject() {
        return contentObject;
    }

    public void setContentObject(IParagraph contentObject) {
        this.contentObject = contentObject;
    }

    public interface IParagraph {

    }

    public static class xcImage implements IParagraph {
        private String url;
        private String text;
        private int width;
        private int height;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
    }

    public static class xcText implements IParagraph {
        private String text;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public static class xcTitle implements IParagraph {
        private String title;
        private String subTitle;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSubTitle() {
            return subTitle;
        }

        public void setSubTitle(String subTitle) {
            this.subTitle = subTitle;
        }
    }


    public class xcSectionJsonAdapter extends TypeAdapter<xcArticleSection> {
        @Override
        public void write(JsonWriter out, xcArticleSection value) {

        }

        @Override
        public xcArticleSection read(JsonReader in) {
            xcArticleSection data = new xcArticleSection();
            try {
                in.beginObject();
                in.skipValue();
                data.setType(in.nextInt());
                switch (data.getType()) {
                    case 1:
                        data.setContentObject(readTitle(in));
                        break;
                    case 2:
                        data.setContentArray(readText(in));
                        break;
                    case 3:
                        data.setContentArray(readImages(in));
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    default:
                        Log.d("yese", "here is thit");
                        break;
                }
                in.endObject();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                return data;
            }
        }

        private xcTitle readTitle(JsonReader in) throws Exception {
            xcTitle data = new xcTitle();
            in.skipValue();
            in.beginObject();
            in.skipValue();
            data.setTitle(in.nextString());
            in.skipValue();
            data.setSubTitle(in.nextString());
            in.endObject();
            return data;
        }

        private List<xcText> readText(JsonReader in) throws Exception {
            List<xcText> data = new ArrayList<>();
            in.skipValue();
            in.beginArray();
            while (in.hasNext()) {
                xcText item = new xcText();
                item.setText(in.nextString());
                data.add(item);
            }
            in.endArray();
            return data;
        }

        private List<xcImage> readImages(JsonReader in) throws Exception {
            List<xcImage> data = new ArrayList<>();
            in.skipValue();
            in.beginArray();
            while (in.hasNext()) {
                in.beginObject();
                xcImage item = new xcImage();
                in.skipValue();
                item.setUrl(in.nextString());
                in.skipValue();
                item.setText(in.nextString());
                in.skipValue();
                item.setWidth(in.nextInt());
                in.skipValue();
                item.setHeight(in.nextInt());
                data.add(item);
                in.endObject();
            }
            in.endArray();
            return data;
        }
    }
}
