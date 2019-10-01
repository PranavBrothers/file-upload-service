package com.pranav.bros;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/async")
public class AsyncController {
    
	@GetMapping("/")
    public String index() {
        return "upload/async";
    }
    
    @GetMapping("/initialFiles")
    @ResponseBody
    public List<FileBean> pay()  {
    	List<FileBean> fileBeans = new ArrayList<FileBean>();
    	fileBeans.add(new FileBean("raj", ".png", 135879));
    	fileBeans.add(new FileBean("ramesh", ".png", 135879));
		return fileBeans;
    }
    
    @PostMapping("/save")
    public @ResponseBody String save(@RequestParam List<MultipartFile> files) {
        // Save the files
        // for (MultipartFile file : files) {
        // }
        
        // Return an empty string to signify success
        return "";
    }
    
    @PostMapping("/remove")
    public @ResponseBody String remove(@RequestParam String[] fileNames) {
        // Remove the files
        // for (String fileName : fileNames) {
        // }
        // Return an empty string to signify success
        return "";
    }
}