public class Rule1 implements RecommendRule{
    @Override
    public boolean matches(User user,Book book){
        return !user.isAdult()
                && user.getReadingPerferences().equals("科幻")
                && user.getReadingDuration().equals("长时长")
                && book.getDifficulty().equals("中等难度");
    }
    @Override
    public String getDescription(){
        return "规则1：未成年 + 科幻 + 长时长 + 中等难度";
    }
}
