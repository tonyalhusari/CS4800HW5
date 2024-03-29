package com.tony.bridge2;

import java.util.Arrays;

public class MessagingDemo {

    public static void main(String[] args) {

        MessagingApp whatsApp = new WhatsAppMessagingApp();
        MessagingApp facebook = new FacebookMessagingApp();
        MessagingApp telegram = new TelegramMessagingApp();

        MessageType text = new TextMessage();
        text.setContent(new Text("Hello" , MediaType.TEXT_TYPE));
        text.setMessageApp(whatsApp);
        text.sendMessage();
        text.setMessageApp(facebook);
        text.sendMessage();


        MessageType image = new ImageMessage();
        image.setContent(new Image( "image10.jpg", MediaType.IMAGE_TYPE));
        image.setMessageApp(telegram);
        image.sendMessage();
        image.setMessageApp(whatsApp);
        image.sendMessage();

        MessageType video = new VideoMessage();
        video.setContent(new Video("video009.mp4", MediaType.VIDEO_Type));
        video.setMessageApp(facebook);
        video.sendMessage();
        video.setMessageApp(telegram);
        video.sendMessage();
    }
}