package com.tony.bridge2;

public class WhatsAppMessagingApp implements MessagingApp {
    @Override
    public void sendMessage() {
        System.out.println(" via WhatsApp.");
    }
}
