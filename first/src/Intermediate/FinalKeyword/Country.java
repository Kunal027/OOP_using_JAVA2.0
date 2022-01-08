package Intermediate.FinalKeyword;

import javax.lang.model.element.Name;

public class Country {

    private final String name;
    private int population;
    private int capital;


    public Country(String name, int population, int capital) {
        this.name = name;
        this.population = population;
        this.capital = capital;
    }

    public final void populationChange(int change){
        population += change;
    }
}
