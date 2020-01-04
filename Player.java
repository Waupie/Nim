public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    abstract int drawMatches(int matches);

    public String getName() {
        return name;
    }
}
