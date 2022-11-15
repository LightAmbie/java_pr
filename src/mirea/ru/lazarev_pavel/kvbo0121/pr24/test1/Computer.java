package mirea.ru.lazarev_pavel.kvbo0121.pr24.test1;

public abstract class Computer {
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "RAM=" + this.getRAM() + "," + "HDD=" + getHDD() + "," + "CPU=" + getCPU();
    }
}
