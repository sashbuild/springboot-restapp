package com.sash.springbootrestapp;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/")
public class SquareController
{

    @GetMapping(path = "/square/{number}",
    produces = MediaType.APPLICATION_JSON_VALUE)
    public Square calculateSquare(@PathVariable("number") int number) {
        return new Square(number);
    }
}
