import java.util.ArrayList;

public class CoreJavaBrushups1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNumber = 5;
		String website = "stephen website available";
		char letter = 'A';
		double dec = 5.99;
		boolean card = true;

		System.out.println(myNumber + " This is the current age of my last daughter Grace");

		int[] arr = { 2, 5, 7, 8, 9, 4, 89, 500 };

		// System.out.println(arr[2]);

		for (int i = 0; i < arr.length; i++)

		{

			if (arr[i] % 2 == 0) {

				System.out.println(arr[i]);
				break;

			}

			else {
				System.out.println(arr[i] + " This is  not a multilple of 2");

			}

		}

		String[] name = { "John", "Grace", "Daniel", "Deborah", "Farrah" };

		// for (int i = 0; i < name.length; i++)

		{

			for (String p : name)

			{
				System.out.println(p + "  These are the names of my children");
			}

		}

		ArrayList<String> a = new ArrayList<String>();
		a.add("Stephen");
		a.add("Grace");
		a.add("Dan");
		a.add("John J");
	System.out.println(	a.get(3));	

	}

}
