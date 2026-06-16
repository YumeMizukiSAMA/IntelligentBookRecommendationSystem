public class User {
    private int age;
    private String readingPreferences;
    private String readingDuration;
    private String name;

    public User(int age, String readingPreferences, String readingDuration, String name) {
        this.age = age;
        this.readingPreferences = readingPreferences;
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

    public String getReadingPreferences() {
        return readingPreferences;
    }

    public void setReadingPreferences(String readingPreferences) {
        this.readingPreferences = readingPreferences;
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
