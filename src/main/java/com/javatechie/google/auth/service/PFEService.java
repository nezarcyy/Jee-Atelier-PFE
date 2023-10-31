

import com.javatechie.google.auth.models.PFE;
import com.javatechie.google.auth.repository.PFERepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PFEService {
    @Autowired
    private PFERepository pfeRepository;

    public List<PFE> getAllPFEs() {
        return pfeRepository.findAll();
    }

    public PFE getPFEById(Integer ref) {
        return pfeRepository.findById(ref).orElse(null);
    }

    public void savePFE(PFE pfe) {
        pfeRepository.save(pfe);
    }

    public void deletePFE(Integer ref) {
        pfeRepository.deleteById(ref);
    }
}
