
package com.hsg.flyon.web.home.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hsg.flyon.common.user.entity.User;
import com.hsg.flyon.common.user.service.UserService;

@Controller
@RequestMapping(value="/home")
public class HomeController {
    
    @Autowired
    private UserService userService;
    
    @RequestMapping(value="/index")
    public String index(ModelMap model){
        User u = userService.findById(1L);
        model.put("user",u );
        return "/home/index";
    }

}
