package edu.myproject.smartbuy.controller;

import edu.myproject.smartbuy.model.User;
import edu.myproject.smartbuy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
@Controller
public class afterLoginController {
    @RequestMapping(value="/afterlogin", method = RequestMethod.GET)
    public ModelAndView afterlogin(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("afterlogin");
        return modelAndView;
    }
}
