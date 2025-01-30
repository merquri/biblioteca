import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca("Via Roma", "12", "54564", "Roma");
        Libro libro1 = new Libro("After", "Romantico", false, "Tiziacaia", "Editore", "g5t5y54h455g4546545", 1);
        Rivista rivista1 = new Rivista("Gioca Ragazzo", "Gossip", true, "Davis Ucarlo", 2022, 3);

        Biblioteca.aggiungiMateriale(rivista1);
        Biblioteca.aggiungiMateriale(libro1);

        boolean risposta = true;

        while (risposta) {
            System.out.println("Cosa vuoi fare?");
            System.out.println("1. Aggiungi Materiale");
            System.out.println("2. Verifica disponibilità");
            System.out.println("3. Effettua prestito");
            System.out.println("4. Restituisci prestito");
            System.out.println("5. Mostra catalogo");
            System.out.println("6. Trova Collocazione");
            System.out.println("7. Esci");

            int input = sc.nextInt();
            sc.nextLine();

            switch (input) {
                case 1:
                    System.out.println("Vuoi aggiungere un libro o una rivista?");
                    String rispostaAdd = sc.nextLine();
                    if (rispostaAdd.equals("libro")) {
                        Biblioteca.aggiungiLibro();
                    } else if (rispostaAdd.equals("rivista")) {
                        Biblioteca.aggiungiRivista();
                    } else {
                        System.out.println("Scelta non valida.");
                    }
                    break;
                case 2:
                    System.out.println("Inserisci il codice interno del materiale che vuoi controllare");
                    String codice = sc.nextLine();

                    boolean disponibile = Biblioteca.verificaDisponibilità(codice);

                    if (disponibile) {
                        System.out.println("Il materiale con codice " + codice + " è disponibile.");
                    } else {
                        System.out.println("Il materiale con codice " + codice + " non è disponibile.");
                    }

                    break;
                case 3:
                    System.out.println("Inserisci il codice del materiale che vuoi prendere in prestito:");
                    String codPrestito = sc.nextLine();
                    boolean disponibile2 = Biblioteca.verificaDisponibilità(codPrestito);
                    if (disponibile2) {
                        Biblioteca.effettuaPrestito(codPrestito);
                    } else {
                        System.out.println("Materiale non disponibile.");
                    }

                    break;
                case 4:
                    System.out.println("Inserisci il codice del materiale che vuoi restituire:");
                    String codPrestito2 = sc.nextLine();
                    boolean disponibile3 = Biblioteca.verificaDisponibilità(codPrestito2);
                    if (!disponibile3) {
                        Biblioteca.restituisciPrestito(codPrestito2);
                    } else {
                        System.out.println("Materiale già presente.");
                    }
                    break;
                case 5:
                    Biblioteca.mostraCatalogo();
                    break;
                case 6:
                    System.out.println("6. Trova Collocazione");
                    break;
                case 7:
                    risposta = false;
                    break;
                default:
                    System.out.println("Operazione non valida");
                    break;
            }
        }

        sc.close();
    }
}
