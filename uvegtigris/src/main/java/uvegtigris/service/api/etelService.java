package uvegtigris.service.api;

import uvegtigris.datamodel.etel;
import uvegtigris.datamodel.ar;
import uvegtigris.datamodel.mennyiseg;

public interface etelService {
    public etel getEtelById(long id) throws NullPointerException;
    public ar getAr(etel pEtel, mennyiseg pMennyiseg) throws NullPointerException;
    public mennyiseg getMennyisegById(long id) throws NullPointerException;
}
