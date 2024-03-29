package com.tony.bridge2;

public class TelegramMessagingApp implements MessagingApp {
    @Override
    public void sendMessage() {
        System.out.println(" via Telegram.");
    }
}
