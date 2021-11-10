package com.hz.nand2tetris.assembler;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CInstructionJumpMap extends CInstructionMap {

    public CInstructionJumpMap() {
        this.map.put(null, "000");
        this.map.put("JGT","001");
        this.map.put("JEQ","010");
        this.map.put("JGE","011");
        this.map.put("JLT","100");
        this.map.put("JNE","101");
        this.map.put("JLE","110");
        this.map.put("JMP","111");
    }

}