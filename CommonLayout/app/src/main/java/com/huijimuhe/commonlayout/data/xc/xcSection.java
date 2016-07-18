package com.huijimuhe.commonlayout.data.xc;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
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

@JsonAdapter(xcSection.xcSectionJsonAdapter.class)
public class xcSection<T extends xcSection.ISection> {

    private int type;
    private ISection contentObject;
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

    public ISection getContentObject() {
        return contentObject;
    }

    public void setContentObject(ISection contentObject) {
        this.contentObject = contentObject;
    }

    public interface ISection {

    }

    public static class xcImage implements ISection {
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

    public static class xcText implements ISection {
        private String text;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public static class xcTitle implements ISection {
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


    public class xcSectionJsonAdapter extends TypeAdapter<xcSection> {
        @Override
        public void write(JsonWriter out, xcSection value) throws IOException {

        }

        @Override
        public xcSection read(JsonReader in) throws IOException {
            xcSection data=new xcSection();
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
                        readImages(in);
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                }
                in.endObject();

            } catch (Exception e) {
                e.printStackTrace();
            }
            return data;
        }

        private xcTitle readTitle(JsonReader in) {
            xcTitle data = new xcTitle();
            try {
                in.skipValue();
                in.beginObject();
                in.skipValue();
                data.setTitle(in.nextString());
                in.skipValue();
                data.setSubTitle(in.nextString());
                in.endObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return data;
        }

        private List<xcText> readText(JsonReader in) {
            List<xcText> data = new ArrayList<>();
            try {
                in.skipValue();
                in.beginArray();
                while (in.hasNext()) {
                    xcText item = new xcText();
                    item.setText(in.nextString());
                    data.add(item);
                }
                in.endArray();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return data;
        }

        private List<xcImage> readImages(JsonReader in) {
            List<xcImage> data = new ArrayList<>();
            try {
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
            } catch (Exception e) {
                e.printStackTrace();
            }
            return data;
        }
    }
}
