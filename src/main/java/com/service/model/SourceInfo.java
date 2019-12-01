package com.service.model;

import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by songmeng on 2018/12/21.
 */
public class SourceInfo {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Id
    private Long id;
    private String author;
    private String title;

    public String getTime() {
        return simpleDateFormat.format(time.getTime());
    }

    public void setTime(Date time) {
        this.time = time;
    }

    private String type;
    private Date time;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {

       if (type.equals("0")){
           return "论文";
       }else if(type.equals("1")){
           return "软著";
       }else if(type.equals("2")){
           return "专利";
       }
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFilename() {
        return "localhost:8080/file/" + filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    private String filename;

    private String operate;

    public String getOperate() {
        return operate;
    }

    public void setOperate(String filename) {

        String operate = filename.substring(filename.lastIndexOf(".") + 1);
        if (operate.toLowerCase().equals("pdf") || operate.toLowerCase().equals("png") || operate.toLowerCase().equals("")){
            this.operate = "预览";
        }else{
            this.operate = "下载";
        }

    }
}
