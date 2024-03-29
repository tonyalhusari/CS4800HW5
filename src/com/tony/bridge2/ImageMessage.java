package com.tony.bridge2;

public class ImageMessage implements MessageType {
    MessagingApp app;
    Media content;

    @Override
    public void setMessageApp(MessagingApp messagingApp) {
        this.app = messagingApp;
    }

    @Override
    public void setContent(Media content) {
        this.content = content;
    }

    @Override
    public String getMediaType() {
        return content.getMediaType();
    }

    @Override
    public MediaType getContent() {
        return this.content.getContent();
    }

    @Override
    public void sendMessage() {
        System.out.print( content.getContent()+" : " + getMediaType() + " sent");
        app.sendMessage();
    }
}
