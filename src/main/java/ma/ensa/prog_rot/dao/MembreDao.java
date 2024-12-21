package ma.ensa.prog_rot.dao;

import ma.ensa.prog_rot.models.*;

import java.util.Set;

public interface MembreDao {

    public void inserer(Membre membre);
    public Set<Membre> chargerListIncidents();
    public Set<Membre> getAllMembres();

}
