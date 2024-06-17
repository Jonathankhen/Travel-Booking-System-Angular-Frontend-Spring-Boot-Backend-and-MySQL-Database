package com.example.demo.bootstrap;

import com.example.demo.entities.Country;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Division;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class BootStrapData implements CommandLineRunner {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        // Only add sample data if the customer count is 1 (based on given SQL script)
        long customerCount = ((Number) entityManager.createQuery("SELECT COUNT(c) FROM Customer c").getSingleResult()).longValue();
        if (customerCount == 1) {
            // Create and save new countries
            Country country1 = new Country();
            country1.setCountryName("Country 1");
            entityManager.persist(country1);

            Country country2 = new Country();
            country2.setCountryName("Country 2");
            entityManager.persist(country2);

            Country country3 = new Country();
            country3.setCountryName("Country 3");
            entityManager.persist(country3);

            Country country4 = new Country();
            country4.setCountryName("Country 4");
            entityManager.persist(country4);

            Country country5 = new Country();
            country5.setCountryName("Country 5");
            entityManager.persist(country5);

            // Create and save new divisions
            Division division1 = new Division();
            division1.setDivision_name("Division 1");
            division1.setCountry(country1);
            entityManager.persist(division1);

            Division division2 = new Division();
            division2.setDivision_name("Division 2");
            division2.setCountry(country2);
            entityManager.persist(division2);

            Division division3 = new Division();
            division3.setDivision_name("Division 3");
            division3.setCountry(country3);
            entityManager.persist(division3);

            Division division4 = new Division();
            division4.setDivision_name("Division 4");
            division4.setCountry(country4);
            entityManager.persist(division4);

            Division division5 = new Division();
            division5.setDivision_name("Division 5");
            division5.setCountry(country5);
            entityManager.persist(division5);

            // Create and save new customers
            Customer customer1 = new Customer("Alice", "Smith", "123 Elm St", "11111", "111-111-1111", division1);
            Customer customer2 = new Customer("Bob", "Johnson", "456 Oak St", "22222", "222-222-2222", division2);
            Customer customer3 = new Customer("Charlie", "Brown", "789 Pine St", "33333", "333-333-3333", division3);
            Customer customer4 = new Customer("Daisy", "Miller", "101 Maple St", "44444", "444-444-4444", division4);
            Customer customer5 = new Customer("Ethan", "Davis", "202 Birch St", "55555", "555-555-5555", division5);

            entityManager.persist(customer1);
            entityManager.persist(customer2);
            entityManager.persist(customer3);
            entityManager.persist(customer4);
            entityManager.persist(customer5);
        }
    }
}
