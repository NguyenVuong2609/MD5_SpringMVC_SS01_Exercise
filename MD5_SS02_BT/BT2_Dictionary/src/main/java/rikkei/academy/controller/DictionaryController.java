package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DictionaryController {
    private static List<String> wordList = new ArrayList<>();

    static {
        wordList.add("hello");
        wordList.add("sorry");
        wordList.add("bye");
        wordList.add("van");
    }

    @GetMapping("/translate")
    public String translate(@RequestParam String word, Model model) {
        String result = "";
        for (String str : wordList) {
            if (str.equals(word)){
                result = str;
            }
        }
        switch (result) {
            case "hello":
                model.addAttribute("result", "Xin chao");
                break;
            case "sorry":
                model.addAttribute("result", "Xin loi");
                break;
            case "bye":
                model.addAttribute("result", "Tam biet");
                break;
            case "van":
                model.addAttribute("result", "Ha^m hap'");
                break;
            default:
                model.addAttribute("result", "Khong tim thay");
        }
        return "translate";
    }
}
