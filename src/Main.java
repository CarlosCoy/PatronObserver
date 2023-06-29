import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        Servidor gestorEmergencias = new Servidor();

        executeGame(gestorEmergencias);


    }

    private static void executeGame(Servidor gestor) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("" +
                "1- Suscribir nuevo bombero\n" +
                "2- Desuscribir bombero \n" +
                "3- Notificar emergencia\n" +
                "8- Salir");
        int menuOption = sc.nextInt();

        switch (menuOption){
            case 1:
                System.out.println("Ingrese el nombre del bombero");
                String nameToBeAdded = sc2.nextLine();

                Notificador sofkiano = new Notificador(nameToBeAdded);
                gestor.addObserver(sofkiano);

                System.out.println("Bombero suscrito.");
                executeGame(gestor);
                break;

            case 2:
                gestor.getObservers().forEach(System.out::println);

                System.out.println("Por favor ingrese el nombre del bombero");
                String nameToBeRemoved = sc2.nextLine();

                gestor.removeByName(nameToBeRemoved);
                System.out.println("Bombero eliminado.");
                executeGame(gestor);
                break;

            case 3:
                System.out.println("Notificar emergencia" + '\n' + "(Incendio, Terremoto, Accidente, etc)");
                String emergencia = sc2.nextLine();
                gestor.addPodcast(emergencia);
                executeGame(gestor);
                break;
            case 8:
                System.out.println("Gracias por utilizar nuestro sistema!");
                break;
            default:
                System.out.println("Opción incorrecta");
        }
        sc.close();
        sc2.close();
    }
}