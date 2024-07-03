package ai.aecode.testweb.dtos;

import ai.aecode.testweb.entities.PersonType;
import ai.aecode.testweb.entities.UserProfile;
import jakarta.persistence.Column;


public class UserResultDTO {
    private int id_userresult;
    private UserProfile userProfile;
    private PersonType personType;
    private Double result_manager;
    private Double result_developer;
    private Double result_executor;
    private String person_type_description;

    public int getId_userresult() {
        return id_userresult;
    }

    public void setId_userresult(int id_userresult) {
        this.id_userresult = id_userresult;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public PersonType getPersonType() {
        return personType;
    }

    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }

    public Double getResult_manager() {
        return result_manager;
    }

    public void setResult_manager(Double result_manager) {
        this.result_manager = result_manager;
    }

    public Double getResult_developer() {
        return result_developer;
    }

    public void setResult_developer(Double result_developer) {
        this.result_developer = result_developer;
    }

    public Double getResult_executor() {
        return result_executor;
    }

    public void setResult_executor(Double result_executor) {
        this.result_executor = result_executor;
    }

    public String getPerson_type_description() {
        return person_type_description;
    }

    public void setPerson_type_description(String person_type_description) {
        this.person_type_description = person_type_description;
    }
}
