package ua.malysh.service.impl;

import java.time.LocalDate;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import ua.malysh.domain.ConsumedNutritions;
import ua.malysh.domain.DayStatistics;
import ua.malysh.dto.ProductDTO;
import ua.malysh.dto.RecipeDTO;
import ua.malysh.repository.DayStatisticsRepository;
import ua.malysh.service.DayStatisticsService;

@Service
@Transactional
@RequiredArgsConstructor
public class DayStatisticsServiceImpl implements DayStatisticsService {
    private final DayStatisticsRepository repository;

    @Override
    public DayStatistics getDayStatistics() {
        return repository.findByCreatedAt(LocalDate.now())
                .orElseThrow();
    }

    @Override
    public DayStatistics addMeal(RecipeDTO recipeDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addMeal'");
    }

    @Override
    public DayStatistics addMeal(ProductDTO productDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addMeal'");
    }

    @Override
    public DayStatistics addWater(Double measure) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addWater'");
    }

}
