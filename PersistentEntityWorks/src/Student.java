import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Student {
  @Id
  private long id = 0;

  private String name;

  private Date dateOfBirth = new Date();

  @Enumerated(EnumType.ORDINAL)
  private Gender gender;

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public String toString() {
    return "\n\nID:" + id + "\nName:" + name + "\nBirthday:" + dateOfBirth + "\nGender:"
        + gender+"\n\n";
  }
}
