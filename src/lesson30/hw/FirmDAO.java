package lesson30.hw;

import java.util.Date;

public class FirmDAO {

   private static Firm firm;



    public Firm getInstanceFirmDepartmen() {
        if (firm == null)
            firm = new Firm(new Date(),DepartmentDAO.getDepartments(), CustomerDAO.getCustomers());

        return firm;
    }

    public FirmDAO() {
        getInstanceFirmDepartmen();
    }

    public static Firm getFirm() {
        return firm;
    }
}
