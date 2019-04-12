package com.ypc.springbootrediszhujie.handler;

import com.ypc.springbootrediszhujie.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author YPC
 * @create 2019 02 18 11:43
 */
@Controller
public class StudentHandler {
    @Resource
    private StudentService ss;
    @RequestMapping("/")
    public String findAll(Model model){
        long startime=System.currentTimeMillis();
        model.addAttribute("list",ss.findAll());
        long time=System.currentTimeMillis()-startime;
        System.out.println("time = " + time);
        return "findAll";
    }
    @RequestMapping("/delete")
    public String delete(int id){
        boolean delete = ss.delete(id);
        System.out.println("delete = " + delete);
        return "redirect:/";
    }
}
