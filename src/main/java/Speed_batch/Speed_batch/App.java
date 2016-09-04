package Speed_batch.Speed_batch;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import Speed_batch.Speed_batch.task.MybatisTask;

/**
 * Hello world!
 *
 */

@EnableAutoConfiguration
@ComponentScan
@Configuration
//@MapperScan("Speed_batch.Speed_batch.mapper")
public class App implements CommandLineRunner{

    public static void main(String[] args) {
        //SpringApplication.run(App.class, args);
    	SpringApplication.run(MybatisTask.class, args);
    }

	@Override
	public void run(String... arg0) throws Exception {}

}

