package uvegtigris.service.memory;

import uvegtigris.datamodel.raktarKeszlet;
import uvegtigris.datamodel.ar;
import uvegtigris.datamodel.etel;
import uvegtigris.datamodel.keszletTipusLap;
import uvegtigris.datamodel.mennyiseg;
import uvegtigris.service.api.keszletLapService;
import uvegtigris.service.api.etelService;
import java.util.List;

public class etelServiceImpl implements etelService {
    private static final String KESZLETTIPUS = "Ételek";
    raktarKeszletServiceImpl base = new raktarKeszletServiceImpl();
    keszletLapService keszletLapService = new keszletLapServiceImpl();
    
    @Override
    public ar getAr(etel pEtel, mennyiseg pMennyiseg) throws NullPointerException {
        keszletTipusLap itl = keszletLapService.getKeszletTipusLapByTitle(KESZLETTIPUS);
        return base.getAr(itl.getArak(), pEtel, pMennyiseg);
    }
    
    @Override
    public etel getEtelById(long id) throws NullPointerException {
        keszletTipusLap itl = keszletLapService.getKeszletTipusLapByTitle(KESZLETTIPUS);
        return (etel)base.getRaktarKeszletById((List<raktarKeszlet>)itl.getKeszletek(), id);
    }
    
    @Override
    public mennyiseg getMennyisegById(long id) throws NullPointerException {
        keszletTipusLap itl = keszletLapService.getKeszletTipusLapByTitle(KESZLETTIPUS);
        return base.getMennyisegById(itl.getMennyisegek(), id);
    }
}
