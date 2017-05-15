package uvegtigris.datamodel;

import java.util.ArrayList;
import java.util.List;

public class etelLap {
    private List<etel> etelek = new ArrayList();
    private List<mennyiseg> mennyiseg = new ArrayList();
    private List<ar> arak = new ArrayList();
    
    public etelLap() {
        
    }
    
    public List<etel> getEtelek() {
        return etelek;
    }

    public void setEtelek(List<etel> etelek) {
        this.etelek = etelek;
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
