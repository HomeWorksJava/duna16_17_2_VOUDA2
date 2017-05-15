package uvegtigris.service.memory;

import uvegtigris.datamodel.ar;
import uvegtigris.datamodel.etel;
import uvegtigris.datamodel.ital;
import uvegtigris.datamodel.keszletLap;
import uvegtigris.datamodel.keszletTipusLap;
import uvegtigris.datamodel.mennyiseg;
import uvegtigris.datamodel.raktarKeszlet;
import java.util.List;

public class dataStore {
    public static final keszletLap keszletlap = new keszletLap();
    
    static {
        keszletTipusLap itl = new keszletTipusLap();
        itl.setTitle("Ételek");
        
        List<? super raktarKeszlet> etelek = itl.getKeszletek();
        etelek.add(new etel("Gyorsétel", 0, "Lali", "Hot dog"));
        
        List<mennyiseg> mennyiseg = itl.getMennyisegek();
        mennyiseg.add(new mennyiseg(0, 1, "db"));
        
        List<ar> arak = itl.getArak();
        arak.add(new ar((etel)etelek.get(0), mennyiseg.get(0), 450));
        
        keszletlap.addKeszlettipus(itl);
        
        itl = new keszletTipusLap();
        itl.setTitle("Italok");
        
        List<? super raktarKeszlet> italok = itl.getKeszletek();
        italok.add(new ital("Alkoholos ital", 0, "Csoki", "Vegyigyümi"));
        
        mennyiseg = itl.getMennyisegek();
        mennyiseg.add(new mennyiseg(0, 3, "dl"));
        
        arak = itl.getArak();
        arak.add(new ar((ital)italok.get(0), mennyiseg.get(0), 950));
        
        keszletlap.addKeszlettipus(itl);
    }
}
