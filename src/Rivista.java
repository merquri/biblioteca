import java.time.Year;

public class Rivista extends Materiale {

    private static int contatoreRiviste = 0;
    private String editore;
    private int anno;
    private int nVolume;
    
    public Rivista(String titolo, String genere, boolean disponibile, String editore, int anno, int nVolume) {
        super(titolo, genere, disponibile);
        this.editore = editore;
        this.anno = anno;
        this.nVolume = nVolume;
        contatoreRiviste++;
        this.codiceInterno = "R" + String.format("%04d", contatoreRiviste);
    }
    public String getEditore() {
        return editore;
    }
    public void setEditore(String editore) {
        this.editore = editore;
    }
    public int getAnno() {
        return anno;
    }
    public void setAnno(int anno) {
        this.anno = anno;
    }
    public int getnVolume() {
        return nVolume;
    }
    public void setnVolume(int nVolume) {
        this.nVolume = nVolume;
    }

}
