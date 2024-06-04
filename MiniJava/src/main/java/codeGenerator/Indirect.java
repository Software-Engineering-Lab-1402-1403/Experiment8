package codeGenerator;

public class Indirect implements TypeAddress {
    @Override
    public String toString(int num) {
        return "@" + num;
    }
}
