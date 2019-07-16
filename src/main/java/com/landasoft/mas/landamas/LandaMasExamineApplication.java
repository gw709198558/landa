package com.landasoft.mas.landamas;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.io.UnsupportedEncodingException;

@EnableCaching(proxyTargetClass = true)
@SpringBootApplication()
public class LandaMasExamineApplication {

    private static final Logger logger = LoggerFactory.getLogger(LandaMasExamineApplication.class);

    @Value("${croseFilter.enable}")
    private boolean enableCroseFilter;

    public static void main(String[] args) {
        byte[] targetBs = null;
        String fozu2 = "DQogICAgICAgICAgICAgICAgICAgX29vT29vXw0KICAgICAgICAgICAgICAgICAgbzg4ODg4ODhvDQogICAgICAgICAgICAgICAgICA4OCIgLiAiODgNCiAgICAgICAgICAgICAgICAgICh8IC1fLSB8KQ0KICAgICAgICAgICAgICAgICAgT1wgID0gIC9PDQogICAgICAgICAgICAgICBfX19fL2AtLS0nXF9fX18NCiAgICAgICAgICAgICAuJyAgXFx8ICAgICB8Ly8gIGAuDQogICAgICAgICAgICAvICBcXHx8fCAgOiAgfHx8Ly8gIFwNCiAgICAgICAgICAgLyAgX3x8fHx8IC06LSB8fHx8fC0gIFwNCiAgICAgICAgICAgfCAgIHwgXFxcICAtICAvLy8gfCAgIHwNCiAgICAgICAgICAgfCBcX3wgICcnXC0tLS8nJyAgfCAgIHwNCiAgICAgICAgICAgXCAgLi1cX18gIGAtYCAgX19fLy0uIC8NCiAgICAgICAgIF9fX2AuIC4nICAvLS0uLS1cICBgLiAuIF9fDQogICAgICAuIiIgJzwgIGAuX19fXF88fD5fL19fXy4nICA+JyIiLg0KICAgICB8IHwgOiAgYC0gXGAuO2BcIF8gL2A7LmAvIC0gYCA6IHwgfA0KICAgICBcICBcIGAtLiAgIFxfIF9fXCAvX18gXy8gICAuLWAgLyAgLycNCj09PT09PWAtLl9fX19gLS5fX19cX19fX18vX19fLi1gX19fXy4tJz09PT09PQ0KICAgICAgICAgICAgICAgICAgIGA9LS0tPScKXl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eDQogICAgICAgICAgIOS9m+ellumVh+alvCAgICAgICAgICAgICAgICAgIEJVR+i+n+aYkw0KCeS9m+absDogIA0KICAg5YaZ5a2X5qW86YeM5YaZ5a2X6Ze077yM5YaZ5a2X6Ze06YeM56iL5bqP5ZGY77ybICANCiAgIOeoi+W6j+S6uuWRmOWGmeeoi+W6j++8jOWPiOaLv+eoi+W6j+aNoumFkumSseOAgiAgDQogICDphZLphpLlj6rlnKjnvZHkuIrlnZDvvIzphZLphonov5jmnaXnvZHkuIvnnKDvvJsgIA0KICAg6YWS6YaJ6YWS6YaS5pel5aSN5pel77yM572R5LiK572R5LiL5bm05aSN5bm044CCICANCiAgIOS9huaEv+iAgeatu+eUteiEkemXtO+8jOS4jeaEv+meoOi6rOiAgeadv+WJje+8myAgDQogICDlpZTpqbDlrp3pqazotLXogIXotqPvvIzlhazkuqToh6rooYznqIvluo/lkZjjgIIgIA0KICAg5Yir5Lq656yR5oiR5b+S55av55mr77yM5oiR56yR6Ieq5bex5ZG95aSq6LSx77ybICANCiAgIOS4jeingea7oeihl+a8guS6ruWmue+8jOWTquS4quW9kuW+l+eoi+W6j+WRmO+8nw==";
        try {
            byte[] sourceBs = fozu2.getBytes("UTF-8");
            targetBs = Base64.decodeBase64(sourceBs);
            logger.debug(new String(targetBs, "UTF-8"));
            SpringApplication.run(LandaMasExamineApplication.class, args);
        } catch (UnsupportedEncodingException e) {
            logger.debug("========大事不妙，佛祖镇楼异常！===========");
        }
        logger.debug("^^^^^^^^^^^^^^佛祖镇楼                  BUG辟易^^^^^^^^^^^^^");

    }

    @Bean
    public CorsFilter corsFilter() {
        final UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        if (enableCroseFilter) {
            final CorsConfiguration corsConfiguration = new CorsConfiguration();
            corsConfiguration.setAllowCredentials(true);
            corsConfiguration.addAllowedOrigin("*");
            corsConfiguration.addAllowedHeader("*");
            corsConfiguration.addAllowedMethod("*");
            urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
        }
        return new CorsFilter(urlBasedCorsConfigurationSource);
    }


}
