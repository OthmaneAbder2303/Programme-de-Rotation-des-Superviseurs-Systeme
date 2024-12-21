package ma.ensa.prog_rot.dao;
import ma.ensa.prog_rot.models.Incident;

import java.util.Set;

public interface IncidentDao {

    public void inserer(Incident incident);
    public Set<Incident> getAllIncidents();

}
