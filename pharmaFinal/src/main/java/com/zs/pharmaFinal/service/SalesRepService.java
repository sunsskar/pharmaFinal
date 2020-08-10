package com.zs.pharmaFinal.service;

import com.zs.pharmaFinal.model.SalesRep;

import java.util.List;

public interface SalesRepService {

    SalesRep getSalesRepById(Long id);
    public List<SalesRep> getAllSalesRep();
    public void createSalesRep(SalesRep salesRep);
    public void updateSalesRep(SalesRep salesRep);
    public void deleteSalesRep(SalesRep salesRep);

}
