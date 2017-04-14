package com.tm.session;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by lenovo on 2017/4/14.
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 180)
public class RedisSessionConfig {
}
