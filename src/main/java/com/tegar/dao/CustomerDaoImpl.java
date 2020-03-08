package com.tegar.dao;

import com.tegar.pojo.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao {
    @Override
    public int create(Customer objectType) {
        return 0;
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
