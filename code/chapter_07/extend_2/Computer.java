package code.chapter_07.extend_2;

public class Computer {
    private String cpu;
    private int memory;
    public Computer(String cpu, int memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public int getMemory() {
        return memory;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getDetails(){
        return "cpu = " + this.cpu + "memory = " + this.memory;
    }
    
}
