package com.tony.bridge;

public class TelegramMessagingApp implements MessagingApp {
    @Override
    public void sendMessage() {
        System.out.println(" via Telegram.");
    }
}
