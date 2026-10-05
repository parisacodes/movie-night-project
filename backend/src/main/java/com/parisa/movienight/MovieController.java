package com.parisa.movienight;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
@CrossOrigin(origins = "http://localhost:5174")
public class MovieController {
    @GetMapping
    public List<Movie> getMovies() {
        return List.of(
                new Movie("Arrival", 2016, "Sci-Fi"),
                new Movie("The Royal Tenenbaums", 2001, "Comedy"),
                new Movie("Pan's Labyrinth", 2006, "Fantasy")
        );
    }
}
