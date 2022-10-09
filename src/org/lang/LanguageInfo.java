package org.lang;

public class LanguageInfo {
	public void tamilLanguage() {
		LanguageInfo b = new LanguageInfo();
		System.out.println("tamil");
	}
	public void englishLanguage() {
		LanguageInfo n = new LanguageInfo();
		System.out.println("english");
	}
	public void hindiLanguage() {
		LanguageInfo k =new LanguageInfo();
		System.out.println("hindi theriyathu poda");
	}
	public static void main(String[] args) {
		LanguageInfo art = new LanguageInfo();
		art.tamilLanguage();
		art.englishLanguage();
		art.hindiLanguage();
	}

}
