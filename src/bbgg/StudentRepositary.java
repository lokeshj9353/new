package bbgg;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface StudentRepositary extends JpaRepository<Studentbo, Integer> {
	

	

}
