package klasy.shop;

import java.time.LocalDate;

public class Client {
    private LocalDate birthDate;
    private String name;
    private String surname;

    public Client(LocalDate birthDate, String name, String surname) {
        this.birthDate = birthDate;
        this.name = name;
        this.surname = surname;

    }

    @Override
    public String toString() {
        return "Client{" +
                "birthDate=" + birthDate +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public boolean isAdult (){
        if (birthDate.isBefore(LocalDate.now().minusYears(18))){
            return true;
        }else {
            return false;
        }
    }

}
class Usage2{
    public static void main(String[] args) {
        Client Adam = new Client(LocalDate.of(2000, 12, 12), "Adam","D");
        System.out.println(Adam);
        System.out.println(Adam.isAdult());

    }
}
