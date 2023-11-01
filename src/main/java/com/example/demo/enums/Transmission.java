package com.example.demo.enums;

import org.springframework.transaction.annotation.Transactional;

public enum Transmission {
    MANUAL(1),
    AUTOMATIC(2);
    Transmission(int name){}
}
