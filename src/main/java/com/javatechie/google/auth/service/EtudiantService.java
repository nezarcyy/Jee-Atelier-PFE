
import com.javatechie.google.auth.models.Etudiant;
import com.javatechie.google.auth.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {
    @Autowired
    private EtudiantRepository etudiantRepository;

    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    public Etudiant getEtudiantById(Integer id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    public void saveEtudiant(Etudiant etudiant) {
        etudiantRepository.save(etudiant);
    }

    public void deleteEtudiant(Integer id) {
        etudiantRepository.deleteById(id);
    }
}
