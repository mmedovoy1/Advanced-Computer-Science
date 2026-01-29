public class Assignment {
    private String title;
    private String description;
    private int descriptionLength;
    private String[] br = {"5 Netherite Ingots", "Quandale Dingle"};
    private String[] profanity = {"Frick", "Poop"};

    public Assignment(String title, String description) {
        // Students: add your own validation and exceptions as you see fit
        setTitle(title);
        setDescription(description);   
    }

    public void setTitle(String title) {
        if (title == null) {
            throw new NullPointerException("Title is null");
        }
        for (int i = 0; i < br.length; i++) {
            if (title.equals(br[i])) {
                throw new IllegalArgumentException("Can't be brainrot");
            }
        }
        for (int i = 0; i < profanity.length; i++) {
            if (title.equals(profanity[i])) {
            throw new IllegalArgumentException("Can't have profanity");
            }
        }
        this.title = title;
    }

    public void setDescription(String description) {
        if (description == null) {
            throw new NullPointerException("Title is null");
        }
        for (int i = 0; i < br.length; i++) {
            if (description.equals(br[i])) {
                throw new IllegalArgumentException("Can't be brainrot");
            }
        }
        for (int i = 0; i < profanity.length; i++) {
            if (description.equals(profanity[i])) {
                throw new IllegalArgumentException("Can't have profanity");
            }
        }
        this.description = description;
        this.descriptionLength = (description == null) ? 0 : description.length();
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDescriptionLength() {
        return descriptionLength;
    }
}
