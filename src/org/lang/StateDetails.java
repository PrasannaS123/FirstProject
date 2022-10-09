package org.lang;

public class StateDetails extends LanguageInfo {
     public void southIndia() {
	StateDetails o =new StateDetails();
	System.out.println("chennai");
}
     public void northIndia() {
		StateDetails v =new StateDetails();
		System.out.println("jammu&kashmir");

	}
     public static void main(String[] args) {
		StateDetails web = new StateDetails();
		web.southIndia();
		web.northIndia();
		web.tamilLanguage();
		web.englishLanguage();
		web.hindiLanguage();
	}
}
