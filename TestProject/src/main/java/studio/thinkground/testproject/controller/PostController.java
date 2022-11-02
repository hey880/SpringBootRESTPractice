package studio.thinkground.testproject.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dto.MemberDTO;

@RestController
public class PostController {
    @PostMapping(value="/postAnything")
    public String val (@RequestBody Map<String, Object> map) {
        return "srt";
    }

    @PostMapping(value="/postDto")
    public String member (@RequestBody MemberDTO memberDTO) {
        return "srt";
    }
}
