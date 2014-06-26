package net.therap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: shakhawat.hossain
 * Date: 6/26/14
 * Time: 9:48 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class FileController {

    @RequestMapping (value = "/project/uploadFile", method = RequestMethod.POST)
    public String uploadFileHandler(@RequestParam ("file") MultipartFile file, ModelMap modelMap) {
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                String rootPath = System.getProperty("catalina.home");
                File dir = new File(rootPath + File.separator + "tmpFiles");
                if (!dir.exists())
                    dir.mkdirs();

                File fileInServer = new File(dir.getAbsolutePath()
                        + File.separator + file.getOriginalFilename());
                BufferedOutputStream stream = new BufferedOutputStream(
                        new FileOutputStream(fileInServer));
                stream.write(bytes);
                stream.close();

                modelMap.addAttribute("message", "file successfully uploaded");
                return "project/fileUploadSuccess";
            } catch (Exception e) {
                modelMap.addAttribute("message", "fileupload failed");
                return "project/fileUploadSuccess";
            }
        } else {
            modelMap.addAttribute("message", "fileupload failed");
            return "project/fileUploadSuccess";
        }
    }
}
