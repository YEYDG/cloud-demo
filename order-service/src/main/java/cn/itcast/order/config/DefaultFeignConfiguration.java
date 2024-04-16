package cn.itcast.order.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @author lhd
 * @version 1.0
 * @date 2024/4/16 19:03
 */

public class DefaultFeignConfiguration {
    @Bean
    public Logger.Level logLevel(){
        return  Logger.Level.NONE;
    }


}
