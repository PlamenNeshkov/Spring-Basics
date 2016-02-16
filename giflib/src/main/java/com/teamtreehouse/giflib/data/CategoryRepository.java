package com.teamtreehouse.giflib.data;

import com.teamtreehouse.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by plamen on 2/16/16.
 */
@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(0, "Gaming"),
            new Category(1, "Music"),
            new Category(2, "Sports")
    );

    public List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }

    public Category findById(int id) {
        for (Category category : ALL_CATEGORIES) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }
}
