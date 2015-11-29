class User {

    static constraints = {
        name(unique: true, nullable: false)
        pwd(unique: true, nullable: false)
        age(max: 100)
    }


    String name;
    String pwd;
    int age = 0;
}
