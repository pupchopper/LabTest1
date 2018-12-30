package sut.sa.g16.entity;
import javax.persistence.*;
import lombok.*;
import java.util.List;
@Entity
@Data
@Getter
@Setter
@Table (name = " CATEGORY ")
public class Category {
    @Id


    private @NonNull String categoryid;
    private @NonNull String typework;

    //One To Many with Rooms_Furniture_ManyToMany



    protected Category(){

    }

    public Category( String categoryid,String typework){
        this.typework = typework;
        this.categoryid =categoryid;
    }
    public String getCategoryid() {
        return categoryid;
    }
    public String getTypework() {
        return typework;
    }
    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }
    public void setTypework(String typework) {
        this.typework = typework;
    }



}


