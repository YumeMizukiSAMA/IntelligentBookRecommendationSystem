import java.util.List;

public class TestDevice {
    public static void main(String[] args) {
        Book book1 = new Book("科幻","中等难度","长时长","三体");
        Book book2 = new Book("文学","简单难度","中等篇幅","活着");
        User user1 = new User(16,"科幻","长时长","小张");
        User user2 = new User(22,"文学","中等篇幅","小李");

        List<Book> books = List.of(book1,book2);
        List<User> users = List.of(user1,user2);
        RecommendEngine engine= new RecommendEngine();

        for(User user : users){
            System.out.println("-----为" + user.getName() + "推荐书籍-----");
            List<Book> result = engine.recommend(user,books);
            if(result.isEmpty()){
                System.out.println("未找到合适的书籍！");
                System.out.println();
            }
            else {
                System.out.print("推荐结果：");
                for(Book book : result){
                    System.out.print("《" +  book.getName() + "》");
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}
