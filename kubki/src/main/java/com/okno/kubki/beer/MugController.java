package com.okno.kubki.beer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/mugs")
@SessionAttributes("order")
public class MugController {

    @Autowired
    private MugRepository mugRepository;

    public Mug retrieveMug(int id) {
        return mugRepository.findMugById(id);
    }

    @GetMapping
    public String showMugsPage() {
        return "mugs";
    }

    @PostMapping
    public void addToCart() {

    }
}
