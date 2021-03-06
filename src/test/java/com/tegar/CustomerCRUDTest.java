package com.tegar;

import com.tegar.config.AppConfig;
import com.tegar.dao.CustomerDao;
import com.tegar.pojo.Customer;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CustomerCRUDTest {

    @Autowired
    private CustomerDao customerDao;

    private static Customer customer;
    private static List<Customer> customerList;

    @BeforeClass
    public static void init (){
        customer = new Customer();
        customerList = new ArrayList<>();
    }

    @Test
    public void test1_Create() {
        Date dateNow = new Date(new java.util.Date().getTime());

        Customer customer = new Customer();
        customer.setNama("Abdi");
        customer.setJenisKelamin("L");
        customer.setAlamat("Jln Ikan Belanak 2");
        customer.setCreated_time(dateNow);

        int rekam = customerDao.create(customer);
        assertEquals(1, rekam);
    }
}
