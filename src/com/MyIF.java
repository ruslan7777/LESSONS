package com;

/**
 * Created by RUSLAN77 on  13.12.2016 in Ukraine
 */


//public interface MyIF {
//    // Объявление "обычного" метода интерфейса, которое НЕ включает определение реализации по умолчанию
//    int getUserID();
//
//    // Объявление метода по умолчанию, включающее его реализацию
//    default int getAdminID() {
//        return 1;
//    }
//}


public interface MyIF {
    // Объявление обычного метода интерфейса, которое НЕ включает определение реализации по умолчанию
    int getUserID();

    // Объявление метода по умолчанию, включающее его реализацию
    default int getAdminID() {
        return 1;
    }

    // Объявление статического метода интерфейса
    static int getUniversalID() {
        return 0;
    }
}
