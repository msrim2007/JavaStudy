package com;

public class CommonCodeModel {
    private String code;
    private String text;

    public CommonCodeModel(String code, String text) {
        this.code = code;
        this.text = text;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "CommonCodeModel [code=" + code + ", text=" + text + "]";
    }
}
