package com.example.cmltdstudent.inclassassignment08_ningelb;

/**
 * Created by cmltdstudent on 3/27/17.
 */

public class Food {

    private String foodName;
    private int calories;
    private boolean healthy;

    public Food () { }

    public Food(String foodName, int calories, boolean healthy) {
        this.foodName = foodName;
        this.calories = calories;
        this.healthy = healthy;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    @Override
    public String toString() {
        return "Food: "+ foodName + "\n" +
                "Calories: " + calories + "\n"  +
        "Healthy? " + healthy + "\n" ;
    }
}
