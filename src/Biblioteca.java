import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

    private static List<Materiale> materiali = new ArrayList<>();
    private static int bId = 0;
    private String via;
    private String civico;
    private String cap;
    private String città;

    public Biblioteca(String via, String civico, String cap, String città) {
        this.via = via;
        this.civico = civico;
        this.cap = cap;
        this.città = città;
        bId++;
    }

    public static int getbId() {
        return bId;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getCivico() {
        return civico;
    }

    public void setCivico(String civico) {
        this.civico = civico;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public static void aggiungiMateriale(Materiale materiale) {

        materiali.add(materiale);
    }

    public static void aggiungiLibro() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Titolo: ");
            String titoloLibro = scanner.nextLine();
            System.out.print("Genere: ");
            String genereLibro = scanner.nextLine();
            System.out.println("È disponibile?");
            boolean disponibile = scanner.nextBoolean();
            scanner.nextLine();
            System.out.print("Autore: ");
            String autore = scanner.nextLine();
            System.out.print("Editore: ");
            String editoreLibro = scanner.nextLine();
            System.out.print("ISBN: ");
            String isbn = scanner.nextLine();
            System.out.print("Numero pagine: ");
            int numeroPagine = scanner.nextInt();
            scanner.nextLine();
            aggiungiMateriale(new Libro(titoloLibro, genereLibro, disponibile, autore, editoreLibro, isbn, numeroPagine));
            System.out.println("Libro aggiunto con successo!");
            
        }

        public static void aggiungiRivista() {
            Scanner scan = new Scanner(System.in);
            System.out.print("Titolo: ");
            String titoloRivista = scan.nextLine();
            System.out.print("Genere: ");
            String genereRivista = scan.nextLine();
            System.out.println("È disponibile?");
            boolean disponibile = scan.nextBoolean();
            scan.nextLine();
            System.out.print("Editore: ");
            String editoreRivista = scan.nextLine();
            System.out.print("Anno: ");
            int anno = scan.nextInt();
            scan.nextLine();
            System.out.print("Numero volume: ");
            int numeroVolume = scan.nextInt();
            scan.nextLine();
            aggiungiMateriale(new Rivista(titoloRivista, genereRivista, disponibile, editoreRivista, anno, numeroVolume));
            System.out.println("Rivista aggiunta con successo!");
        }

    public static boolean verificaDisponibilità(String codiceInterno) {

        for (Materiale m : materiali) {
            if(m.getCodiceInterno().equals(codiceInterno)) {
                return m.disponibile;
            }
        } return false;
    }

    public static void mostraCatalogo() {
        for (Materiale materiale : materiali) {
            System.out.println(materiale);
        }
    }

    public static void effettuaPrestito(String codiceInterno) {
        for (Materiale m : materiali) {
            if(m.getCodiceInterno().equals(codiceInterno)) {
                m.setDisponibile(false);
                System.out.println("Il prestito è stato effettuato.");
            }
        }
        }

    public static void restituisciPrestito(String codiceInterno) {

        for (Materiale m : materiali) {
            if(m.getCodiceInterno().equals(codiceInterno)) {
                m.setDisponibile(true);
                System.out.println("Hai restituito il materiale.");
            }
        }

    }
    public static void trovaCollocazione() {
        
    }
}
