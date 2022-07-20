package ru.itsjava;

import ru.itsjava.services.StoreService;
import ru.itsjava.services.StoreServiceImpl;

public class MyApplication {
    public static void main(String[] args) {
        StoreService storeService = new StoreServiceImpl() ;
        storeService.start();

    }
}
