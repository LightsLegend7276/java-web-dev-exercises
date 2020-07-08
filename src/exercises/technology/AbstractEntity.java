package exercises.technology;

public abstract class AbstractEntity {

    private static int id = 0;

    public AbstractEntity() {
        AbstractEntity.id++;
    }

    public int getId() { return id; }

}
