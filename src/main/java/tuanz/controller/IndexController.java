package tuanz.controller;

import core.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Yxm on 2017/10/12.
 */
@Controller
public class IndexController extends BaseController {
    @RequestMapping(value = {"","/","/index"})
    public String index(HttpServletRequest request, HttpServletResponse response, Model model){
        return "index";
    }
}
