import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestArticleInfo {
    Map<Integer, ArticleInfo> articles = new HashMap<Integer, ArticleInfo>();

    public TestArticleInfo(ArrayList<ArticleInfo> articleList) {
        // Load DB from the outside.
        for (ArticleInfo article : articleList) {
            this.articles.put(article.getID(), article);
        }
    }
    public void add(ArticleInfo article) {
        articles.put(article.getID(), article);
    }

    public ArrayList<ArticleInfo> ArticleInfo() {
        ArrayList articleList = new ArrayList<ArticleInfo>();
        for (Map.Entry<Integer, ArticleInfo> entry : this.articles.entrySet()) {
            articleList.add(entry.getValue());
        }
        return articleList;
    }

}
