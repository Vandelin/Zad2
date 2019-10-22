package com.zad2.zad2;

import java.util.concurrent.atomic.AtomicLong;

import com.zad2.zad2.Content;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentController {

    /**
     * Method gets string from value and returns new Content class.
     * @param string
     * @return New Content class in JSON form.
     */

    @RequestMapping("/content")
    public Content greeting(@RequestParam(value="string", defaultValue="reverse") String string) {
        return new Content(string);
    }
}