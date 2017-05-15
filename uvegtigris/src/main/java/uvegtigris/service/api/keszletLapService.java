package uvegtigris.service.api;

import uvegtigris.datamodel.keszletTipusLap;

public interface keszletLapService {
    public keszletTipusLap getKeszletTipusLapByTitle(String pTitle) throws NullPointerException;
}
