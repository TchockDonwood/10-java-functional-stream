package com.example.task05;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<MailItem<T>> {
    private final Map<String, List<T>> mailBox = new HashMap<>();

    @Override
    public void accept(MailItem<T> mailItem) {
        if (mailItem == null) return;
        String to = mailItem.getTo();
        T content = mailItem.getContent();
        if (to == null || content == null) return;
        mailBox.computeIfAbsent(to, k -> new ArrayList<>()).add(content);
    }

    public Map<String, List<T>> getMailBox() {
        return new AbstractMap<String, List<T>>() {
            @Override
            public Set<Entry<String, List<T>>> entrySet() {
                return mailBox.entrySet();
            }
            @Override
            public List<T> get(Object key) {
                List<T> list = mailBox.get(key);
                return list != null ? list : Collections.emptyList();
            }
        };
    }
}