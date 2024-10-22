package com.directi.training.isp.exercise;

public class TimedDoor implements LockableDoor, TimeOutListener {
    private boolean _locked;
    private boolean _opened;

    public TimedDoor(Timer timer) {
        timer.register(100, this); // 100 is the timeout value
    }

    @Override
    public void lock() {
        _locked = true;
    }

    @Override
    public void unlock() {
        _locked = false;
    }

    @Override
    public void open() {
        if (!_locked) {
            _opened = true;
        }
    }

    @Override
    public void close() {
        _opened = false;
    }

    @Override
    public void timeOutCallback() {
        _locked = true; // Lock the door after the timeout
    }
}
