package OOPS_iitm.Week1to4;

interface DBIF {
    public void executeStatement(String qry);
}

class Database {
    private ConnectionObj cobj = null;

    //public DBIF connectDB(String u, String p) since connectionObj implemets DBIF so we can also use the return type of interface DBIF
    public ConnectionObj connectDB(String u, String p) {
        if (isValidate(u, p))
            cobj = new ConnectionObj();
        return cobj;
    }

    public boolean isValidate(String u, String p) {
        //assume the vaidation is always true
        return true;
    }

    private class ConnectionObj implements DBIF {
        public void executeStatement(String qry) {
            System.out.println("Execute: " + qry);
        }
    }
}

public class InterfaceDB {
    public static void main(String[] args) {
        DBIF con = new Database().connectDB("test", "test");
        con.executeStatement("fetch students");
    }
}
