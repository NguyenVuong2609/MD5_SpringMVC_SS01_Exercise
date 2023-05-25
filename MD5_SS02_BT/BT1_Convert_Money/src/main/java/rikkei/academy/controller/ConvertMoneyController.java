package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertMoneyController {
    @GetMapping("/convert")
    public String convert(@RequestParam double money, Model model){
        double VND = money * 23000;
        model.addAttribute("result", VND);
        return "convert";
    }
}
