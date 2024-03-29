package com.tony.bridge;

public class TextMessage implements MessageType {
    MessagingApp app;
    String content;
    @Override
    public void setMessageApp(MessagingApp messagingApp) {
        this.app = messagingApp;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getMediaType() {
        return "Text";
    }

    @Override
    public String getContent() {
        return this.content;
    }

    @Override
    public void sendMessage() {
        System.out.print( getMediaType() + " sent");
        app.sendMessage();
    }
}
