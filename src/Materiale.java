public class Materiale {

    /*  -idBiblioteca */

    protected String codiceInterno;
    private String titolo;
    private String genere;
    protected boolean disponibile;

    public Materiale(String titolo, String genere, boolean disponibile) {
        this.titolo = titolo;
        this.genere = genere;
        this.disponibile = disponibile;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    public String getCodiceInterno() {
        return codiceInterno;
    }
    
    @Override
    public String toString() {
        return "Materiale [codiceInterno=" + codiceInterno + ", titolo=" + titolo + ", genere=" + genere
                + ", disponibile=" + disponibile + "]";
    }



    

}
