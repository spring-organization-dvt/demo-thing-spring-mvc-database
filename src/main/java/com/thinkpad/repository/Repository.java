package com.thinkpad.repository;


public interface Repository<T> {
    T findById(int id);
}
