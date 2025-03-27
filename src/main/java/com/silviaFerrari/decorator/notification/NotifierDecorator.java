package com.silviaFerrari.decorator.notification;

public abstract class NotifierDecorator implements Notifier{
    String message;
    String sender;
    String receiver;

    public NotifierDecorator(String message, String sender, String receiver){
        this.message = message;
        this.sender = sender;
        this.receiver = receiver;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public String getSender() {
        return this.sender;
    }

    @Override
    public String getReceiver() {
        return this.receiver;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    @Override
    public void setSender(String title) {
        this.sender = title;
    }
}
