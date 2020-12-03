package us.shengdiyage.cms.service;

import java.util.Date;

import us.shengdiyage.cms.facade.CmsQueryFacade;
import us.shengdiyage.cms.facade.model.Article;

/**
 * Query Something from CMS
 */
public class CmsQueryFacadeImpl  implements CmsQueryFacade {
    @Override
    public Article getArticleByPath(String path) {
        Article article = new Article();
        article.setId(12345);
        article.setPath(path);
        article.setTitle("Jingle bells");
        article.setAuthor("Pierpont");
        article.setContent("Jingle bells, jingle bells, Jingle all the way. ");
        article.setCreateTime(new Date());
        article.setModifyTime(new Date());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return article;
    }
}