package ua.malysh.service;

import ua.malysh.domain.DayStatistics;
import ua.malysh.dto.ProductDTO;
import ua.malysh.dto.RecipeDTO;

public interface DayStatisticsService {

    DayStatistics getDayStatistics();

    DayStatistics addMeal(RecipeDTO recipeDTO);

    DayStatistics addMeal(ProductDTO productDTO);

    DayStatistics addWater(Double measure);

}
