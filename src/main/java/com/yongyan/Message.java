package com.yongyan;

/**
 * Created by yongyan on 09/08/2018
 */

public class Message {
    private String key;
    private String value;

    public Message(String k, String val) {
        key = k;
        value = val;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
