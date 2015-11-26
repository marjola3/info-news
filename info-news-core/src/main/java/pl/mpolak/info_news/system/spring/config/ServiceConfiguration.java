package pl.mpolak.info_news.system.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"pl.mpolak.info_news.business"})
@Import(DatabaseConfiguration.class)
public class ServiceConfiguration {
}
