package com.grid.financial.implementation;

import com.grid.financial.Ride;
import com.grid.financial.service.StrategyReadAndParseData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JSONFileReadAndParse implements StrategyReadAndParseData {
    //Attributes
    private final String JSON_FILENAME;
    List<Ride> result = new ArrayList<>();
    //Constructor
    public JSONFileReadAndParse(String JSON_FILENAME) {
        this.JSON_FILENAME = JSON_FILENAME;
    }
    //Encapsulation Get Method
    public String getJSON_FILENAME() {
        return JSON_FILENAME;
    }



    @Override
    public List<Ride> readAndParseData() throws IOException {

        return null;
    }


}
