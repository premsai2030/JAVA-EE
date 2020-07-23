package dfwrete.vittal2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class model {

	@Id
	int id;
	@Column(name = "name")
	String namString;
	public model(int id, String namString) {
		super();
		this.id = id;
		this.namString = namString;
	}
	public model() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNamString() {
		return namString;
	}
	public void setNamString(String namString) {
		this.namString = namString;
	}
	@Override
	public String toString() {
		return "model [id=" + id + ", namString=" + namString + "]";
	}
	
	
}
