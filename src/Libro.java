import java.util.Scanner;

public class Libro extends Materiale {

    
    private static int contatoreLibri = 0;
    private String autore;
    private String editore;
    private String isbn;
    private int nPagine;

    public Libro(String titolo, String genere, boolean disponibile, String autore, String editore, String isbn,
            int nPagine) {
        super(titolo, genere, disponibile);
        this.autore = autore;
        this.editore = editore;
        this.isbn = isbn;
        this.nPagine = nPagine;
        contatoreLibri++;
        this.codiceInterno = "L" + String.format("%04d", contatoreLibri);
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) {
        this.editore = editore;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getnPagine() {
        return nPagine;
    }

    public void setnPagine(int nPagine) {
        this.nPagine = nPagine;
    }

}
