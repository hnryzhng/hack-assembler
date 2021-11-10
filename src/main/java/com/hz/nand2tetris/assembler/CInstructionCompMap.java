package com.hz.nand2tetris.assembler;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CInstructionCompMap extends CInstructionMap {
    public CInstructionCompMap() {
        // binary code: a c1 c2 c3 c4 c5 c6

        // when a = 0
        this.map.put("0", "0101010");
        this.map.put("1", "0111111");
        this.map.put("-1", "0111010");
        this.map.put("D", "0001100");
        this.map.put("A", "0110000");
        this.map.put("!D", "0001101");
        this.map.put("!A", "0110001");
        this.map.put("-D", "0001111");
        this.map.put("-A", "0110011");
        this.map.put("D+1", "0011111");
        this.map.put("A+1", "0110111");
        this.map.put("D-1", "0001110");
        this.map.put("A-1", "0110010");
        this.map.put("D+A", "0000010");
        this.map.put("D-A", "0010011");
        this.map.put("A-D", "0000111");
        this.map.put("D&A", "0000000");
        this.map.put("D|A", "0010101");

        // when a = 1
        this.map.put("M", "1110000");
        this.map.put("!M", "1110001");
        this.map.put("-M", "1110011");
        this.map.put("M+1", "1110111");
        this.map.put("M-1", "1110010");
        this.map.put("D+M", "1000010");
        this.map.put("D-M", "1010011");
        this.map.put("M-D", "1000111");
        this.map.put("D&M", "1000000");
        this.map.put("D|A", "1010101"); // replaces D|A above

    }
}