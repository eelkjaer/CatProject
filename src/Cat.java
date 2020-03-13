import java.util.Objects;

public class Cat {
    static int idCounter=0;
    int chipId, catId;
    String catName, catBreed;

    public Cat(int chipId, String catName, String catBreed) {
        this.chipId = chipId;
        this.catName = catName;
        this.catBreed = catBreed;
        this.catId = idCounter;
        idCounter++;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public int getChipId() {
        return chipId;
    }

    public int getCatId() {
        return catId;
    }

    public String getCatName() {
        return catName;
    }

    public String getCatBreed() {
        return catBreed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return chipId == cat.chipId;
    }

    @Override
    public int hashCode() {
        return chipId;
    }
}
