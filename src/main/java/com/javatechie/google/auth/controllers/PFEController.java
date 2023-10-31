
import com.javatechie.google.auth.models.PFE;
import com.javatechie.google.auth.service.PFEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pfes")
public class PFEController {
    @Autowired
    private PFEService pfeService;

    @GetMapping
    public List<PFE> getAllPFEs() {
        return pfeService.getAllPFEs();
    }

    @GetMapping("/{ref}")
    public PFE getPFEById(@PathVariable Integer ref) {
        return pfeService.getPFEById(ref);
    }

    @PostMapping
    public void savePFE(@RequestBody PFE pfe) {
        pfeService.savePFE(pfe);
    }

    @DeleteMapping("/{ref}")
    public void deletePFE(@PathVariable Integer ref) {
        pfeService.deletePFE(ref);
    }
}
