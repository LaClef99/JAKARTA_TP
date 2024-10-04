package org.efrei.start.models;
import jakarta.persistence.*;

@Entity
public class Films {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "titre", nullable = false, length = 50)
    private String titre;

    @Column(name = "resume", nullable = false, length = 1000)
    private String resume;

    @Column(name = "lieu", nullable = false, length = 200)
    private String lieu;

    public Films(String titre, String resume, String lieu) {
        this.titre = titre;
        this.resume = resume;
        this.lieu = lieu;
    }

    public Films() {

    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String title) {
        this.titre = titre;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
}
