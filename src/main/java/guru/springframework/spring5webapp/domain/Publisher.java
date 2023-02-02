package guru.springframework.spring5webapp.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Publisher {
    private String name;
    private String address_line;
    private String address_city;
    private String address_state;
    private String address_zip;

    @OneToMany
    @JoinColumn(name = "publisher_id")
    private Set<Book> books = new HashSet<>();


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Publisher() {
    }

    public Publisher(String name, String address_line, String address_city,
                     String address_state, String address_zip) {
        this.name = name;
        this.address_line = address_line;
        this.address_city = address_city;
        this.address_state = address_state;
        this.address_zip = address_zip;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress_line() {
        return address_line;
    }

    public void setAddress_line(String address_line) {
        this.address_line = address_line;
    }

    public String getAddress_city() {
        return address_city;
    }

    public void setAddress_city(String address_city) {
        this.address_city = address_city;
    }

    public String getAddress_state() {
        return address_state;
    }

    public void setAddress_state(String address_state) {
        this.address_state = address_state;
    }

    public String getAddress_zip() {
        return address_zip;
    }

    public void setAddress_zip(String address_zip) {
        this.address_zip = address_zip;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publisher publisher = (Publisher) o;

        if (!Objects.equals(name, publisher.name)) return false;
        if (!Objects.equals(address_line, publisher.address_line))
            return false;
        if (!Objects.equals(address_city, publisher.address_city))
            return false;
        if (!Objects.equals(address_state, publisher.address_state))
            return false;
        if (!Objects.equals(address_zip, publisher.address_zip))
            return false;
        return Objects.equals(id, publisher.id);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (address_line != null ? address_line.hashCode() : 0);
        result = 31 * result + (address_city != null ? address_city.hashCode() : 0);
        result = 31 * result + (address_state != null ? address_state.hashCode() : 0);
        result = 31 * result + (address_zip != null ? address_zip.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "name='" + name + '\'' +
                ", address_line='" + address_line + '\'' +
                ", address_city='" + address_city + '\'' +
                ", address_state='" + address_state + '\'' +
                ", address_zip='" + address_zip + '\'' +
                ", id=" + id +
                '}';
    }
}


