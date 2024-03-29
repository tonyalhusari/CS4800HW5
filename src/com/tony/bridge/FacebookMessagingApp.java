package com.tony.bridge;

public class FacebookMessagingApp implements MessagingApp {
    @Override
    public void sendMessage() {
        System.out.println(" via Facebook Messenger.");
    }
}
