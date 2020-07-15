package mysql_trail1;

import java.sql.*;
public class mysql_con {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");  
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/virtusa","root","premsai2030");
		/*if (connection != null) {
			System.out.println("succesfully connected");
		}*/
		String query="SELECT* FROM virtusa_data";
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery(query);
		while(resultSet.next()) {
			int id=resultSet.getInt("id");
			String nameString=resultSet.getString("name");
			String numberString=resultSet.getString("number");
			System.out.println(id+"  "+nameString+"   "+numberString);
		}
	}
}
