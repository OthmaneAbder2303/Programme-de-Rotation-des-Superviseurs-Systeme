package ma.ensa.prog_rot.dao.impl;

import ma.ensa.prog_rot.dao.IncidentDao;
import ma.ensa.prog_rot.models.Incident;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class IncidentDaoImp implements IncidentDao {

    public List<Incident> incidents = new ArrayList<>();

    @Override
    public void inserer(Incident incident) {
        incidents.add(incident);
    }

    @Override
    public Set<Incident> getAllIncidents() {
        return Set.of();
    }

}
