//package com.hz.nand2tetris.assembler;
//
//public class Parser {
//
//    public Parser(String inputFilePath) {
//        // opens input file/stream
//        // preps for parsing
//
//    }
//
//    public boolean hasMoreLines() {
//        // maybe not public if only called in advance()
//    }
//
//    public void advance() {
//        // reads next line from instruction input and makes it current instruction
//        // skips over white space and comments
//        // should only be called if hasMoreLines() is true
//        // No current instruction initially
//    }
//
////    public enum instructionType() {
////        // return type of current instruction, which is a constant or enum
////        // enum types: A_INSTRUCTION, C_INSTRUCTION, L_INSTRUCTION
////    }
//
//    public String symbol() {
//        // should be called only if instructionType() is A_INSTRUCTION or L_INSTRUCTION
//        // if current instruction is (xxx), return symbol xxx.
//        // if current instruction is @xxx, returns symbol or decimal xxx.
//    }
//
//    public String dest() {
//        // should only be called if instructionType() is C_INSTRUCTION
//        // returns symbolic dest part of current C-instruction
//    }
//
//    public String comp() {
//        // should only be called if instructionType() is C_INSTRUCTION
//        // returns symbolic comp part of current C-instruction
//    }
//
//    public String jump() {
//        // should only be called if instructionType() is C_INSTRUCTION
//        // returns symbolic jump part of current C-instruction
//    }
//
//}
