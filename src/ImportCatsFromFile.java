import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ImportCatsFromFile {

    public int importCatsFromFile(String filename, CatCompound catCompound) throws FileNotFoundException {
        //chipid,name,breed
        //42,Abba,Abyssinian

        File fh = new File(filename);
        int numberofCats = 0;
        if (fh.exists()) {
            Scanner file = new Scanner(fh);
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] lineArr = line.split(",");
                try {
                    Cat tmpCat = new Cat(Integer.parseInt(lineArr[0]), lineArr[1], lineArr[2]);
                    catCompound.addCatToCompound(tmpCat);
                    numberofCats++;
                } catch (Exception e){
                    System.out.println("ERROR: " + e.toString());
                }
            }
        }
        return numberofCats;
    }
}
