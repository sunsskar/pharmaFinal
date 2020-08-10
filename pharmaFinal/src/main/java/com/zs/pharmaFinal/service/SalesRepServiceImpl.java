package com.zs.pharmaFinal.service;

import com.zs.pharmaFinal.dao.SalesRepDao;
import com.zs.pharmaFinal.model.SalesRep;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SalesRepServiceImpl implements SalesRepService {

    SalesRepDao salesRepDao;
    @Override
    public SalesRep getSalesRepById(Long id) {
        return salesRepDao.getSalesRepById(id);
    }

    @Override
    public List<SalesRep> getAllSalesRep() { return salesRepDao.getAllSalesReps(); }

    @Override
    public void createSalesRep(SalesRep salesRep) {
        salesRepDao.createSalesRep(salesRep);
    }

    @Override
    public void updateSalesRep(SalesRep salesRep) {
        salesRepDao.updateSalesRep(salesRep);
    }

    @Override
    public void deleteSalesRep(SalesRep salesRep) {
        salesRepDao.deleteSalesRep(salesRep);
    }
}
