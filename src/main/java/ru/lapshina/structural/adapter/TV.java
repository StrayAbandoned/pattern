package ru.lapshina.structural.adapter;

public class TV implements TvAction {
    private final RemoteController remoteController;

    public TV(RemoteController remoteController) {
        this.remoteController = remoteController;
    }

    @Override
    public void on() {
        remoteController.ok();

    }

    @Override
    public void off() {
        remoteController.ok();

    }

    @Override
    public void upVolume() {
        remoteController.right();

    }

    @Override
    public void downVolume() {
        remoteController.left();

    }

    @Override
    public void nextChannel() {
        remoteController.up();
    }

    @Override
    public void previousChannel() {
        remoteController.down();

    }

    @Override
    public void chanel(int ch) {
        switch (ch){
            case 1 ->remoteController.one();
            case 2-> remoteController.two();
        }

    }
}
