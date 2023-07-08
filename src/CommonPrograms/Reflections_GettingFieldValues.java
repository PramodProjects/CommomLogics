package CommonPrograms;

import java.lang.reflect.Field;

public class Reflections_GettingFieldValues {

	static {

		Field value;
		try {
			value = String.class.getDeclaredField("value");
			value.setAccessible(true);
			value.set("What is your name", value.get("pramod"));
			value.set("How are you", value.get("fine"));
		}

		catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		System.out.println("What is your name");
		System.out.println("How are you");

	}

}
