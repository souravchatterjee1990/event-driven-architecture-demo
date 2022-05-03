package com.microservices.demo.twitter.to.kafka.service.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "twitter-to-kafka-service")
public class TwitterToKafkaServiceConfigData {

	private List<String> twitterKeywords; // this property name should match with the property file. In the property file we have 'twitter-keywords' so we have replaced this '-k' with 'K'

	private String welcomeMessage;
}
