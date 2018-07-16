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
        article.setTitle("静夜思");
        article.setAuthor("李白");
        article.setContent("床前明月光，疑是地上霜。举头望明月，低头思故乡。");
        article.setCreateTime(new Date());
        article.setModifyTime(new Date());
        return article;
    }
}