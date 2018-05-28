package com.cts.java;
//incomplete program
//class name is not meaningful
public class SumOfDigitsToChar {
	public String intToChar(int i) {
		//int n=0;
		String str1[]= {"one","two","three","four","five","six","seven","eight","nine","ten"};
		String str2[]= {"eleven","twelve","thirteen","fouteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
		String str3[]= {"twentyone","twentytwo","twentythree","twentyfour","twentyfive","twentysix","twentyseven","twentyeight","twentynine","twentynine"};
		//String str2[]= {"eleven","twelve","thirteen","fouteen","","","","","",""};
		//String str2[]= {"eleven","twelve","thirteen","fouteen","","","","","",""};
		//String str2[]= {"eleven","twelve","thirteen","fouteen","","","","","",""};
		//String str2[]= {"eleven","twelve","thirteen","fouteen","","","","","",""};
		//String str2[]= {"eleven","twelve","thirteen","fouteen","","","","","",""};
		//String str2[]= {"eleven","twelve","thirteen","fouteen","","","","","",""};
		String str4[]= {"ninetyone","nintytwo","nintythree","nintyfour","nintyfive","nintysix","nintyseven","nintyeight","nintynine","hundred"};
	if(i>1 && i<=10) {
		return "str1";

		}
	if(i>11 && i<=20) {
		return "str2";
	}
	if(i>21 && i<=30) {
		return "str3";

		}
	if(i>90 && i<=100) {
		return "str4";

		}
		
		
		
		
		
		
		return null;
		
		
	}

}
