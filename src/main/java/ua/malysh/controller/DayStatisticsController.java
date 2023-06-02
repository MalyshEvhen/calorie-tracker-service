package ua.malysh.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import ua.malysh.domain.DayStatistics;
import ua.malysh.dto.ProductDTO;
import ua.malysh.dto.RecipeDTO;
import ua.malysh.service.DayStatisticsService;

@RestController
@RequestMapping("/api/v1/day-statistics")
@RequiredArgsConstructor
public class DayStatisticsController {
    private final DayStatisticsService service;

    @GetMapping
    public ResponseEntity<DayStatistics> getDayStatistics() {
        return new ResponseEntity<>(service.getDayStatistics(), HttpStatus.OK);
    }

    @PutMapping("/add/recipe")
    public ResponseEntity<DayStatistics> addRecipe(@RequestBody RecipeDTO recipeDTO) {
        return new ResponseEntity<>(service.addMeal(recipeDTO), HttpStatus.OK);
    }

    @PutMapping("/add/product")
    public ResponseEntity<DayStatistics> addProduct(@RequestBody ProductDTO productDTO) {
        return new ResponseEntity<>(service.addMeal(productDTO), HttpStatus.OK);
    }

    @PutMapping("/add/water")
    public ResponseEntity<DayStatistics> addWater(@RequestParam Double measure) {
        return new ResponseEntity<>(service.addWater(measure), HttpStatus.OK);
    }
}
