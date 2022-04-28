package co.edu.cesde;

public class Cpu extends Product {
    private String ram;
    private String hardDisk;

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String mostrarCpu() {
        return "Nombre = " + this.getName() + "\n" +
                "Marca = " + this.getBrand() + "\n" +
                "Referencia = " + this.getReference() + "\n" +
                "RAM = " + this.getRam() + "\n" +
                "Disco Duro = " + this.getHardDisk();
    }
}
