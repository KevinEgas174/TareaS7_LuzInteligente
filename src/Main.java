import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int MAX = 3;
        int indice = 0;
        String id;
        int opc = 0;
        int pos;
        int brillo;

        LuzInteligente luces[] = new LuzInteligente[MAX];
        Scanner sc = new Scanner(System.in);



        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Registrar una nueva luz");
            System.out.println("2. Encender una luz (por indice)");
            System.out.println("3. Apagar una luz (por indice)");
            System.out.println("4. Ajustar brillo de una luz (por indice)");
            System.out.println("5. Mostrar estado de las luces");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {
                case 1:

                    if (indice < MAX){
                        System.out.println("Ingrese su ID: ");
                        id = sc.nextLine();
                        luces[indice++] = new LuzInteligente(id);
                        System.out.println("Luz registrada en el indice " + (indice - 1));

                    } else {
                        System.out.println("No se puede ingresar mas");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el indice de la luz (0 a " + (indice - 1) + "): ");
                    pos = Integer.parseInt(sc.nextLine());

                    if (pos >= 0 && pos < indice){
                        luces[pos].encender();
                        System.out.println("Luz encendida correctamente");
                    } else {
                        System.out.println("Indice no valido");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el indice de la luz (0 a " + (indice - 1) + "): ");
                    pos = Integer.parseInt(sc.nextLine());

                    if (pos >= 0 && pos < indice){
                        luces[pos].apagar();
                        System.out.println("Luz apagada correctamente");
                    } else {
                        System.out.println("Indice no valido");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el indice de la luz (0 a " + (indice - 1) + "): ");
                    pos = Integer.parseInt(sc.nextLine());

                    if (pos >= 0 && pos < indice){
                        System.out.print("Ingrese el nuevo brillo (0-100): ");
                        brillo = Integer.parseInt(sc.nextLine());
                        luces[pos].ajustarBrillo(brillo);
                    } else {
                        System.out.println("Indice no valido");
                    }

                    break;

                case 5:
                    for (int i = 0; i < indice; i++){
                        luces[i].mostrarEstado();
                    }

                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        }
        while (opc != 6);
    }
}
