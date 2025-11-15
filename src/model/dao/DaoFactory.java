package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    /*
    FACTORYDAO,
    Classe auxiliar responsavel por instanciar os DAOs
    Possui operações estaticas para instanciar os DAOs.

    É uma forma de expor somente a interface e não a implementação em si.
    É tbm uma injeçaõ de dependencia sem explicitar na implementação.
    */

    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao(){return new DepartmentDaoJDBC(DB.getConnection());
    };

}
