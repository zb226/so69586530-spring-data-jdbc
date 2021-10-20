package zb226.qa.so69586530;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.repository.CrudRepository;

import zb226.qa.so69586530.model.Outlet;

@SpringBootApplication
@EnableJdbcRepositories(considerNestedRepositories = true)
public class Runner {
	
	public interface OutletRepository extends CrudRepository<Outlet, String> {}

	@Autowired
	private OutletRepository outletRepo;

	public static void main(String[] args) {
		SpringApplication.run(Runner.class, args);
	}

	@EventListener
	public void runAtStartup(ApplicationReadyEvent event) {
		outletRepo.findById("DEF012").get().getOfferedServices().values().forEach(System.out::println);
	}

}
