package com.nagybogi;

/**
 * Created by nagy on 2017.03.14..
 */
public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
