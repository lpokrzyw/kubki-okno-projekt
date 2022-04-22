package com.okno.kubki.beer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/mugs")
@SessionAttributes("order")
public class MugController {

    @GetMapping
    public String showMugsPage() {
        return "mugs";
    }
}
