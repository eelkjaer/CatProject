import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
		String filePath="Data/cats.csv";

	    CatCompound catYard1 = new CatCompound("CPH Cats");

	    ImportCatsFromFile imp = new ImportCatsFromFile();

	    try {
			imp.importCatsFromFile(filePath, catYard1);
		} catch (Exception e){
			System.out.println("ERROR: " + e.toString());
		}

		System.out.println(catYard1);

    }
}
