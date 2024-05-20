package com.hmdp.utils;

/**
 * auth：DELL
 * 时间：2024/5/20
 * 包： com.hmdp.utils
 */
public interface ILock {

    boolean tryLock(long timeoutSec);

    void unlock();
}
