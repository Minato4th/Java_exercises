package Questionnaire.src.com.endava.entities;

public class People {
    private String name;
    private int age;
    private String birth;
    private String address;
    private int cellphone;
    private String hobbies;
    private String additional;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCellphone() {
        return cellphone;
    }

    public void setCellphone(int cellphone) {
        this.cellphone = cellphone;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth='" + birth + '\'' +
                ", address='" + address + '\'' +
                ", cellphone=" + cellphone +
                ", hobbies='" + hobbies + '\'' +
                ", additional='" + additional + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        People people = (People) o;

        if (age != people.age) return false;
        if (cellphone != people.cellphone) return false;
        if (name != null ? !name.equals(people.name) : people.name != null) return false;
        if (birth != null ? !birth.equals(people.birth) : people.birth != null) return false;
        if (address != null ? !address.equals(people.address) : people.address != null) return false;
        if (hobbies != null ? !hobbies.equals(people.hobbies) : people.hobbies != null) return false;
        return additional != null ? additional.equals(people.additional) : people.additional == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (birth != null ? birth.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + cellphone;
        result = 31 * result + (hobbies != null ? hobbies.hashCode() : 0);
        result = 31 * result + (additional != null ? additional.hashCode() : 0);
        return result;
    }
}
