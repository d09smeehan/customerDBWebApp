function customerList(){
	document.write("GOT HERE");
	$.ajax({
		url : '/all',
		type : 'GET'
		datatype : 'json'
		success : function(customerData){
			createCustomerTable(customerData);
		},
		error : function(request, message, error) {
            handleException(request, message, error);
        }
    });
}

function createCustomerTable(customerData){
	$.each(customerData, function(i, customer){
		tableAddRow(customer);
	})
}

function tableAddRow(customer){
	if($("#customerTable tbody").length == 0){
		$("'customerTable").append("<tbody></tbody>");
	}
	$("#customerTable tbody").append(buildTableRow(customer)
}

function{
	var row = "<tr>" + "<td>" + customer.fullName + "</td>" + "<td>" +customer.addressLine1
            + "</td>" + "<td>" + customer.addressLine2 + "</td>" + "<td>" + customer.addressLine3
            + "</td>" + "<td>" + customer.city + "</td>" + "<td>" + customer.country"+</td> 
            + "<td>" + customer.phoneNumber + "</td>" + </tr>";
            
    return row;
}

function handleException(request, message, error) {

    var msg = "";
    msg += "Code: " + request.status + "\n";
    msg += "Text: " + request.statusText + "\n";
    if (request.responseJSON != null) {
        msg += "Message" + request.responseJSON.Message + "\n";
    }
    alert(msg);
 }