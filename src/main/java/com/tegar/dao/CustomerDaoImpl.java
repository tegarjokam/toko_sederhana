package com.tegar.dao;

import com.tegar.mapper.CustomerMapper;
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
        return jdbcTemplate.update("UPDATE public.customer SET nama = ?, jenis_kelamin = ?, alamat = ? WHERE id = ?",
                objectType.getNama(), objectType.getJenisKelamin(), objectType.getAlamat(), objectType.getId());
    }

    @Override
    public int delete(Customer objectType) {
        return jdbcTemplate.update("DELETE FROM public.customer WHERE id = ?", objectType.getId());
    }

    @Override
    public List<Customer> findAll() {
        return jdbcTemplate.query("SELECT id, nama, jenis_kelamin, alamat, created_time FROM public.customer", new CustomerMapper());
    }
}
