package codeGenerator;

import scanner.token.Token;

public class CodeGeneratorParserFacade {
    private final CodeGenerator codeGeneratorHere;

    //Constructor
    public CodeGeneratorParserFacade() {
        codeGeneratorHere = new CodeGenerator();
    }

    public void semanticFunction(int func, Token next) {
        codeGeneratorHere.semanticFunction(func, next);
    }

    public void printMemory() {
        codeGeneratorHere.printMemory();
    }
}
