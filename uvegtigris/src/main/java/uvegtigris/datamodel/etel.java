package uvegtigris.datamodel;

public class etel extends raktarKeszlet {
    private String etelfajta;
    
    public etel(String etelfajta, long ID, String gyarto, String neve) {
        super(ID, gyarto, neve);
        this.etelfajta = etelfajta;
    }
    
    public String getEtelfajta() {
        return etelfajta;
    }
    
    public void setEtelfajta(String etelfajta) {
        this.etelfajta = etelfajta;
    }
}
