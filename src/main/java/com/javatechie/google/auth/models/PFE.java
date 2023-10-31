
import javax.persistence.*;
import java.util.Date;

@Entity
public class PFE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ref;
    private String entreprise;
    private String sujet;
    private Date dateDebut;
    private Date dateFin;

    @OneToOne
    @JoinColumn(name = "etudiant_id")
    private Etudiant etudiant;

    @ManyToOne
    @JoinColumn(name = "encadrant_id")
    private Encadrant encadrant;
}