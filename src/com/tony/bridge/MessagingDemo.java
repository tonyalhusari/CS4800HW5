package com.tony.bridge;

public class MessagingDemo {

    public static void main(String[] args) {

        MessagingApp whatsApp = new WhatsAppMessagingApp();
        MessagingApp facebook = new FacebookMessagingApp();
        MessagingApp telegram = new TelegramMessagingApp();

        MessageType text = new TextMessage();
        text.setContent("Hello World!");
        text.setMessageApp(whatsApp);
        text.sendMessage();
        text.setMessageApp(facebook);
        text.sendMessage();


        MessageType image = new ImageMessage();
        image.setContent("image.jpg");
        image.setMessageApp(telegram);
        image.sendMessage();
        image.setMessageApp(whatsApp);
        image.sendMessage();

        MessageType video = new VideoMessage();
        video.setContent("video.mp4");
        video.setMessageApp(facebook);
        video.sendMessage();
        video.setMessageApp(telegram);
        video.sendMessage();
    }
}