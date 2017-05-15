package uvegtigris.service.api;

import uvegtigris.datamodel.ital;
import uvegtigris.datamodel.ar;
import uvegtigris.datamodel.mennyiseg;

public interface italService {
    public ital getItalById(long id) throws NullPointerException;
    public ar getAr(ital pItal, mennyiseg pMennyiseg) throws NullPointerException;
    public mennyiseg getMennyisegById(long id) throws NullPointerException;
}
