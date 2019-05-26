package Data.Models;

/**
 * The purpose of Model_User is to...
 *
 * @author kasper
 */
public class Model_User {

    /**
     * Constructor to create a user.
     *
     * @param id
     * @param email
     * @param password
     * @param firstName
     * @param lastName
     * @param phone
     * @param street
     * @param city
     * @param zip
     * @param country
     * @param role
     */
    public Model_User(int id, String email, String password, String firstName, String lastName, String phone, String street, String city, String zip, String country, String role) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.country = country;
        this.role = role;
    }

    private int id; // just used to demo retrieval of autogen keys in UserMapper
    private String email;
    private String password; // Should be hashed and secured
    private String firstName;
    private String lastName;
    private String phone;
    private String street;
    private String city;
    private String zip;
    private String country;
    private String role;

    /**
     * Constructor to create a user.
     *
     * @param email
     * @param password
     * @param firstName
     * @param lastName
     * @param phone
     * @param street
     * @param city
     * @param zip
     * @param country
     * @param role
     */
    public Model_User(String email, String password, String firstName, String lastName, String phone, String street, String city, String zip, String country, String role) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.country = country;
        this.role = role;
    }

    /**
     *
     * @return firstname of user
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return lastname of user
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return phonenumber of user
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *
     * @return streetname of user
     */
    public String getStreet() {
        return street;
    }

    /**
     *
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     *
     * @return city of user
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return zipcode of user
     */
    public String getZip() {
        return zip;
    }

    /**
     *
     * @param zip
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     *
     * @return country of user
     */
    public String getCountry() {
        return country;
    }

    /**
     *
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     *
     * @return email of user
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return password of user
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return role of user
     */
    public String getRole() {
        return role;
    }

    /**
     *
     * @param role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     *
     * @return id of user
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

}
