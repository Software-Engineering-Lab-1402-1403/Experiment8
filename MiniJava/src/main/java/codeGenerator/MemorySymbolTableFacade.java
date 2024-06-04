package codeGenerator;

public class MemorySymbolTableFacade {
    private Memory mem;

    public MemorySymbolTableFacade(Memory memory) {
        mem = memory;
    }

    public int getDateAddress() {
        return mem.getDateAddress();
    }
}
