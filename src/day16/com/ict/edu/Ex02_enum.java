package day16.com.ict.edu;

enum Type{
	WALKING, RUNNUNG, TRACKING, HIKING
}

public class Ex02_enum {
	String name;
	int size;
	Type type;

	public static void main(String[] args) {
		Ex02_enum shose = new Ex02_enum();
		shose.name="나이키";
		shose.size =270;
		shose.type =Type.RUNNUNG;
		
		System.out.println("신발이름 :" +shose.name);
		System.out.println("신발사이즈 :" +shose.size);
		System.out.println("신발종류 :" +shose.type);

	}

}
