package com.zs.pharmaFinal.model;


import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SalesRepMapper implements RowMapper<SalesRep> {

    public SalesRep mapRow(ResultSet resultSet, int i) throws SQLException {

        SalesRep salesRep = new SalesRep();
        salesRep.setId(resultSet.getLong("id"));
        salesRep.setName(resultSet.getString("name"));
        salesRep.setRegion(resultSet.getString("region"));
        salesRep.setOpeningSales(resultSet.getInt("openingSales"));
        salesRep.setClosingSales(resultSet.getInt("closingSales"));
        return salesRep;
    }
}
