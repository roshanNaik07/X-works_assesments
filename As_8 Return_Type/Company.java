class Company{
	static String ownerName(String companyName){
		if(companyName=="Tesla"){
			return "Elon";
		}
		else if(companyName=="Apple"){
			return "Steve Jobs";
		}
		else if(companyName=="SONY"){
			return "Masaru Ibuka";
		}
		else if(companyName=="Ford"){
			return "Henry Ford";
		}
		else if(companyName=="Dell"){
			return "Michael Dell";
		}
		else if(companyName=="Adidas"){
			return "Adolf Dassler";
		}
		else if(companyName=="Intel"){
			return "Robert Noyce";
		}
		else if(companyName=="Nike"){
			return "Phil Knight ";
		}
		else if(companyName=="HP"){
			return " Bill Hewlett ";
		}
		else if(companyName=="Zara"){
			return "Amancio Ortega";
		}
		else if(companyName=="Bose "){
			return "Amar Bose ";
		}
		else if(companyName=="Honda "){
			return "Soichiro Honda";
		}
		return "Does'nt_exist";
	}
}