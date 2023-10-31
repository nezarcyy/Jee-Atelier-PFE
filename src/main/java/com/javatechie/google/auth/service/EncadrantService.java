
import com.javatechie.google.auth.models.Encadrant;
import com.javatechie.google.auth.repository.EncadrantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EncadrantService {
    @Autowired
    private EncadrantRepository encadrantRepository;

    public List<Encadrant> getAllEncadrants() {
        return encadrantRepository.findAll();
    }

    public Encadrant getEncadrantById(Integer id) {
        return encadrantRepository.findById(id).orElse(null);
    }

    public void saveEncadrant(Encadrant encadrant) {
        encadrantRepository.save(encadrant);
    }

    public void deleteEncadrant(Integer id) {
        encadrantRepository.deleteById(id);
    }
}
