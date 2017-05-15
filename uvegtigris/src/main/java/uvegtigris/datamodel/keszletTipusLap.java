package uvegtigris.datamodel;

import java.util.ArrayList;
import java.util.List;

public class keszletTipusLap {
    private String title = "";
    private List<? super raktarKeszlet> keszletek = new ArrayList();
    private List<mennyiseg> mennyisegek = new ArrayList();
    private List<ar> arak = new ArrayList();
    
    public keszletTipusLap() {
        
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public List<? super raktarKeszlet> getKeszletek() {
        return keszletek;
    }
    
    public void setKeszletek(List<? super raktarKeszlet> keszletek) {
        this.keszletek = keszletek;
    }
    
    public void addKeszlet(raktarKeszlet keszlet) {
        this.keszletek.add(keszlet);
    }
    
    public List<mennyiseg> getMennyisegek() {
        return mennyisegek;
    }

    public void setMennyisegek(List<mennyiseg> mennyisegek) {
        this.mennyisegek = mennyisegek;
    }

    public void addMennyiseg(mennyiseg mennyiseg) {
        this.mennyisegek.add(mennyiseg);
    }
    
    public List<ar> getArak() {
        return arak;
    }

    public void setArak(List<ar> arak) {
        this.arak = arak;
    }
    
    public void addAr(ar ar) {
        this.arak.add(ar);
    }
}
