package library;//location cannot be access by those file not on same location

public class Author {
    //hidden
    private String name;
    private String nationality; //hidden
// constructor - it's a form of setter this minimizes the code

    public Author(String name, String nationality) {
        this.name = name; //initialize name you can swap this.name to _name
        this.nationality = nationality;//same as above
    }
//getter
    public String getName() {
        return name;
    }
}
