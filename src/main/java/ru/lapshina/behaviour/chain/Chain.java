package ru.lapshina.behaviour.chain;

import java.util.ArrayList;
import java.util.List;

public class Chain {

    private List<ChainItem> chain;

    public Chain() {
        chain = new ArrayList<>();
    }

    public Object process(Object o){
        Object ob = o;
        for (ChainItem chainItem : chain) {
            ob = chainItem.consume(ob);
        }
        return ob;
    }

    public void add(ChainItem...items){
        chain.addAll(List.of(items));
    }

}
