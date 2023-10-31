
import com.javatechie.google.auth.models.Offre;
import com.javatechie.google.auth.service.OffreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/offres")
public class OffreController {
    @Autowired
    private OffreService offreService;

    @GetMapping
    public List<Offre> getAllOffres() {
        return offreService.getAllOffres();
    }

    @GetMapping("/{id}")
    public Offre getOffreById(@PathVariable Integer id) {
        return offreService.getOffreById(id);
    }

    @PostMapping
    public void saveOffre(@RequestBody Offre offre) {
        offreService.saveOffre(offre);
    }

    @DeleteMapping("/{id}")
    public void deleteOffre(@PathVariable Integer id) {
        offreService.deleteOffre(id);
    }
}
