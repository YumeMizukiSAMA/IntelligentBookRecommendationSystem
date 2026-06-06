public class Book {
    private String style;
    private String difficulty;
    private String length;
    private String name;

    public Book(String style, String difficulty, String length, String name) {
        this.style = style;
        this.difficulty = difficulty;
        this.length = length;
        this.name = name;
    }

    public Book() {
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
