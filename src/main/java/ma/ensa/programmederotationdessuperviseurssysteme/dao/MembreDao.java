package ma.ensa.programmederotationdessuperviseurssysteme.dao;

import ma.ensa.programmederotationdessuperviseurssysteme.models.*;

import java.util.Set;

public interface MembreDao {

    public void inserer(Membre membre);
    public Set<Membre> chargerListIncidents();
    public Set<Membre> getAllMembres();

}
