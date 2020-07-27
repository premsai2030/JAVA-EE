package anand;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

@Component
public class databse {

	static String url="jdbc:mysql://localhost:3306/virtusa";
	static String dbusername="root";
	static String dbpass="premsai2030";
	public int data_keep(model_class model_class_data) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection(url,dbusername,dbpass);
		
		PreparedStatement statement=connection.prepareStatement("INSERT INTO users(name,section,roll_number) VALUES(?,?,?)");
		statement.setString(1,model_class_data.name);
		statement.setString(2,model_class_data.section);
		statement.setString(3,model_class_data.roll_number);
int success=statement.executeUpdate();
return success;
		
	}
	
	
	
}
