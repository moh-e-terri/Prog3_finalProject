package View;

import java.io.IOException;

/**
 *
 * @author HP
 */
public class ViewManager {
     public static AdminPage adminPage;
     public static PatientPage patientPage;
     public static IndexPage indexPage;


    private ViewManager(){}

    

    public static void openAdminPage() throws IOException {
        if (adminPage == null) {
            adminPage = new AdminPage();
            adminPage.show();
        } else {
            adminPage.show();
        }

    }
    public static void closeAdminPage(){
        if(adminPage != null)
            adminPage.close();
    }
    
     public static void openPatientPage() throws IOException {
        if (patientPage == null) {
            patientPage = new PatientPage();
            patientPage.show();
        } else {
            patientPage.show();
        }

    }
    public static void closePatientPage(){
        if(patientPage != null)
            patientPage.close();
    }
    
    public static void openIndexPage ()throws IOException {
        if (indexPage == null) {
            indexPage = new IndexPage();
            indexPage.show();
        } else {
            indexPage.show();
        }

    }
    public static void closeIndexPage(){
        if(indexPage != null)
            indexPage.close();
    }
}
