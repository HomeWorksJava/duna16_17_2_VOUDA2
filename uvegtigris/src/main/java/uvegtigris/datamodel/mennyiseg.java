package uvegtigris.datamodel;

public class mennyiseg {
    private long ID;
    private Integer mennyiseg;
    private String mertekegyseg;
    
    public mennyiseg(long ID, Integer mennyiseg, String mertekegyseg) {
        this.ID = ID;
        this.mennyiseg = mennyiseg;
        this.mertekegyseg = mertekegyseg;
    }
    
    public long getID() {
        return ID;
    }
    
    public void setID(long ID) {
        this.ID = ID;
    }
    
    public Integer getMennyiseg() {
        return mennyiseg;
    }
    
    public void setMennyiseg(Integer mennyiseg) {
        this.mennyiseg = mennyiseg;
    }
    
     public String getMertekegyseg() {
        return mertekegyseg;
    }
    
    public void setMertekegyseg(String mertekegyseg) {
        this.mertekegyseg = mertekegyseg;
    }
}
