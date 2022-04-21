package com.okno.kubki.beer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private MugRepository mugRepository;

    public Mug retrieveMug(int id) {
        return mugRepository.findById(id);
    }

    @GetMapping(path = "/test/{id}")
    public double test(@PathVariable int id) {
        return retrieveMug(id).getPrice();
    }
}
