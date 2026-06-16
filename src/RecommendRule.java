public interface RecommendRule {
    public abstract boolean matches(User user,Book book);
    public abstract String getDescription();
}
