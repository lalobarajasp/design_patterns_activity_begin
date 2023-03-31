package com.grid.financial.strategy;

import com.grid.financial.Ride;

import java.io.IOException;
import java.util.List;

public interface StrategyReadAndParseData {
   List<Ride> readAndParseData() throws IOException;
   //return value        //what you receive
}
