package com.zad2.zad2;

import java.util.concurrent.atomic.AtomicLong;

import com.zad2.zad2.Content;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentController {

    /**
     * Method gets string from value and returns new Content class.
     * @param someString
     * @return New Content class in JSON form.
     */

    @RequestMapping("/content/{someString}")
    public Content greeting(@PathVariable String someString) {
        return new Content(someString);
    }
}