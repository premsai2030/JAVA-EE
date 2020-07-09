package prem.sai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("first")
public class first {
String name,numberString,section;
// as it is implementing two classes such as third and fourth so it can inject object into interface1 (value)
@Autowired
//so we are using @qualifier anntation to specify which class object has to be injected into interface1(value1)
@Qualifier("three")
Interface interface1;
@Value("${first.name}")
public void setName(String name) {
	this.name = name;
}
@Value("${first.number}")

public void setNumberString(String numberString) {
	this.numberString = numberString;
}
@Value("${first.section}")

public void setSection(String section) {
	this.section = section;
}

public void display() {
	System.out.println("the name of the person is :"+name);
	System.out.println("and his roll number is :"+numberString);
	System.out.println("belongs to section :"+section);
	interface1.generate();
	interface1.connecting();
}


}
