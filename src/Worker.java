public class Worker {

    private int idNumber;
    private String phoneNumber;
    private String name;
    private int experience;

    public Worker(int idNumber, String phoneNumber, String name, int experience) {
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return
                "idNumber=" + idNumber +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                ", experience=" + experience;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }
}
