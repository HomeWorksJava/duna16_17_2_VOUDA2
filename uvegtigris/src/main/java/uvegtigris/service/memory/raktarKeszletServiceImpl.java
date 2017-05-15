package uvegtigris.service.memory;

import uvegtigris.datamodel.raktarKeszlet;
import uvegtigris.datamodel.ar;
import uvegtigris.datamodel.mennyiseg;
import java.util.List;

public class raktarKeszletServiceImpl {
    public ar getAr(List<ar> pSource, raktarKeszlet pKeszlet, mennyiseg pMennyiseg) throws NullPointerException {
        for (ar item:pSource)
            if (item.getKeszlet().equals(pKeszlet) && item.getMe().equals(pMennyiseg))
                return item;
        throw new NullPointerException();
    }
    
    public raktarKeszlet getRaktarKeszletById(List<raktarKeszlet> pSource, long id) throws NullPointerException {
        for (raktarKeszlet item:pSource)
            if (item.getID() == id)
                return item;
        throw new NullPointerException();
    }
    
    public mennyiseg getMennyisegById(List<mennyiseg> pSource, long id) throws NullPointerException {
        for (mennyiseg item:pSource)
            if (item.getID() == id)
                return item;
        throw new NullPointerException();
    }
}
