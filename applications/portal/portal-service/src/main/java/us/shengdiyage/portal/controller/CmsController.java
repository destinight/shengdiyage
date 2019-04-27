/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package us.shengdiyage.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import us.shengdiyage.cms.facade.CmsQueryFacade;
import us.shengdiyage.cms.facade.model.Article;

/**5hgyt8uh7by why65tg v
 * CMS Controller
 */
@Controller
public class CmsController {

    @Autowired
    private CmsQueryFacade cmsQueryFacade;

    @ResponseBody
    @RequestMapping("/content/{path}")
    public Article content(@PathVariable String path)  {
        return cmsQueryFacade.getArticleByPath(path);
    }
}