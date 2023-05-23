package day14.com.ict.edu3;

import day14.com.ict.edu2.DCa_Phone;
import day14.com.ict.edu2.MP3_Phone;

public class Main {
	public static void main(String[] args) {
		MP3_Phone mp3 =new MP3_Phone();
		mp3.call();
		mp3.sms();
		mp3.sound();
		System.out.println();
		
		DCa_Phone dca = new DCa_Phone();
		dca.call();
		dca.sms();
		dca.picture();
	}
}
