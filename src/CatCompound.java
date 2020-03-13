import java.util.ArrayList;

public class CatCompound {

    static int compId=0;
    int compInstId;
    String compoundName;
    ArrayList<Cat> cats;

    public CatCompound(String name){
        cats = new ArrayList<>();
        this.compoundName = name;
        this.compInstId = compId;

        compId++;
    }


    public void addCatToCompound(Cat cat){
        if(cats.contains(cat)){
            System.out.println("Cat already in compound " + cat.getCatName());
        } else {
            cats.add(cat);
        }
    }

    @Override
    public String toString() {
        return "CatCompound{" +
                "compInstId=" + compInstId +
                ", compoundName='" + compoundName + '\'' +
                ", cats=" + cats +
                '}';
    }
}
