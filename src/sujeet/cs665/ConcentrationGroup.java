package sujeet.cs665;

import java.util.ArrayList;
import java.util.List;


public class ConcentrationGroup implements Concentration, Course {
    private String name;
    private String description;
	private List<Concentration> subConcentrations;
	private List<Concentration> concentrations;

    public ConcentrationGroup(String name, String description) {
        this.name = name;
        this.description = description;
        concentrations = new ArrayList<>();
        subConcentrations = new ArrayList<>();
    }

    public void addConcentration(Concentration concentration) {
        concentrations.add(concentration);
    }

    public void removeConcentration(Concentration concentration) {
        concentrations.remove(concentration);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    /**
	 * @return the subConcentrations
	 */
	public List<Concentration> getSubConcentrations() {
		return subConcentrations;
	}

	/**
	 * @param subConcentrations the subConcentrations to set
	 */
	public void setSubConcentrations(List<Concentration> subConcentrations) {
		this.subConcentrations = subConcentrations;
	}

    public String format() {
        String result = "<h2>" + name + "</h2>" + "<p>" + description + "</p>";
        for (Concentration concentration : concentrations) {
            result += concentration.format();
        }
        return result;
    }

	@Override
	public String getSyllabus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFormattedContent() {
		String result = "<h2>" + name + "</h2>" + "<p>" + description + "</p>";
        for (Concentration concentration : concentrations) {
            result += concentration.format();
        }
        return result;
	}
}
