package uvegtigris.service.memory;

import uvegtigris.datamodel.raktarKeszlet;
import uvegtigris.datamodel.ar;
import uvegtigris.datamodel.ital;
import uvegtigris.datamodel.keszletTipusLap;
import uvegtigris.datamodel.mennyiseg;
import uvegtigris.service.api.keszletLapService;
import uvegtigris.service.api.italService;
import java.util.List;

public class italServiceImpl implements italService {
    private static final String KESZLETTIPUS = "Italok";
    raktarKeszletServiceImpl base = new raktarKeszletServiceImpl();
    keszletLapService keszletLapService = new keszletLapServiceImpl();
    
    @Override
    public ar getAr(ital pItal, mennyiseg pMennyiseg) throws NullPointerException {
        keszletTipusLap itl = keszletLapService.getKeszletTipusLapByTitle(KESZLETTIPUS);
        return base.getAr(itl.getArak(), pItal, pMennyiseg);
    }
    
    @Override
    public ital getItalById(long id) throws NullPointerException {
        keszletTipusLap itl = keszletLapService.getKeszletTipusLapByTitle(KESZLETTIPUS);
        return (ital)base.getRaktarKeszletById((List<raktarKeszlet>)itl.getKeszletek(), id);
    }
    
    @Override
    public mennyiseg getMennyisegById(long id) throws NullPointerException {
        keszletTipusLap itl = keszletLapService.getKeszletTipusLapByTitle(KESZLETTIPUS);
        return base.getMennyisegById(itl.getMennyisegek(), id);
    }
}
