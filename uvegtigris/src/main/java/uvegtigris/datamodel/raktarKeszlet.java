package uvegtigris.datamodel;

public class raktarKeszlet {
    protected long ID;
    private String gyarto;
    private String neve;
    
    public raktarKeszlet(long ID, String gyarto, String neve) {
        this.ID = ID;
        this.gyarto = gyarto;
        this.neve = neve;
    }
    
    public long getID() {
        return ID;
    }
    
    public void setID(long ID) {
        this.ID = ID;
    }
    
    public String getGyarto() {
        return gyarto;
    }
    
    public void setGyarto(String gyarto) {
        this.gyarto = gyarto;
    }
    
    public String getNeve() {
        return neve;
    }
    
    public void setNeve(String neve) {
        this.neve = neve;
    }
}
