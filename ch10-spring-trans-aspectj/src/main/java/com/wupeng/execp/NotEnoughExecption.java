package com.wupeng.execp;

public class NotEnoughExecption extends  RuntimeException {
    public NotEnoughExecption() {
        super();
    }

    public NotEnoughExecption(String message) {
        super(message);
    }
}
