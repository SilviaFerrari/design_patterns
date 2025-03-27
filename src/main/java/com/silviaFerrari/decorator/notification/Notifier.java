package com.silviaFerrari.decorator.notification;

public interface Notifier {
    public String getMessage();
    public String getSender();
    public String getReceiver();
    public void setMessage(String message);
    public void setReceiver(String receiver);
    public void setSender(String title);
}
