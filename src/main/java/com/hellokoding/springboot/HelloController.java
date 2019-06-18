package com.hellokoding.springboot;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "hello";
    }
    
    @RequestMapping("/imperial_msc_thesis")
    public String imperialDiploma (Model model){
    	//"/documents/pdf/Ivan_Avanessov_Imperial_MSc_Final.pdf"
    	model.addAttribute("filename", "/documents/pdf/Ivan_Avanessov_Imperial_MSc_Final.pdf");
    	model.addAttribute("title", "My Thesis");
    	return "documents/pdfTemplate";
    }
    
    @RequestMapping("/cv")
    public String myCV (Model model, HttpServletRequest request){
    	//"/documents/pdf/Ivan_Avanessov_Imperial_MSc_Final.pdf"
    	model.addAttribute("filename", "/documents/pdf/Ivan_Avanessov_CV_Rus.pdf");
    	model.addAttribute("title", "My CV");
    	SmsSendingHelper.sendSMS("RUS CV was viewed from " + request.getRemoteAddr());
    	return "documents/pdfTemplate";
    }
    
    @RequestMapping("/cv/eng")
    public String myCVeng (Model model, HttpServletRequest request){
    	//"/documents/pdf/Ivan_Avanessov_Imperial_MSc_Final.pdf"
    	model.addAttribute("filename", "/documents/pdf/Ivan_Avanessov_CV_Eng.pdf");
    	model.addAttribute("title", "My CV");
    	SmsSendingHelper.sendSMS("ENG CV was viewed from " + request.getRemoteAddr());
    	return "documents/pdfTemplate";
    }
    @RequestMapping("/hello/{hujaba}")
    public String readVar(HttpServletRequest request) {
    	System.out.println("11");

    	return "hello";
    }
    @RequestMapping("/colorGames")
    public String colorGame(HttpServletRequest request) {
    	System.out.println("11");

    	return "/colorGame/index.html";
    }
    
    
    
}
