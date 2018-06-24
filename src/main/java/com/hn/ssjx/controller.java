package com.hn.ssjx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by liuyi on 18/6/24.
 */
@RequestMapping("home")
@Controller
public class controller {

    @RequestMapping("index")
    public ModelAndView index() {
        return new ModelAndView("homepage");
    }
}
