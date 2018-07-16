package us.shengdiyage.cms.facade;

import us.shengdiyage.cms.facade.model.Article;

/**
 * Query Something from CMS
 */
public interface CmsQueryFacade {

    /**
     * query article by path
     *
     * @param path Ex.: "how_to_plant_crops"
     * @return an Article instance or null
     */
    Article getArticleByPath(String path);

}