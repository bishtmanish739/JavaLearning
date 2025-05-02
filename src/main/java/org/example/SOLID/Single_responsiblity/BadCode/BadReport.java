package org.example.SOLID.Single_responsiblity.BadCode;

public class BadReport {
    String title;
    String content;


    public BadReport(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void  reportPrint(){
        System.out.println("bad report printing");
    }

    public void  saveReport(){
        System.out.println("bad report saving");
    }
}
