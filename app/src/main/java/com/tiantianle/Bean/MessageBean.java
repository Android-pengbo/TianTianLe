package com.tiantianle.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/8.
 *
 * 我的消息Bean
 */

public class MessageBean{

    private String state;

    private List<message> biz_content = new ArrayList<message>();

    public class message{
        private String time;//时间
        private String title;//标题
        private String body;//内容

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "MessageBean{" +
                "state='" + state + '\'' +
                ", biz_content=" + biz_content +
                '}';
    }

    public List<message> getBiz_content() {
        message ms = new message();
        ms.setTitle("［公告］网站停机维护...");
        ms.setTime("2017-02-08 12:56");
        biz_content.add(ms);
        return biz_content;
    }

    public void setBiz_content(List<message> biz_content) {
        this.biz_content = biz_content;
    }
}
