package internship.eway.final_project.models

import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "users")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
class User {
    @Id
    ObjectId _id
    String userId
    String userName
    String email
    String password
    String role
    String leaderId
    String department

    User() {
    }

    User(String userId, String userName, String email, String password, String role, String leaderId, String department) {
        this._id = _id
        this.userId = userId
        this.userName = userName
        this.email = email
        this.password = password
        this.role = role
        this.leaderId = leaderId
        this.department = department
    }
}