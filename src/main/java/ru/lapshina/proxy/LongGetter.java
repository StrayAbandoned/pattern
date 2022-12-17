package ru.lapshina.proxy;

import java.util.concurrent.TimeUnit;

public class LongGetter {
    public  long getLong(long value) throws InterruptedException {
        Thread.sleep(2000);
        return value;
    }
}
