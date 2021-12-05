package com.sn.org.uplevel;

public class Question {
    private Integer N;
    private String qu;
    private String an1;
    private String an2;
    private String an3;
    private String an4;
    private String b1;
    private String b2;
    private String b3;
    private String b4;

    public Question(Integer N,String qu, String an1, String an2, String an3, String an4, String b1, String b2, String b3, String b4) {
        this.N = N;
        this.qu = qu;
        this.an1 = an1;
        this.an2 = an2;
        this.an3 = an3;
        this.an4 = an4;
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.b4 = b4;
    }

    public Integer getN() {
        return N;
    }

    public void setN(Integer n) {
       this.N = n;
    }

    public String getQu() {
        return qu;
    }

    public void setQu(String qu) {
        this.qu = qu;
    }

    public String getAn1() {
        return an1;
    }

    public void setAn1(String an1) {
        this.an1 = an1;
    }

    public String getAn2() {
        return an2;
    }

    public void setAn2(String an2) {
        this.an2 = an2;
    }

    public String getAn3() {
        return an3;
    }

    public void setAn3(String an3) {
        this.an3 = an3;
    }

    public String getAn4() {
        return an4;
    }

    public void setAn4(String an4) {
        this.an4 = an4;
    }

    public String getB1() {
        return b1;
    }

    public void setB1(String b1) {
        this.b1 = b1;
    }

    public String getB2() {
        return b2;
    }

    public void setB2(String b2) {
        this.b2 = b2;
    }

    public String getB3() {
        return b3;
    }

    public void setB3(String b3) {
        this.b3 = b3;
    }

    public String getB4() {
        return b4;
    }

    public void setB4(String b4) {
        this.b4 = b4;
    }
}
