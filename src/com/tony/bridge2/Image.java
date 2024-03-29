package com.tony.bridge2;

public class Image implements Media{
    private String content;
    private MediaType type;

    public Image(String content, MediaType type){
        this.content = content;
        this.type = type;
    }

    @Override
    public MediaType getContent() {
        return type;
    }

    @Override
    public String getMediaType() {
        return content;
    }
    @Override
    public void display() {
        System.out.println(content);
    }
}
