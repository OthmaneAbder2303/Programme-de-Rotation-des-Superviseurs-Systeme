package ma.ensa.programmederotationdessuperviseurssysteme.models;

import lombok.*;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Membre {

    private String id;
    private String nom;
    private String prenom;
    private String email;
    private String phone;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Membre membre = (Membre) o;
        return Objects.equals(getId(), membre.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
