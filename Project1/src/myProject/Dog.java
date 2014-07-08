package myProject;

import javax.faces.event.ActionEvent;


public class Dog {
    public String name;
    public String build;
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
}
