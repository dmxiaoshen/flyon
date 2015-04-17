
package com.hsg.flyon.web.user.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsg.flyon.base.page.Page;
import com.hsg.flyon.common.user.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
    @Autowired
    private UserService userService;
    
    @RequestMapping(value="/list")
    public String userListPage(){
        return "/user/list";
    }
    
    @RequestMapping(value="/list/query")
    @ResponseBody
    public Object userListData(Page page){
        return userService.findPagination(page);
    }

}
