package insert.operation.modal;

public class Modal {
String customer_id,account_number,target_account_number,amount;

public Modal(String customer_id, String account_number, String target_account_number, String amount) {
	this.customer_id = customer_id;
	this.account_number = account_number;
	this.target_account_number = target_account_number;
	this.amount = amount;
}

public String getCustomer_id() {
	return customer_id;
}

public String getAccount_number() {
	return account_number;
}

public String getTarget_account_number() {
	return target_account_number;
}

public String getAmount() {
	return amount;
}



}
