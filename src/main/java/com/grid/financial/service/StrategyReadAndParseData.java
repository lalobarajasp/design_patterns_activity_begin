package com.grid.financial.service;

import com.grid.financial.Ride;

import java.io.IOException;
import java.util.List;

public interface StrategyReadAndParseData {
   // public abstract void readAndParseData(String type_filename) throws IOException;
   List<Ride> readAndParseData() throws IOException;
   //valor de retorno        //lo que recibes
}
