package com.example.task05;

public class Salary implements MailItem<Integer> {

    private final String from;
    private final String to;
    private final Integer amount;


    public Salary(String from, String to, Integer amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public Integer getContent() {
        return amount;
    }
}
