package ma.ensa.programmederotationdessuperviseurssysteme;

import ma.ensa.programmederotationdessuperviseurssysteme.dao.MembreDao;
import ma.ensa.programmederotationdessuperviseurssysteme.dao.impl.MembreDaoImp;
import ma.ensa.programmederotationdessuperviseurssysteme.models.Membre;
import ma.ensa.programmederotationdessuperviseurssysteme.utils.MembreCsvImporter;

import java.util.Set;

public class App {

    public static void main(String[] args) {
        // Step 1: Create a MembreDao implementation (in-memory or database)
        MembreDao membreDao = new MembreDaoImp();

        // Step 2: Manually add a new member
        addMembreManually(membreDao);

        // Step 3: Import members from CSV (passing both the file path and the MembreDao)
        MembreCsvImporter importer = new MembreCsvImporter();
        Set<Membre> importedMembres = importer.chargerListeMembre("membre_csv", membreDao);  // Pass both the file path and the MembreDao

        // Step 4: Display the added members
        displayMembres(membreDao);
    }

    // Manually add a new member to the MembreDao
    private static void addMembreManually(MembreDao membreDao) {
        Membre membre = new Membre("ID123", "John", "Doe", "john.doe@example.com", "1234567890");
        membreDao.inserer(membre);
        System.out.println("Manually added: " + membre);
    }

    // Display all members stored in the MembreDao
    private static void displayMembres(MembreDao membreDao) {
        Set<Membre> allMembres = membreDao.getAllMembres();
        System.out.println("List of all members:");
        for (Membre membre : allMembres) {
            System.out.println(membre);
        }
    }
}
