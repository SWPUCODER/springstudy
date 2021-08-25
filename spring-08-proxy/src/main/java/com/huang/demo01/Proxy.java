package com.huang.demo01;

public class Proxy implements Rent{

    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你看房!");
    }

}
