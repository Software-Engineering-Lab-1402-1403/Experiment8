package codeGenerator;

public class MemorySymbolTableFacade {
    private Memory mem;

    public MemorySymbolTableFacade(Memory memory) {
        mem = memory;
    }

    public int getDateAddress() {
        mem.addDataSize();
        return mem.getDateAddress();
    }
}
