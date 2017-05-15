package uvegtigris.datamodel;

public class ital extends raktarKeszlet {
    private String italfajta;
    
    public ital(String italfajta, long ID, String gyarto, String neve) {
        super(ID, gyarto, neve);
        this.italfajta = italfajta;
    }
    
    public String getItalfajta() {
        return italfajta;
    }
    
    public void setItalfajta(String italfajta) {
        this.italfajta = italfajta;
    }
}
