package com.hz.nand2tetris.assembler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class Code {
    /***
     * Translates symbols into corresponding binary codes, as specified in HashMap
     ***/

    CInstructionDestMap destMap;
    CInstructionCompMap compMap;
    CInstructionJumpMap jumpMap;

    @Autowired
    public Code(CInstructionDestMap dMap, CInstructionCompMap cMap, CInstructionJumpMap jMap) {
        // initialize private variables with corresponding hashmaps

        this.destMap = dMap;
        this.compMap = cMap;
        this.jumpMap = jMap;

    }

    public String dest(String symbol) {
        // returns binary code of symbolic input
        System.out.println("dest symbol:" + symbol + ", translated binary code:" + this.destMap.translate(symbol));
        return this.destMap.translate(symbol);
    }

    public String comp(String symbol) {
        // returns binary code of symbolic input
        System.out.println("comp symbol:" + symbol + ", translated binary code:" + this.compMap.translate(symbol));
        return this.compMap.translate(symbol);
    }

    public String jump(String symbol) {
        // returns binary code of symbolic input
        System.out.println("jump symbol:" + symbol + ", translated binary code:" + this.jumpMap.translate(symbol));
        return this.jumpMap.translate(symbol);
    }


}
