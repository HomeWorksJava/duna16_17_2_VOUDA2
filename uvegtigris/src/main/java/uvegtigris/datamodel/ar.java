package uvegtigris.datamodel;

public class ar {
    private raktarKeszlet keszlet;
    private mennyiseg me;
    private long ar;
    
    public ar(raktarKeszlet keszlet, mennyiseg me, long ar) {
        this.keszlet = keszlet;
        this.me = me;
        this.ar = ar;
    }
    
    public raktarKeszlet getKeszlet() {
        return keszlet;
    }
    
    public void setKeszlet(raktarKeszlet keszlet) {
        this.keszlet = keszlet;
    }
    
    public mennyiseg getMe() {
        return me;
    }
    
    public void setMe(mennyiseg me) {
        this.me = me;
    }
    
    public long getAr() {
        return ar;
    }
    
    public void setAr(long ar) {
        this.ar = ar;
    }
}
