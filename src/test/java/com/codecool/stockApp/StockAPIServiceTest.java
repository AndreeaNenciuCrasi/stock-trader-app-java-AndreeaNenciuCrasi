package com.codecool.stockApp;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.io.IOException;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


// TODO
class StockAPIServiceTest {

    @Test // everything works
    void testGetPriceNormalValues() throws IOException {
        RemoteURLReader reader = mock(RemoteURLReader.class);

        when(reader.readFromUrl("https://run.mocky.io/v3/9e14e086-84c2-4f98-9e36-54928830c980?stock=zzapl")
        ).thenReturn("{'price':338.85}");

        StockAPIService service = new StockAPIService();
        service.setRemoteURLReader(reader);

        assertEquals(338.85, service.getPrice("zzapl"));


    }



    @Test // readFromURL threw an exception
    void testGetPriceServerDown() {

    }

    @Test // readFromURL returned wrong JSON
    void testGetPriceMalformedResponse() {

    }

}