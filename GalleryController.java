package com.galleryapp.galleryapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller  //tells spring mvc that gallerycontroller is a controller
public class GalleryController {
    @RequestMapping(value = "/list")    //which url we need to access // "/" denotes home directory
  //  @RequestMapping(value = "/")
  // @ResponseBody  //response of url
//    public String listOfImages(){
//        return  "list of Images";
//    }
       public String homePage(){
        return "home"; //home.html
    }

}
