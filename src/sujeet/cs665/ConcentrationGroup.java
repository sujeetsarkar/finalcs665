package sujeet.cs665;

import java.util.ArrayList;
import java.util.List;

public class ConcentrationGroup implements Concentration {
    private String name;
    private String description;
    private List<ConcentrationGroup> concentrations;

    public ConcentrationGroup(String name, String description) {
        this.name = name;
        this.description = description;
        concentrations = new ArrayList<>();
    }

    public void addConcentration(ConcentrationGroup concentration) {
        concentrations.add(concentration);
    }

    public void removeConcentration(ConcentrationGroup concentration) {
        concentrations.remove(concentration);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String format() {
        String result = "<h2>" + name + "</h2>" + "<p>" + description + "</p>";
        for (Concentration concentration : concentrations) {
            result += concentration.format();
        }
        return result;
    }
}
