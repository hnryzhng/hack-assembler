package com.hz.nand2tetris.assembler;

import java.util.HashMap;
import java.util.Map;

public class CInstructionMap {

    HashMap<String, String> map = new HashMap<>();

    public Map<String, String> getMap() {
        return this.map;
    }

    public String translate(String symbol) {
        // Gets binary code value given symbol
        if (!this.map.containsKey(symbol)) {
            // TODO: return ErrorHandler?
            // TODO: log error?
            System.out.println("symbol does not exist in destMap");
            return null;
        }

        return this.map.get(symbol);
    }
}
