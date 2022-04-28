package co.edu.cesde;

public class Tv extends Product {
    private double screensize;
    private double resolution;

    public double getScreensize() {
        return screensize;
    }

    public void setScreensize(double screensize) {
        this.screensize = screensize;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }

    public String mostrarTv() {
        return "Nombre = " + this.getName() + "\n" +
                "Marca = " + this.getBrand() + "\n" +
                "Referencia = " + this.getReference() + "\n" +
                "Screensize = " + this.getScreensize() + "\n" +
                "Resolución = " + this.getResolution();
    }
}
