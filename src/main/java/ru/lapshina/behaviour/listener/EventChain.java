package ru.lapshina.behaviour.listener;

import java.util.concurrent.ConcurrentLinkedQueue;

public class EventChain {
    private ConcurrentLinkedQueue<Event> events;
    private Thread loop;
    private Listener listener;

    public EventChain(){
        events = new ConcurrentLinkedQueue<>();

    }
    public void start(){
        loop = new Thread(this::process);
        loop.setDaemon(true);
        loop.start();
    }

    public synchronized void registerListener(Listener listener){
        this.listener = listener;
    }

    private void process(){
        while (true){
            Event event = events.poll();
            if(event!=null){
                listener.onEventRecieved(event);
            }


        }
    }

    public  void publishEvent(Event event){
        events.add(event);
    }
}
