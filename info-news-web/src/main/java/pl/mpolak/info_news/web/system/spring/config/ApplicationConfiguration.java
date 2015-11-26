package pl.mpolak.info_news.web.system.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pl.mpolak.info_news.system.spring.config.ServiceConfiguration;

@Configuration
@ComponentScan(basePackages = {"pl.mpolak.info_news.web"})
@Import(ServiceConfiguration.class)
public class ApplicationConfiguration {
}
