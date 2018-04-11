/*
 * Copyright 2018 Pamarin.com
 */
package com.pamarin.responsive.template;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jittagornp &lt;http://jittagornp.me&gt; create : 2018/04/09
 */
@Controller
public class IndexCtrl {

    @GetMapping({"", "/"})
    public ModelAndView getIndex(@RequestParam(value = "page", required = false, defaultValue = "index") String page) {
        ModelAndView mav = new ModelAndView("template");
        mav.addObject("container", page);
        return mav;
    }

}
