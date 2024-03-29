package com.tony.bridge2;

public interface MessageType {

    public void setMessageApp(MessagingApp messagingApp);
    public void setContent(Media content);
    public String getMediaType();
    public MediaType getContent();
    public void sendMessage();
}
