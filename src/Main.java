import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- GESTION DE EMPLEADOS -----");

        Scanner input=new Scanner(System.in);
        Empleado salario= new Empleado();
        System.out.print("ingrese el nombre del empleado: ");
        salario.setNombre(input.nextLine());
        System.out.print("ingrese las horas regulares trabajadas: ");
        salario.setHorasT(input.nextInt());
        System.out.print("ingrese las horas extras trabajadas: ");
        salario.setHExt(input.nextInt());
        System.out.print("ingrese el valor por hora regular:");
        salario.setVhr(input.nextDouble());

        System.out.println(" ");

        System.out.println("Calculando salario... ");

        System.out.println(" ");

        System.out.println("El salario total de "+salario.getNombre()+" es de: "+salario.pagoTotal());
        System.out.println("La categoria salarial es: "+salario.categoriaSalarial());
    }
}