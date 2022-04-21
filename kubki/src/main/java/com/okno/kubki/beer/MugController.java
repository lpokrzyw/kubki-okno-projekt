package com.okno.kubki.beer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MugController {

    @Autowired
    private MugRepository mugRepository;

    public double retrieveMugPrice(int id) {
        return mugRepository.findById(id).getPrice();
    }

    @GetMapping(path ="/mugs")
    public String mugsPage() {
        return "mugs";
    }
}
