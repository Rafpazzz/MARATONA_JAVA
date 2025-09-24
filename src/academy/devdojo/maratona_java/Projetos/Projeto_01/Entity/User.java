package academy.devdojo.maratona_java.Projetos.Projeto_01.Entity;

import java.time.LocalDate;
import java.util.Objects;

public class User {

    private Long id;
    private String name;
    private LocalDate date_nas;
    private char sexo;
    private String email;

    public User() {

    }

    public User(Long id, String name, LocalDate date_nas, char sexo, String email) {
        this.id = id;
        this.name = name;
        this.date_nas = date_nas;
        this.sexo = sexo;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(email, user.email);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", date_nas=").append(date_nas);
        sb.append(", sexo=").append(sexo);
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate_nas() {
        return date_nas;
    }

    public void setDate_nas(LocalDate date_nas) {
        this.date_nas = date_nas;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
