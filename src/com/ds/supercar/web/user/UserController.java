package com.ds.supercar.web.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller(" / ")
public class UserController {
    @RenderMapping("/signupUser")
    public ModelAndView createUser(@PathVariable("id")int id)throws Exception{

        return null;
    }
}
