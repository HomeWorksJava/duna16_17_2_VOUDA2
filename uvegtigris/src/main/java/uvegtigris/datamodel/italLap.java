package uvegtigris.datamodel;

import java.util.ArrayList;
import java.util.List;

public class italLap {
    private List<ital> italok = new ArrayList();
    private List<mennyiseg> mennyiseg = new ArrayList();
    private List<ar> arak = new ArrayList();
    
    public italLap() {

    }
    
    public List<ital> getItalok() {
        return italok;
    }

    public void setItalok(List<ital> italok) {
        this.italok = italok;
    }

    public List<mennyiseg> getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(List<mennyiseg> mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public List<ar> getArak() {
        return arak;
    }

    public void setArak(List<ar> arak) {
        this.arak = arak;
    }
}
