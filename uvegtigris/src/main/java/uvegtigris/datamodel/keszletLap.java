package uvegtigris.datamodel;

import java.util.ArrayList;
import java.util.List;

public class keszletLap {
    private List<keszletTipusLap> keszlettipusok = new ArrayList<>();
    
    public List<keszletTipusLap> getKeszlettipusok() {
        return keszlettipusok;
    }
    
    public void setKeszlettipusok(List<keszletTipusLap> keszlettipusok) {
        this.keszlettipusok = keszlettipusok;
    }
    
    public void addKeszlettipus(keszletTipusLap keszlettipus) {
        this.keszlettipusok.add(keszlettipus);
    }
}
