package com.tegar.dao;

import com.tegar.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(Customer objectType) {
        return jdbcTemplate.update("INSERT INTO public.customer(nama, jenis_kelamin, alamat, created_time) VALUES (?, ?, ?, ?)",
                objectType.getNama(), objectType.getJenisKelamin(), objectType.getAlamat(), objectType.getCreated_time());
    }

    @Override
    public int update(Customer objectType) {
        return 0;
    }

    @Override
    public int delete(Customer objectType) {
        return 0;
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }
}
