package com.joeTest.controller;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
@RequestMapping("myUpload")
public class UploadController {

    private Logger logger= LoggerFactory.getLogger(UploadController.class);
    @RequestMapping(value = "/file" ,method = RequestMethod.POST)
    @ResponseBody
    public String upload(MultipartFile  file){
        try {
            FileUtils.writeByteArrayToFile(new File("F://log//test.js"), file.getBytes());
            logger.info("传输成功");
            return "ok";

        }catch (Exception e){
            logger.error(e.getMessage());
            return "error";
        }
    }

}
