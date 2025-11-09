package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {
    private Integer id;
    private String name;
    private String email;
    private Date birthDate;
    private Double baseSalary;

    private Department depaartment;

    /**
     * Calculates the sum of two integers.
     *
     * <p>This method takes two integer parameters and returns their sum.
     * It does not perform any overflow checks.</p>
     *
     * @param a the first integer to add
     * @param b the second integer to add
     * @return the sum of {@code a} and {@code b}
     * @example <pre>
     * int result = add(5, 3); // result = 8
     * </pre>
     */
    public static int add(int a, int b) {
        return a + b;
    }

    public Seller(Integer id, String name, String email, Date birthDate, Double baseSalary, Department depaartment) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.baseSalary = baseSalary;
        this.depaartment = depaartment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepaartment() {
        return depaartment;
    }

    public void setDepaartment(Department depaartment) {
        this.depaartment = depaartment;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return Objects.equals(id, seller.id) && Objects.equals(email, seller.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", baseSalary=" + baseSalary +
                ", depaartment=" + depaartment +
                '}';
    }
}
