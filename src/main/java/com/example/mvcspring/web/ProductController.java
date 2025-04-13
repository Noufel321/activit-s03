package com.example.mvcspring.web;

import org.springframework.ui.Model;
import com.example.mvcspring.entities.Product;
import com.example.mvcspring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/index")
    public String index(Model model) {
        List<Product> products = productRepository.findAll();
        model.addAttribute("ListProduct", products);
        return "products";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(name = "id") Long id) {
        productRepository.deleteById(id);
        return "redirect:index";
    }


    }

