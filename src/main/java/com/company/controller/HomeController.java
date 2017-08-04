package com.controller;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class HomeController {

    @RequestMapping(value={"/","getweatherjson"})

    public ModelAndView helloWorld() // gets a webpage using the ModelandView method
    {
        return new // useful for adding one or two things to a page the model is the data
                ModelAndView("welcome", "message", "Hello World");

    }


}