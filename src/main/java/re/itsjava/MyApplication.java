package re.itsjava;

import re.itsjava.services.StoreService;
import re.itsjava.services.StoreServiceImpl;

public class MyApplication {
    public static void main(String[] args) {
        StoreService storeService = new StoreServiceImpl();
        storeService.start();

    }
}
