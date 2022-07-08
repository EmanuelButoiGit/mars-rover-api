package com.mars.rover.controllers;

import com.mars.rover.responses.ApiResponseRover;
import com.mars.rover.services.MarsRoverApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

@Controller
@RequestMapping("/api/v1/home")
public class HomeController {
    @Autowired
    private MarsRoverApiService roverService;

    @GetMapping
    public String getHomeModel(ModelMap model, @RequestParam(required=false) String marsApiRoverData){
        model.addAttribute("name", "Emanuel"); //or model.put()

        // if request param is empty, then set a default value
        if (StringUtils.isEmpty(marsApiRoverData)) {
            marsApiRoverData = "Curiosity";
        }

        ApiResponseRover roverData = roverService.getRoverData(marsApiRoverData); //curiosity, opportunity, spirit
        model.addAttribute("roverData", roverData);

        return "model";
    }

    @GetMapping("indexTest")
    public String getHomePage(){
        return "index";
    }

}
