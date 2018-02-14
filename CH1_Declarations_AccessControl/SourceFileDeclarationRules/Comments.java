public class Comments {
    public static void main(String[] args) {
        /* Comment at beginning of line */ System.out.println("Line 1");

        Idea newIdea = new Idea("My cool idea");
        System.out.println(newIdea.getItea());
    }
}

class Idea {
    private String idea;

    public Idea(String anIdea) {
        this.idea = anIdea;
    }

    public String getItea() {
        return this.idea;
    }
}