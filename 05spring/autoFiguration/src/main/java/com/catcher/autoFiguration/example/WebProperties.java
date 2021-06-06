package com.catcher.autoFiguration.homework;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "web")
@Getter
@Setter
public class WebProperties {
    private String a = "aaa";
}
