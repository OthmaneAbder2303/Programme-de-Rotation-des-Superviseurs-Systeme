package ma.ensa.programmederotationdessuperviseurssysteme.dao.impl;

import ma.ensa.programmederotationdessuperviseurssysteme.dao.IncidentDao;
import ma.ensa.programmederotationdessuperviseurssysteme.models.Incident;

import java.util.ArrayList;
import java.util.List;

public class IncidentDaoImp implements IncidentDao {

    public List<Incident> incidents = new ArrayList<>();

    @Override
    public void inserer(Incident incident) {
        incidents.add(incident);
    }

}
