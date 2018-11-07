package com.thinkpad.controller;

import com.thinkpad.model.Thing;
import com.thinkpad.service.ThingService;
import com.thinkpad.service.ThingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThingController {
    @Autowired
    private ThingService thingService;

    @GetMapping("/")
    public ModelAndView home() {
        return new ModelAndView("thing","thing", thingService.findById(1));
    }

}
