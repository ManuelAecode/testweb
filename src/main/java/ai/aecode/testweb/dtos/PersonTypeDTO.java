package ai.aecode.testweb.dtos;


public class PersonTypeDTO {
    private int id_person_type;
    private String person_type_name;
    private String person_type_description;

    public int getId_person_type() {
        return id_person_type;
    }

    public void setId_person_type(int id_person_type) {
        this.id_person_type = id_person_type;
    }

    public String getPerson_type_name() {
        return person_type_name;
    }

    public void setPerson_type_name(String person_type_name) {
        this.person_type_name = person_type_name;
    }

    public String getPerson_type_description() {
        return person_type_description;
    }

    public void setPerson_type_description(String person_type_description) {
        this.person_type_description = person_type_description;
    }
}
