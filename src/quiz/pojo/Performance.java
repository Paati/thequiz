/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pojo;

/**
 *
 * @author Paaty
 */
public class Performance {
 private String userid,examid,language;
    private int right,wrong,unattempted;
    private double per;
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getExamid() {
        return examid;
    }

    public void setExamid(String examid) {
        this.examid = examid;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getWrong() {
        return wrong;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    public int getUnattempted() {
        return unattempted;
    }

    public void setUnattempted(int unattempted) {
        this.unattempted = unattempted;
    }

    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }


    public Performance(String userid, String examid, String language, int right, int wrong, int unattempted, double per) {
        this.userid = userid;
        this.examid = examid;
        this.language = language;
        this.right = right;
        this.wrong = wrong;
        this.unattempted = unattempted;
        this.per = per;
        System.out.print(per);
    }
    
}
