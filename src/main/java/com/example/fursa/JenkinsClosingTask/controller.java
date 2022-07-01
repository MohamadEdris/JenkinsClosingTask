package com.example.fursa.JenkinsClosingTask;

import com.example.fursa.JenkinsClosingTask.Table;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;


@RestController
public class controller {

    @RequestMapping
    public ModelAndView table(Model model) throws IOException {
        Table table = new Table("http://www.ynet.co.il/Integration/StoryRss2.xml");

        model.addAttribute("content",table.getTable());

        ModelAndView modelAndView = new ModelAndView(); // building Model And View Table
        modelAndView.setViewName("table");
        return modelAndView;
    }
}