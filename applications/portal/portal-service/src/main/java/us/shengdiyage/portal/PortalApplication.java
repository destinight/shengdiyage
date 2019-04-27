package us.shengdiyage.portal;

import java.util.Date;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

import us.shengdiyage.cms.facade.CmsQueryFacade;

@ImportResource({ "classpath*:portal-service.xml" })
//@Import(CommonCachingConfigurer.class)
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@EnableCaching
@EnableScheduling
@SpringBootApplication
public class PortalApplication {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext applicationContext =  SpringApplication.run(PortalApplication.class, args);
		CmsQueryFacade cmsQueryFacade = applicationContext.getBean(CmsQueryFacade.class);
		while (true){
			Thread.sleep(20000);
			cmsQueryFacade.getArticleByPath(new Date().toString());

		}
	}
}
