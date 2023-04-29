package sujeet.cs665;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class ConcentrationGroup implements Concentration, Course {
    private String name;
    private String description;
	private List<Concentration> subConcentrations;
	private List<Concentration> concentrations;
	private Department department;

    public ConcentrationGroup(String name, String description, Department department) {
        this.name = name;
        this.description = description;
        this.department = department;
        concentrations = new ArrayList<>();
        subConcentrations = new ArrayList<>();
    }
    
    public Department getDepartment() {
    	return department;
    }

    public void addConcentration(Concentration concentration) {
        concentrations.add(concentration);
    }

    public void removeConcentration(Concentration concentration) {
        concentrations.remove(concentration);
    }

    public String getTitle() {
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
        String result = name + description;
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
		String result =  name + description;
        for (Concentration concentration : concentrations) {
            result += concentration.format();
        }
        return result;
	}
    public int getMaxEnrollmentLimit() {
    	throw new NoSuchElementException();
    }
}
