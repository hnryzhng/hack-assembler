package com.hz.nand2tetris.assembler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AssemblerApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(AssemblerApplication.class, args);
		Code code = applicationContext.getBean(Code.class);	// Gets Code bean and methods

		// TODO BOOKMARK: Work on Parser

		code.dest("M");
		code.dest("MD");
		code.dest("AMD");

		code.jump("JGT");
		code.jump("JNE");
		code.jump("JMP");

		code.comp("D|A");
		code.comp("M");
		code.comp("D&A");

//		Tester test = new Tester();
//		test.printMe("hoho");






	}

}
