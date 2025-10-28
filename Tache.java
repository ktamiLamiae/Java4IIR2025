package javaAvance4IIR;

public class Tache {
    private String description;
    private boolean estComplete;

    public Tache(String description) {
        this.description = description;
        this.estComplete = false;
    }

    public String getDescription() { return description; }
    public boolean estComplete() { return estComplete; }
    public void terminer() { estComplete = true; }

    @Override
    public String toString() {
        return "Tache{" + "description='" + description + '\'' + ", estComplete=" + estComplete + '}';
    }
}
