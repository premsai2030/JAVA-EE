package insert.operation.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.concurrent.ThreadLocalRandom;

import com.mysql.jdbc.Connection;

import insert.operation.modal.Modal;



public class Dao {
	String url="jdbc:mysql://localhost:3306/virtusa?useSSL=false";
	String dbusername="root";
	String dbpass="premsai2030";
	
	public int ok(Modal modal) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=(Connection) DriverManager.getConnection(url,dbusername,dbpass);
        int rand_int2 = ThreadLocalRandom.current().nextInt(); 

		PreparedStatement statement=connection.prepareStatement("INSERT INTO local_payments(Customer_ID,Source_account_number,Target_account_number,Amount_Base_Currency,status,reference_number) VALUES(?,?,?,?,?,?)");
		statement.setString(1,modal.getCustomer_id());
		statement.setString(2,modal.getAccount_number());
		statement.setString(3,modal.getTarget_account_number());
		statement.setString(4,modal.getAmount());
		statement.setString(5,"done");
		statement.setInt(6,Math.abs(rand_int2));
		
		int success=statement.executeUpdate();
		return success;
		
	}
	

	
	
}
