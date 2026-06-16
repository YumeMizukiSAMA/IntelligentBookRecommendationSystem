import java.util.ArrayList;
import java.util.List;
public class RecommendEngine {
    private List<RecommendRule> rules;

    public RecommendEngine(){
        rules = new ArrayList<>();
        rules.add(new Rule1());
        rules.add(new Rule2());
    }
    public List<Book> recommend(User user, List<Book> allBooks){
        List<Book> result = new ArrayList<>();
        for(Book book : allBooks){
            for(RecommendRule rule : rules){
                if (rule.matches(user,book)){
                    result.add(book);
                    System.out.println("→" + rule.getDescription() + "→匹配成功");
                    break;
                }
            }
        }
        return result;
    }
}
