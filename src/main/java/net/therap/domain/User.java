package net.therap.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;


/**
 * Created with IntelliJ IDEA.
 * @Author: shakhawat.hossain
 * Date: 4/27/14
 * Time: 9:33 AM
 *
 */
@MappedSuperclass
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    @Size (min=3, max=20, message=
            "invalid first name")
    private String firstName;

    @Column(name = "last_name")
    @Size (min=3, max=20, message=
            "invalid last name")
    private String lastName;

    @Column(name = "email")
    @Pattern (regexp="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}",
            message="invalid email address.")
    private String email;

    @Column(name = "birthdate")
    @DateTimeFormat (pattern="yyyy/MM/dd" )
    @NotNull(message = "birth date required") @Past(message = "invalid birth date")
    private Date dateOfBirth;

    @Column(name = "gender")
    private String gender;

    @Column(name = "password")
    @Size(min=6, max=20,
            message="The password must be at least 6 characters long.")
    private String password;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "\nUser{" +
                "\nid='" + id + '\'' +
                "\nfirstName='" + firstName + '\'' +
                "\nlastName='" + lastName + '\'' +
                "\nemailAddress='" + email + '\'' +
                "\ndateOfBirth='" + dateOfBirth + '\'' +

                "}\n";
    }

}
