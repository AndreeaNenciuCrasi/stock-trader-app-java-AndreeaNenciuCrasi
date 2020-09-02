package com.codecool.stockApp;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

// TODO
class TraderTest {


    @Test // Bid was lower than price, buy should return false.
    void testBidLowerThanPrice(){
        StockAPIService stockAPIService = mock(StockAPIService.class);
        Trader trader =new Trader();
    }

    @Test // bid was equal or higher than price, buy() should return true.
    void testBidHigherThanPrice() {

    }
}