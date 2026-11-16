package com.example.task05;

public interface MailItem<T> {
    public String getFrom();
    public String getTo();
    public T getContent();
}
