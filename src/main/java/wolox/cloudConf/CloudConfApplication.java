package wolox.cloudConf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;



@SpringBootApplication
@EnableConfigServer
public class CloudConfApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfApplication.class, args);
	}

}
