public class Main {

    public static void main(String[] args) {
	    Cat cat1 = new Cat(232,"Missekat1","Tiger1");
	    Cat cat2 = new Cat(232,"Missekat2","Tiger2");

	    CatCompound catYard1 = new CatCompound("CPH Cats");

	    catYard1.addCatToCompound(cat1);
	    catYard1.addCatToCompound(cat2);


    }
}
