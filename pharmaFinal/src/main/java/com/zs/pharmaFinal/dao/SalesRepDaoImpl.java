package com.zs.pharmaFinal.dao;

import com.zs.pharmaFinal.model.SalesRep;
import com.zs.pharmaFinal.model.SalesRepMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;


@Repository
public class SalesRepDaoImpl extends JdbcDaoSupport implements SalesRepDao{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    public SalesRepDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public SalesRep getSalesRepById(Long id) {
        String SQL_FIND_SALESREP = "SELECT * FROM salesrepinfo WHERE id = ?";
        return jdbcTemplate.queryForObject(SQL_FIND_SALESREP, new Object[] { id }, new SalesRepMapper());
    }

    public List<SalesRep> getAllSalesReps() {
        String SQL_GET_ALL = "select * from salesrepinfo";
        return jdbcTemplate.query(SQL_GET_ALL, new SalesRepMapper());
    }

    public boolean deleteSalesRep(SalesRep salesRep) {
        String SQL_DELETE_SALESREP = "delete from salesrepinfo where id = ?";
        return jdbcTemplate.update(SQL_DELETE_SALESREP, salesRep.getId()) > 0;
    }

    public boolean updateSalesRep(SalesRep salesRep) {
        String SQL_UPDATE_SALESREP = "update salesrepinfo set name = ?, region = ?, openingSales  = ? , closingSales  = ? where id = ?";
        return jdbcTemplate.update(SQL_UPDATE_SALESREP, salesRep.getName(), salesRep.getRegion(), salesRep.getOpeningSales(), salesRep.getClosingSales(),  salesRep.getId()) > 0;
    }

    public void createSalesRep(SalesRep salesRep) {
        String SQL_INSERT_SALESREP = "insert into salesrepinfo(id, name, region, openingSales, closingSales) values(?, ?, ?, ?, ?)";
        jdbcTemplate.update(SQL_INSERT_SALESREP, salesRep.getId(), salesRep.getName(), salesRep.getRegion(), salesRep.getOpeningSales(), salesRep.getClosingSales(), salesRep.getOpeningSales());
    }

}

