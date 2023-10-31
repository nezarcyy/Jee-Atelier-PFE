
import com.javatechie.google.auth.models.Encadrant;
import com.javatechie.google.auth.service.EncadrantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/encadrants")
public class EncadrantController {
    @Autowired
    private EncadrantService encadrantService;

    @GetMapping
    public List<Encadrant> getAllEncadrants() {
        return encadrantService.getAllEncadrants();
    }

    @GetMapping("/{id}")
    public Encadrant getEncadrantById(@PathVariable Integer id) {
        return encadrantService.getEncadrantById(id);
    }

    @PostMapping
    public void saveEncadrant(@RequestBody Encadrant encadrant) {
        encadrantService.saveEncadrant(encadrant);
    }

    @DeleteMapping("/{id}")
    public void deleteEncadrant(@PathVariable Integer id) {
        encadrantService.deleteEncadrant(id);
    }


}


