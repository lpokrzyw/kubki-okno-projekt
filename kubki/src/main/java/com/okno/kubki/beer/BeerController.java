package com.okno.kubki.beer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BeerController {

    @GetMapping("/beer")
    public String home() {
        return "beer";
    }
}
