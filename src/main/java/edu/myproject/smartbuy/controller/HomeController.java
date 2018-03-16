package edu.myproject.smartbuy.controller;

import edu.myproject.smartbuy.model.Product;
import edu.myproject.smartbuy.model.User;
import edu.myproject.smartbuy.repository.ProductRepository;
import edu.myproject.smartbuy.service.ProductService;
import edu.myproject.smartbuy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(value="/admin/afterlogin", method = RequestMethod.GET)
    public ModelAndView afterlogin(){
        List<Product> products = productRepository.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("products", products);
        modelAndView.setViewName("admin/afterlogin");
        return modelAndView;
    }


}
