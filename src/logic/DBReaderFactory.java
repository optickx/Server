package logic;

import java.sql.Connection;

import logic.model.DBReaderImplementation;
import logic.model.IClientServer;

/**
 *
 * @author Dani,Eneko
 */
public abstract class DBReaderFactory {

    private static IClientServer idbr = null;

    /**
     *
     * @return a DBReaderImplementation
     */
    public static IClientServer getAccess() {
        if (idbr == null) {
            Pool pool = new Pool();
            idbr = new DBReaderImplementation(pool.getConnection());
        }

        return idbr;
    }
}
