package com.hz.nand2tetris.assembler;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CInstructionDestMap extends CInstructionMap {

    public CInstructionDestMap() {
        this.map.put(null, "000");
        this.map.put("M", "001");
        this.map.put("D", "010");
        this.map.put("MD", "011");
        this.map.put("A", "100");
        this.map.put("AM", "101");
        this.map.put("AD", "110");
        this.map.put("AMD", "111");
    }

}
