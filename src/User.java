public class User {
    private int age;
    private String readingPerferences;
    private String readingDuration;
    private String name;

    public User(int age, String readingPerferences, String readingDuration, String name) {
        this.age = age;
        this.readingPerferences = readingPerferences;
        this.readingDuration = readingDuration;
        this.name = name;
    }

    public User() {
    }

    public int getAge() {
        return age;
    }

    public boolean isAdult(){
       return this.age >= 18;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getReadingPerferences() {
        return readingPerferences;
    }

    public void setReadingPerferences(String readingPerferences) {
        this.readingPerferences = readingPerferences;
    }

    public String getReadingDuration() {
        return readingDuration;
    }

    public void setReadingDuration(String readingDuration) {
        this.readingDuration = readingDuration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
