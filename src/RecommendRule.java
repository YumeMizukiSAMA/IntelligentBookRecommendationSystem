public interface RecommendRule {
    boolean matches(User user,Book book);
    String getDescription();
}
