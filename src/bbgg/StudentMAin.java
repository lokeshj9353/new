package bbgg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentMAin {

	@Autowired
	StudentRepositary ref;
	
	@PostMapping("/save")
	public Studentbo saveStudentbo(@RequestBody Studentbo studentbo) {
		Studentbo s1=ref.save(studentbo);
		return s1;
	}
	
	
}
