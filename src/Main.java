import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
	    /*
	    Cat cat1 = new Cat(232,"Missekat1","Tiger1");
	    Cat cat2 = new Cat(232,"Missekat2","Tiger2");
	    Cat cat3 = new Cat(42,"Abba","Abyssinian");
	    */

		String filePath="Data/cats.csv";

	    CatCompound catYard1 = new CatCompound("CPH Cats");

	    ImportCatsFromFile imp = new ImportCatsFromFile();

	    try {
			imp.importCatsFromFile(filePath, catYard1);
		} catch (Exception e){
			System.out.println("ERROR: " + e.toString());
		}

		System.out.println(catYard1);
	    /*
	    catYard1.addCatToCompound(cat1);
	    catYard1.addCatToCompound(cat2);
	    catYard1.addCatToCompound(cat3);
	    */


    }
}
