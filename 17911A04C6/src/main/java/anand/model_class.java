package anand;

public class model_class {
String name,section,roll_number;

public model_class(String name, String section, String roll_number) {
	this.name = name;
	this.section = section;
	this.roll_number = roll_number;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSection() {
	return section;
}

public void setSection(String section) {
	this.section = section;
}

public String getRoll_number() {
	return roll_number;
}

public void setRoll_number(String roll_number) {
	this.roll_number = roll_number;
}

@Override
public String toString() {
	return "model_class [name=" + name + ", section=" + section + ", roll_number=" + roll_number + "]";
}

	
	

}
