package com.grid.financial.strategy;

import com.grid.financial.facade.CSVUtils;
import com.grid.financial.Ride;
import com.grid.financial.builder.RidesParser;
import com.grid.financial.clientTest.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CSVFileReadAndParse implements StrategyReadAndParseData {
    //Attributes
    private final String CSV_FILENAME;
    List<Ride> result = new ArrayList<>();

    //Constructor
    public CSVFileReadAndParse(String CSV_FILENAME) {
        this.CSV_FILENAME = CSV_FILENAME;
    }

    //Encapsulation Get Method
    public String getCSV_FILENAME() {
        return CSV_FILENAME;
    }


    @Override
    public List<Ride> readAndParseData() throws IOException {
        InputStream inputStream = Client.class.getClassLoader().getResourceAsStream(CSV_FILENAME);
        InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader);

        for (String rawLine; (rawLine = reader.readLine()) != null;) {
            List<String> line = CSVUtils.parseLine(rawLine);
            Ride newRide = RidesParser.parseFromList(line);
            if(newRide != null) {
                result.add(newRide);
            }
        }
        return result;
    }
}
