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
        List<Monitor> monitores = new ArrayList<>();
        Monitor monitor = new Monitor();
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

        while (continuar.equals("si") || continuar.equals("Si") || continuar.equals("SI") ) {
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
            System.out.println("Desea ingresar otro monitor (si/no)");
            continuar = scanner.nextLine();
        }
    }
}
