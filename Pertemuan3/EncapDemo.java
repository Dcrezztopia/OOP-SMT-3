public class EncapDemo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge > 30) {
            System.out.println("Umur anda terlalu tua.");
        } else if (newAge < 18) {
            System.out.println("Umur anda terlalu muda.");
        } else {
            age = newAge;
        }
    }

}
