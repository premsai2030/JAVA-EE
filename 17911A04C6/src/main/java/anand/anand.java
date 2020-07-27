package anand;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class anand {

	@Autowired
	private databse database_connection;
	
	@PostMapping("/sending_data")
	public String ok(model_class model_class_obj,Model model ) throws ClassNotFoundException, SQLException {
		if(database_connection.data_keep(model_class_obj)==1) {
			return "complete";
		}
		else {
			return "";
		}
		
		
	}
	
}
