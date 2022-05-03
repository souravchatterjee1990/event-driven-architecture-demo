package com.microservices.demo.twitter.to.kafka.service;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.microservices.demo.twitter.to.kafka.service.config.TwitterToKafkaServiceConfigData;

@SpringBootApplication
public class TwitterToKafkaServiceApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(TwitterToKafkaServiceApplication.class);
	
	private final TwitterToKafkaServiceConfigData twitterToKafkaServiceConfigData;
	
	// constructor injection
	// Prefer constructor injection over field injection because
	// 1 - It allows the bean to be immutable since you can define the property as final
	// 2 - No Reflection
	// 3 - No @Autowired annotation required
	// 4 - Forces that the object is created with the required dependencies
	public TwitterToKafkaServiceApplication(TwitterToKafkaServiceConfigData configData) {
		this.twitterToKafkaServiceConfigData = configData;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TwitterToKafkaServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info(twitterToKafkaServiceConfigData.getWelcomeMessage()  + " ->  " +  Arrays.toString(twitterToKafkaServiceConfigData.getTwitterKeywords().toArray(new String[] {})));
	}
	
}
