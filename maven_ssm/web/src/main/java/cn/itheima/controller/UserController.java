package cn.itheima.controller;

import cn.itheima.domain.User;
import cn.itheima.service.UserService;
import cn.itheima.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping("/findAll")
    public String findAll(Model model,int id){
        System.out.println(id);
        User all = service.findAll(id);
        model.addAttribute("user",all);
        return "list";
    }
}
