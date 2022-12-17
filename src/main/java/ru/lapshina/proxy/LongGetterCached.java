package ru.lapshina.proxy;

import java.util.HashMap;
import java.util.Map;

public class LongGetterCached extends LongGetter{
    private  LongGetter longGetter;
    private Map<Long, Long> cache;

    public LongGetterCached(LongGetter longGetter) {
        this.longGetter = longGetter;
        cache = new HashMap<>();
    }

    @Override
    public long getLong(long value) throws InterruptedException {
        if (!cache.containsKey(value)){
            cache.put(value, super.getLong(value));

        }
        return cache.get(value);
    }
}
