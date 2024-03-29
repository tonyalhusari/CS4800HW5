package com.tony.bridge;

public class WhatsAppMessagingApp implements MessagingApp {
    @Override
    public void sendMessage() {
        System.out.println(" via WhatsApp.");
    }
}
