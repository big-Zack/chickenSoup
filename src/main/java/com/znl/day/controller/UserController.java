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

    @RequestMapping("")
    public String login(Model model) {
        model.addAttribute("good_good_study", "假期定了个Plan，半个暑假结束了只完成了P，因为lan。");
        return "html/index.html";
    }
}
