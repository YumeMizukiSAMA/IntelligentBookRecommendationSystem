public class Rule2 implements RecommendRule{
    @Override
    public boolean matches(User user,Book book){
        return  user.isAdult()
                && user.getReadingPerferences().equals("文学")
                && user.getReadingDuration().equals("中等篇幅")
                && book.getDifficulty().equals("简单难度");
    }
    @Override
    public String getDescription(){
        return "成年 + 文学 + 中等篇幅 + 简单难度";
    }
}
