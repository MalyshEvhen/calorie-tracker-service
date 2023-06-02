package ua.malysh.dto;

import java.util.List;

public record RecipeDTO(String name, List<IngredientDTO> ingredients) {
}
