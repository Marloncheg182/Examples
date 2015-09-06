package com.springbatch.example.util;

import org.springframework.batch.core.ItemReadListener;

/**
 * Created by Oleg Romanenchuk on 8/27/2015.
 */
public class ReadListener implements ItemReadListener<User> {
    public void beforeRead() {
        System.out.println("Before reading item");
    }

    public void afterRead(User item) {
        System.out.println("After reading an item: " + item.toString());
    }

    public void onReadError(Exception e) {
        System.out.println("Error occurred while reading an item!");
    }
}
