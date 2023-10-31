
import com.javatechie.google.auth.models.Offre;
import com.javatechie.google.auth.repository.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OffreService {
    @Autowired
    private OffreRepository offreRepository;

    public List<Offre> getAllOffres() {
        return offreRepository.findAll();
    }

    public Offre getOffreById(Integer id) {
        return offreRepository.findById(id).orElse(null);
    }

    public void saveOffre(Offre offre) {
        offreRepository.save(offre);
    }

    public void deleteOffre(Integer id) {
        offreRepository.deleteById(id);
    }
}

