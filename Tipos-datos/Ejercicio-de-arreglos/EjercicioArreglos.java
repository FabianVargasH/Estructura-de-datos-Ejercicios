import java.io.*;
public class EjercicioArreglos {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numPisos =0;
        int numEdificios = 0;
        int numHabitaciones = 0;
        int opcion =0;
        System.out.print("ingrese el numero de pisos: ");
        numPisos = Integer.parseInt(br.readLine());
        System.out.print("Ingrese el numero de edificios: ");
        numEdificios = Integer.parseInt(br.readLine());
        System.out.print("Ingrese el numero de habitaciones: ");
        numHabitaciones = Integer.parseInt(br.readLine());

        boolean[][][] arregloHotel = new boolean[numEdificios][numPisos][numHabitaciones];

        while(opcion !=3){
            System.out.println("- - - - - - - - - -");
            System.out.println("\nMenú");
            System.out.println("1. Cambiar estado de una habitación");
            System.out.println("2. Contar habitaciones disponibles");
            System.out.println("3. Salir");
            System.out.println("Elija la opción que necesite:");
            opcion = Integer.parseInt(br.readLine());

            switch(opcion) {
                case 1:
                    System.out.println("Edificio (1 - " + numEdificios + "): ");
                    int edificioElegido = Integer.parseInt(br.readLine());
                    int edificios = edificioElegido -1;
                    
                    System.out.println("Piso (1 - " + numPisos+"): ");
                    int pisoElegido = Integer.parseInt(br.readLine());
                    int pisos = pisoElegido -1;

                    System.out.println("Habitaciones (1 -" + numHabitaciones + "): ");
                    int habitacionElegida = Integer.parseInt(br.readLine());
                    int habitaciones = habitacionElegida -1;

                    arregloHotel[edificios][pisos][habitaciones] = !arregloHotel[edificios][pisos][habitaciones];

                    System.out.println("Estado cambiado. Ahora está ");
                    if (arregloHotel[edificios][pisos][habitaciones]) {
                        System.out.println("Ocupada");
                    } else {
                        System.out.println("Disponible");
                    }
                    break;
                case 2:
                    int disponibles = 0;
                    for (int i = 0; i < numEdificios; i++) {
                        for (int j = 0; j < numPisos; j++) {
                            for (int k = 0; k < numHabitaciones; k++) {
                                if(!arregloHotel[i][j][k]){
                                    disponibles++;
                                }
                                
                            }
                            
                        }
                    }
                    System.out.println("Habitaciones disponibles: " + disponibles);
                    break;
                    case 3:
                        System.out.println("Saliendo");
                        break;
                    default:
                        System.out.println("La opción que digitó no es valida");
            }
        }
    }
}
