package com.zs.pharmaFinal.dao;

import java.util.List;

import com.zs.pharmaFinal.model.SalesRep;


    public interface SalesRepDao {

        SalesRep getSalesRepById(Long id);
        List<SalesRep> getAllSalesReps();
        boolean deleteSalesRep(SalesRep salesRep);
        boolean updateSalesRep(SalesRep salesRep);
        void createSalesRep(SalesRep salesRep);
    }

