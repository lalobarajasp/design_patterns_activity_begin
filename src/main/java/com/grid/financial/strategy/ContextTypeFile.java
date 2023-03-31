package com.grid.financial.strategy;

import com.grid.financial.Ride;

import java.io.IOException;
import java.util.List;

public class ContextTypeFile {
    private StrategyReadAndParseData strategyReadAndParseData;

    public ContextTypeFile(StrategyReadAndParseData strategyReadAndParseData) {
        this.strategyReadAndParseData = strategyReadAndParseData;
    }

    public List<Ride> readAndParseData() throws IOException {
        return strategyReadAndParseData.readAndParseData();
    }

}
