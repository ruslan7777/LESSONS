package com;

/**
 * Created by RUSLAN77 on  10.11.2016 in Ukraine
 */
// Методам можно передавать объекты
class Block {
    int а, b, c;
    int volume;

    Block(int i, int j, int k) {
        а = i;
        b = j;
        c = k;
        volume = а * b * c;
    }
}
