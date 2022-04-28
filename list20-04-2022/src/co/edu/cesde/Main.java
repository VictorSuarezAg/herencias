package co.edu.cesde;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* ArrayList<Integer> data = new ArrayList<>();
        data.add(7);
        data.add(5);
        data.add(0, 10);
        data.add(1, 8);
        data.add(3, 7);

        System.out.println(data.get(3)); */
        Scanner scanner = new Scanner(System.in);
        Scanner doubleScanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        List<Monitor> monitores = new ArrayList<>();
        List<Tv> tvs = new ArrayList<>();
        List<Cpu> cpus = new ArrayList<>();

        /*System.out.println("Ingrese marca");
        monitor.setBrand(scanner.nextLine());
        System.out.println("Ingrese Nombre");
        monitor.setName(scanner.nextLine());
        System.out.println("Ingrese Referencia");
        String reference = scanner.nextLine();
        monitor.setReference(scanner.nextLine());
        System.out.println("Ingrese el tamaño de la pantalla");
        monitor.setScreensize(doubleScanner.nextDouble());
        System.out.println("Ingrese la resolución");
        monitor.setResolution(doubleScanner.nextDouble());
        monitores.add(monitor); */
        String continuar = "si";
        int option;

        while (continuar.equals("si") || continuar.equals("Si") || continuar.equals("SI") ) {
           System.out.println("Que producto desea comprar \n" +
                    "1. Tv \n" +
                    "2. Monitor \n" +
                    "3. Cpu");
            option = intScanner.nextInt();
            switch (option){
                case 1:
                    Tv tv = new Tv();
                    System.out.println("Ingrese marca");
                    tv.setBrand(scanner.nextLine());
                    System.out.println("Ingrese Nombre");
                    tv.setName(scanner.nextLine());
                    System.out.println("Ingrese Referencia");
                    tv.setReference(scanner.nextLine());
                    System.out.println("Ingrese el tamaño de la pantalla");
                    tv.setScreensize(doubleScanner.nextDouble());
                    System.out.println("Ingrese la resolución");
                    tv.setResolution(doubleScanner.nextDouble());
                    tvs.add(tv);
                    break;
                case 2:
                    Monitor monitor = new Monitor();
                    System.out.println("Ingrese marca");
                    monitor.setBrand(scanner.nextLine());
                    System.out.println("Ingrese Nombre");
                    monitor.setName(scanner.nextLine());
                    System.out.println("Ingrese Referencia");
                    monitor.setReference(scanner.nextLine());
                    System.out.println("Ingrese el tamaño de la pantalla");
                    monitor.setScreensize(doubleScanner.nextDouble());
                    System.out.println("Ingrese la resolución");
                    monitor.setResolution(doubleScanner.nextDouble());
                    monitores.add(monitor);
                    break;
                case 3:
                    Cpu cpu = new Cpu();
                    System.out.println("Ingrese marca");
                    cpu.setBrand(scanner.nextLine());
                    System.out.println("Ingrese Nombre");
                    cpu.setName(scanner.nextLine());
                    System.out.println("Ingrese Referencia");
                    cpu.setReference(scanner.nextLine());
                    System.out.println("Ingrese el tamaño de la RAM");
                    cpu.setRam(scanner.nextLine());
                    System.out.println("Ingrese El tamaño del disco duro");
                    cpu.setHardDisk(scanner.nextLine());
                    cpus.add(cpu);
                    break;
            }
            System.out.println("Desea comprar otro producto (si/no)");
            continuar = scanner.nextLine();
        }
        System.out.println("Desea ver los productos comprados de la categoria \n" +
                "1. Tv \n" +
                "2. Monitor \n" +
                "3. Cpu \n" +
                "4. Mostrar todos");
        option = intScanner.nextInt();
        switch (option) {
            case 1:
                for (int t = 0; t < tvs.size(); t++) {
                    System.out.println("Los Tvs comprados son: \n" +
                            tvs.get(t).mostrarTv() + "\n");
                }
                break;
            case 2:
                for (int m = 0; m < monitores.size(); m++) {
                    System.out.println("Los monitores comprados son: \n" +
                            monitores.get(m).mostrarMonitor() + "\n");
                }
                break;
            case 3:
                for (int c = 0; c < monitores.size(); c++) {
                    System.out.println("Las Cpu compradas son: \n" +
                            cpus.get(c).mostrarCpu() + "\n");
                }
                break;
            case 4:
                for (int t = 0; t < tvs.size(); t++) {
                    System.out.println("Tv: \n" +
                            tvs.get(t).mostrarTv() + "\n");
                }
                for (int m = 0; m < monitores.size(); m++) {
                    System.out.println("Monitor: \n" +
                            monitores.get(m).mostrarMonitor() + "\n");
                }
                for (int c = 0; c < monitores.size(); c++) {
                    System.out.println("Cpu: \n" +
                            cpus.get(c).mostrarCpu() + "\n");
                }
                break;
        }
        System.out.println("Escriba la referencia que desea buscar: ");
        String searchReference = scanner.nextLine();
        int flag = 0;
        for (int sm = 0; sm < monitores.size(); sm++) {
            if (monitores.get(sm).getReference().equalsIgnoreCase(searchReference)) {
                flag++;
                System.out.println("El producto buscado es el monitor: \n" +
                        monitores.get(sm).mostrarMonitor());
                break;
            }
        }
        for (int st = 0; st < tvs.size(); st++) {
            if (tvs.get(st).getReference().equalsIgnoreCase(searchReference)) {
                flag++;
                System.out.println("El producto buscado es el Tv: \n" +
                        tvs.get(st).mostrarTv());
                break;
            }
        }
        for (int sc = 0; sc < cpus.size(); sc++) {
            if (cpus.get(sc).getReference().equalsIgnoreCase(searchReference)) {
                flag++;
                System.out.println("El producto buscado es la Cpu: \n" +
                        cpus.get(sc).mostrarCpu());
                break;
            }
        }
        if (flag == 0) {
            System.out.println("No hay registros");
        }

    }
}
