package myProject;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.servlet.http.HttpServletRequest;
import weblogic.security.principal.*;

public class Dog {
    public String name;
    public String build;
    public String userRoleList;
    public Dog() {
        super();
        this.name = "HelloAndWelcome";
        this.build = "Building";
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getBuild() {
        return build;
    }

    public void DogClicked(ActionEvent actionEvent) {

        this.name = "Hello";
    }

    public void setUserRoleList(String userRoleList) {
        this.userRoleList = userRoleList;
    }

    public String getUserRoleList() {
        HttpServletRequest req = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
        
        WLSUserImpl userPrincipal = (WLSUserImpl)req.getUserPrincipal();

        //return req.isUserInRole("Admin")+"";
        return userPrincipal.getName();
    }
}
