public class Day3 {
    
}

/*
            ## Agenda  ##
 
-> compilation and running process
-> compiled vs interpreted languages
-> on top of JVM what languages are popular and used where.
-> packaging/modules in java (vs other programming languages)


# Compilation and running process

* Computer needs assembly code to be run on the CPU.
* Assemly languages is a low level language that can be directly understood by the computer.
* Different levels of abstraction were built with the pass of time.

Newer languages with higher levels of abstraction gradually came to the market.

-- Golang is beginner friendly syntax, and we are getting higher traction in backend code devleopment using this language
-- Rust is very efficient, but it's not a beginner-friendly.
   Memory safe language compared to C/C++.
-- Swift is used by Apple for creating apps. It can also be used to write backend code. It's one of the most elegant languages.
-- Kotlin syntax is similiar to Swift (some features were influenced from Swift). It's run on JVM.



# Compiled Languages.

-- A code in C / C++ / Golang / Rust
-- Compiler will take the code as input and output a binary.
-- This binary can *only* be executed on 
       * the same OS 
       * the same CPU architecture.
    OS : Mac, Linux, Windows, BSD, Android, IOS, Arduino, etc.
    CPU: Raspberry Pi, Intel, AMD, ARM, ARM64, AARCH, etc.

    We cannot run binary meant to be run on a (CPU C1, OS 1) different machine (C2, O2).



# Interpreted Languages

-- A code.
-- Interpreter always requires a 2-step process.
-- first step: Src code -> Byte code.
   This is done by compiler.
-- Second step : Byte code -> Machine code.
   This is done by interpreter. (JIT compiler / JVM)
   This cause the program to run on any machine that has an interpreter.



# JAVA 

-- Java is neither completely compiled nor interpreted. It's a mix of both.
-- Java code is compiled to bytecode using 'javac'.
-- Bytecode is then interpreted by JVM(JIT compiler) which in turn generates machine code for the CPU.
-- Typically compiled / half - compiled languages are faster than interpreted lanaguages. 
   The whole reason being that the compiler can effiently using the stack in function calls.





# How a JAVA code is ultimately executed by the device.


*/


