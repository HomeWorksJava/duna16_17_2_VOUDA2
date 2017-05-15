package uvegtigris.service.memory;

import uvegtigris.datamodel.keszletTipusLap;
import uvegtigris.service.api.keszletLapService;

public class keszletLapServiceImpl implements keszletLapService {
    @Override
    public keszletTipusLap getKeszletTipusLapByTitle(String pTitle) throws NullPointerException {
        for (keszletTipusLap item:dataStore.keszletlap.getKeszlettipusok())
            if (item.getTitle().equals(pTitle))
                return item;
        throw new NullPointerException();
    }
}
