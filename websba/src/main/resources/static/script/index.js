function submitForm() {


	var message = "Does this look good to you ?";
	var inputs = document.getElementsByTagName('input');

	for (var i = 0; i < inputs.length; i++) {
		if (inputs[i].type.toLowerCase() == 'text' || inputs[i].type.toLowerCase() == 'email' || inputs[i].type.toLowerCase() == 'date'){
			message = message + '\n' + inputs[i].value;
		}
	}

	if (!confirm(message)) {
		return false;
	}

	this.form.submit();
}



function validateEmail(email) {
	var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
	return re.test(email);
}
