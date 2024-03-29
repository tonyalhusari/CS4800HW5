package com.tony.bridge;

public interface MessageType {

    public void setMessageApp(MessagingApp messagingApp);
    public void setContent(String content);
    public String getMediaType();
    public String getContent();
    public void sendMessage();
}
