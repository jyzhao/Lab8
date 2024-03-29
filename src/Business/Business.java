package Business;

import Business.Organization.OrganizationDirectory;

public class Business {
    
    private static Business business;
    private OrganizationDirectory organizationDirectory;
    
    public static Business getInstance(){
        if (business == null){
            business = new Business();
        }
        return business;
    }

    private Business() {
        organizationDirectory = new OrganizationDirectory();
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
}