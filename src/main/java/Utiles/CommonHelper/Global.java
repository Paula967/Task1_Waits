package Utiles.CommonHelper;

public class Global {
    private String fullName ;
    private String email ;
    private String password ;
    private String firstName ;
    private String lastName ;
    private String address ;
    private String state ;
    private String city ;
    private String zipCode ;
    private String phoneNumber ;
    private String birthDay;
    private String birthMonth;
    private String birthYear;
    static Global Instance;

    private Global() {
    }

    public static Global getInstance(){
        if (Instance==null){
            Instance=new Global();
        }
        return Instance;
    }
    public void setFullName() {
        this.fullName =  RandomSource.createFullName();
    }

    public void setEmail() {
        this.email = RandomSource.createEmail();
    }

    public void setPassword() {
        this.password = RandomSource.createPassword();
    }

    public void setFirstName() {
        this.firstName = RandomSource.createFirstName();
    }

    public void setLastName() {
        this.lastName = RandomSource.createLastName();
    }

    public void setAddress() {
        this.address = RandomSource.createAddress();
    }

    public void setState() {
        this.state = RandomSource.createState();
    }

    public void setCity() {
        this.city = RandomSource.createCity();
    }

    public void setZipCode() {
        this.zipCode = RandomSource.createZipCode();
    }

    public void setPhoneNumber() {
        this.phoneNumber = RandomSource.createEgyptianMobileNumber();
    }

    public void setBirthDay() {
        this.birthDay = RandomSource.createDay();
    }

    public void setBirthMonth() {
        this.birthMonth = RandomSource.createMonth();
    }

    public void setBirthYear() {
        this.birthYear = RandomSource.createYear();
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public String getBirthYear() {
        return birthYear;
    }
}
