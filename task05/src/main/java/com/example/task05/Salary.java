package com.example.task05;

public class Salary implements MailItem<Integer> {
    private final String from;
    private final String to;
    private final int content;

    public Salary(
            String from,
            String to,
            int content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Integer getContent() {
        return content;
    }
}
