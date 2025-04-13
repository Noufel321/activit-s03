package com.example.mvcspring;

import com.example.mvcspring.entities.Product;
import com.example.mvcspring.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MvcSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvcSpringApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return  args -> {

            productRepository.save(Product.builder()
                    .name("Computer")
                    .price(5400)
                    .quantity(50)
                    .build());
            productRepository.save(Product.builder()
                            .name("Printer")
                            .price(49000)
                            .quantity(44)
                            .build());
            productRepository.save(Product.builder()
                    .name("Smart phone")
                    .price(1220)
                    .quantity(20)
                    .build());

            productRepository.findAll().forEach(p ->{System.out.println(p.toString());});


            //productRepository.save(new Product(null,"Computer",5000,11));

        };

}}
