package com.tegar.mapper;

import com.tegar.pojo.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerMapper implements RowMapper<Customer> {

    @Override
    public Customer mapRow(ResultSet rs, int i) throws SQLException {
        Customer customer = new Customer();
        customer.setId(rs.getInt(1));
        customer.setNama(rs.getString(2));
        customer.setJenisKelamin(rs.getString(3));
        customer.setAlamat(rs.getString(4));
        customer.setCreated_time(rs.getDate(5));
        return null;
    }
}
