package GestionEmploye;

import java.sql.Date;

public interface IEmploye {
    int Age(int dateAujourdhui);
    int Anciennete(int dateAujourdhui);
    int DateRetraite(int ageRetraite);
}

