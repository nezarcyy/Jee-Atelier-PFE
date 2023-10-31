
import com.javatechie.google.auth.models.Etudiant;
import com.javatechie.google.auth.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiants")
public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;

    @GetMapping
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiants();
    }

    @GetMapping("/{id}")
    public Etudiant getEtudiantById(@PathVariable Integer id) {
        return etudiantService.getEtudiantById(id);
    }

    @PostMapping
    public void saveEtudiant(@RequestBody Etudiant etudiant) {
        etudiantService.saveEtudiant(etudiant);
    }

    @DeleteMapping("/{id}")
    public void deleteEtudiant(@PathVariable Integer id) {
        etudiantService.deleteEtudiant(id);
    }
}

