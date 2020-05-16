package interfaces;

import lombok.Getter;


public class Vodka implements Drinkable {
    private String name;
    private double size;
    private String country;
    private String form;

    @Override
    public void drinkTooMuch() {
        System.out.println("Попробуй нырнуть в прорубь");
    }

    public Vodka(String name) {
        this.name = name;
    }

    public Vodka(String name, double size, String country, String form) {
        this.name = name;
        this.size = size;
        this.country = country;
        this.form = form;
    }

    public Vodka(String name, String form) {
        this.name = name;
        this.form = form;
    }

    public Vodka(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }
}
