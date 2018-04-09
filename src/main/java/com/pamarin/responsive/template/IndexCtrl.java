/*
 * Copyright 2018 Pamarin.com
 */
package com.pamarin.responsive.template;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jittagornp &lt;http://jittagornp.me&gt; create : 2018/04/09
 */
@Controller
public class IndexCtrl {

    @GetMapping({"", "/"})
    public String getIndex() {
        return "index";
    }

}
