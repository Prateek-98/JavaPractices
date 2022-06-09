package Disease;

public class Disease {
    private String name;
    private boolean curable;
    private boolean contagious;

    public Disease(String name, boolean curable, boolean contagious) {
        this.name = name;
        this.curable = curable;
        this.contagious = contagious;
    }

    public boolean isCurable() {
        return this.curable;
    }

    public String getName() {
        return name;
    }

    public void setCurable(boolean curable) {
        this.curable = curable;
    }

    public void setName(String name) {
        this.name = name;
    }
}
