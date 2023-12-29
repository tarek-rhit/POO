import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Donner le nombre des clients");
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();

        List<Client> clients = new ArrayList<>(nb);

        for (int i = 0; i < nb; i++) {
            System.out.println("veuillez introduire les données du client n°"+i);
            Client client = new Client();
            client.nom = sc.nextLine();
            client.prenom = sc.nextLine();
            client.adresse = sc.nextLine();
            client.tel = sc.nextLine();


            System.out.println("Donner le nombre des biens du client n°" + i);
            int nbre = sc.nextInt();

            for (int j = 0; j < nbre; j++) {
                System.out.println("veuillez introduire les données du bien du client n°"+i);
                client.biensList = new ArrayList<>();
                Biens biens = new Biens();
                biens.adresse = sc.nextLine();
                biens.loyer = sc.nextInt();
                biens.charges=sc.nextFloat();
                biens.nbrPiece= sc.nextInt();

                client.biensList.add(biens);

            }
            clients.add(client);
        }
    }
}
