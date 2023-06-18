package com;

public class BankModel {
    private String code;
    private String koName;
    private String enName;

    public BankModel(String code, String koName, String enName) {
        this.code = code;
        this.koName = koName;
        this.enName = enName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getKoName() {
        return koName;
    }

    public void setKoName(String koName) {
        this.koName = koName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

}
