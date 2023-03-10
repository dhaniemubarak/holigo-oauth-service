package id.holigo.services.holigooauthservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

@Configuration
public class JmsConfig {
    public static final String OAUTH_USER_DATA_QUEUE = "oauth-user-data";
    public static final String OAUTH_QUEUE = "oauth";
    public static final String CREATE_ACCESS_TOKEN_QUEUE = "create-access-token-queue";

    public static final String OAUTH_RESET_OTP_QUEUE = "oauth-reset-otp-queue";

    @Bean
    public MessageConverter jacksonJmsMessageConverter() {
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("_type");
        return converter;
    }
}
