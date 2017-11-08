package com.critc.plat.util.model;

/**
 * @Auther Owen Zhao
 * @Date 10:49 2017/11/8
 */
public class ComboboxVO {

    private String value;//字段值
    private String content;//字段内容

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ComboboxVO{" +
                "value='" + value + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
