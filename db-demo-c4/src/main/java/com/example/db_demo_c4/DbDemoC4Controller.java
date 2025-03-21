package com.example.db_demo_c4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DbDemoC4Controller {
    @RequestMapping("/")
    String index(){
        return "index";//resources/templateフォルダのindex.htmlを編集して返す
    }
}
