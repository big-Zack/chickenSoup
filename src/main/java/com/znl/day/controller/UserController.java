package com.znl.day.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dell
 * @描述:
 * @文件名: HelloController.java
 * @创建人: zyhNick
 * @创建时间: 13:40 2021/3/11
 * @修改人:
 * @修改备注: Copyright  2021/3/11
 */
@Controller
public class UserController {

    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("good_good_study", "good good study,day day up");
        return "html/dayLogin";
    }
}
