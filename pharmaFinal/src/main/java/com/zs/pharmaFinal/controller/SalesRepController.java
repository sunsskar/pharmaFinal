package com.zs.pharmaFinal.controller;

import com.zs.pharmaFinal.model.SalesRep;
import com.zs.pharmaFinal.service.SalesRepService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/salesRep") // PUT THE ROOT URL
public class SalesRepController {

    @Resource
    SalesRepService salesRepService;

    @GetMapping(value= "/salesRepList")
    public List<SalesRep> getSalesReps() {
        return salesRepService.getAllSalesRep();
    }

    @PostMapping(value = "/createSalesRep")
    public void createSalesRep(@RequestBody SalesRep salesRep) {
        salesRepService.createSalesRep(salesRep);
    }

    @PutMapping(value = "/updateSalesRep")
    public void updateSalesRep(@RequestBody SalesRep salesRep) {
        salesRepService.updateSalesRep(salesRep);
    }

    @DeleteMapping(value = "/deleteSalesRepById")
    public void deleteSalesRep(@RequestBody SalesRep salesRep) {
        salesRepService.deleteSalesRep(salesRep);
    }
}

