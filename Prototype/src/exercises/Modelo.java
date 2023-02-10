package exercises;

public class Modelo {
    private int size;
    private int memory;
    private int cameras;
    private int cpu;
    private int bluetooth;
    private int availableMemoryCards;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getCameras() {
        return cameras;
    }

    public void setCameras(int cameras) {
        this.cameras = cameras;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(int bluetooth) {
        this.bluetooth = bluetooth;
    }

    public int getAvailableMemoryCards() {
        return availableMemoryCards;
    }

    public void setAvailableMemoryCards(int availableMemoryCards) {
        this.availableMemoryCards = availableMemoryCards;
    }

    public Modelo(int size, int memory, int cameras, int cpu, int availableMemoryCards) {
        this.size = size;
        this.memory = memory;
        this.cameras = cameras;
        this.cpu = cpu;
        this.availableMemoryCards = availableMemoryCards;
    }
}
