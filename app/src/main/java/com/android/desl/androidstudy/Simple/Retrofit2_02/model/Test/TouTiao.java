package com.android.desl.androidstudy.Simple.Retrofit2_02.model.Test;

import java.util.List;

public class TouTiao {
    private boolean has_more;
    private String message;

    public boolean isHas_more() {
        return has_more;
    }

    public void setHas_more(boolean has_more) {
        this.has_more = has_more;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    ////    private List<Data> data;
////    private Next next;
//
//    public static class Data {
//
//        private boolean single_mode;
//        private String abstract1;
//        private boolean middle_mode;
//        private boolean more_mode;
//        private String tag;
//        private List<String> label;
//        private int comments_count;
//        private String tag_url;
//        private String title;
//        private String chinese_tag;
//        private String source;
//        private int group_source;
//        private boolean has_gallery;
//        private String media_url;
//        private String media_avatar_url;
//        private String source_url;
//        private String article_genre;
//        private String item_id;
//        private boolean is_feed_ad;
//        private long behot_time;
//        private String image_url;
//        private String group_id;
//        private String middle_image;
//
//        public void setSingle_mode(boolean single_mode) {
//            this.single_mode = single_mode;
//        }
//
//        public boolean getSingle_mode() {
//            return single_mode;
//        }
//
//        public void setAbstract1(String abstract1) {
//            this.abstract1 = abstract1;
//        }
//
//        public String getAbstract1() {
//            return abstract1;
//        }
//
//        public void setMiddle_mode(boolean middle_mode) {
//            this.middle_mode = middle_mode;
//        }
//
//        public boolean getMiddle_mode() {
//            return middle_mode;
//        }
//
//        public void setMore_mode(boolean more_mode) {
//            this.more_mode = more_mode;
//        }
//
//        public boolean getMore_mode() {
//            return more_mode;
//        }
//
//        public void setTag(String tag) {
//            this.tag = tag;
//        }
//
//        public String getTag() {
//            return tag;
//        }
//
//        public void setLabel(List<String> label) {
//            this.label = label;
//        }
//
//        public List<String> getLabel() {
//            return label;
//        }
//
//        public void setComments_count(int comments_count) {
//            this.comments_count = comments_count;
//        }
//
//        public int getComments_count() {
//            return comments_count;
//        }
//
//        public void setTag_url(String tag_url) {
//            this.tag_url = tag_url;
//        }
//
//        public String getTag_url() {
//            return tag_url;
//        }
//
//        public void setTitle(String title) {
//            this.title = title;
//        }
//
//        public String getTitle() {
//            return title;
//        }
//
//        public void setChinese_tag(String chinese_tag) {
//            this.chinese_tag = chinese_tag;
//        }
//
//        public String getChinese_tag() {
//            return chinese_tag;
//        }
//
//        public void setSource(String source) {
//            this.source = source;
//        }
//
//        public String getSource() {
//            return source;
//        }
//
//        public void setGroup_source(int group_source) {
//            this.group_source = group_source;
//        }
//
//        public int getGroup_source() {
//            return group_source;
//        }
//
//        public void setHas_gallery(boolean has_gallery) {
//            this.has_gallery = has_gallery;
//        }
//
//        public boolean getHas_gallery() {
//            return has_gallery;
//        }
//
//        public void setMedia_url(String media_url) {
//            this.media_url = media_url;
//        }
//
//        public String getMedia_url() {
//            return media_url;
//        }
//
//        public void setMedia_avatar_url(String media_avatar_url) {
//            this.media_avatar_url = media_avatar_url;
//        }
//
//        public String getMedia_avatar_url() {
//            return media_avatar_url;
//        }
//
//        public void setSource_url(String source_url) {
//            this.source_url = source_url;
//        }
//
//        public String getSource_url() {
//            return source_url;
//        }
//
//        public void setArticle_genre(String article_genre) {
//            this.article_genre = article_genre;
//        }
//
//        public String getArticle_genre() {
//            return article_genre;
//        }
//
//        public void setItem_id(String item_id) {
//            this.item_id = item_id;
//        }
//
//        public String getItem_id() {
//            return item_id;
//        }
//
//        public void setIs_feed_ad(boolean is_feed_ad) {
//            this.is_feed_ad = is_feed_ad;
//        }
//
//        public boolean getIs_feed_ad() {
//            return is_feed_ad;
//        }
//
//        public void setBehot_time(long behot_time) {
//            this.behot_time = behot_time;
//        }
//
//        public long getBehot_time() {
//            return behot_time;
//        }
//
//        public void setImage_url(String image_url) {
//            this.image_url = image_url;
//        }
//
//        public String getImage_url() {
//            return image_url;
//        }
//
//        public void setGroup_id(String group_id) {
//            this.group_id = group_id;
//        }
//
//        public String getGroup_id() {
//            return group_id;
//        }
//
//        public void setMiddle_image(String middle_image) {
//            this.middle_image = middle_image;
//        }
//
//        public String getMiddle_image() {
//            return middle_image;
//        }
//
//    }
//
//    public static class Next {
//
//        private long max_behot_time;
//
//        public void setMax_behot_time(long max_behot_time) {
//            this.max_behot_time = max_behot_time;
//        }
//
//        public long getMax_behot_time() {
//            return max_behot_time;
//        }
//
//    }
//
//    public void setHas_more(boolean has_more) {
//        this.has_more = has_more;
//    }
//
//    public boolean getHas_more() {
//        return has_more;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setData(List<Data> data) {
//        this.data = data;
//    }
//
//    public List<Data> getData() {
//        return data;
//    }
//
//    public void setNext(Next next) {
//        this.next = next;
//    }
//
//    public Next getNext() {
//        return next;
//    }

}