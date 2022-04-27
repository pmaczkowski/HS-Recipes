package com.recipes;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

    @PostMapping
    public class postRecipe(@RequestBody Recipe recipe) {
        
    }
}
