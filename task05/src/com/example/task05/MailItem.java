package com.example.task05;

public interface MailItem <T>{
    String getFrom();
    String getTo();
    T getContent();
}
