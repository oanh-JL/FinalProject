package internship.eway.final_project.models

import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

import java.time.LocalDate
import java.time.LocalTime

@Document(collection = "daily_days")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
class DailyDay {
    @Id
    ObjectId _id

    String userId
    LocalDate date
    LocalTime checkIn
    LocalTime checkOut
    int status
    String reason

    DailyDay() {
    }

    DailyDay(ObjectId _id, String userId, LocalDate date, LocalTime checkIn, LocalTime checkOut, int status, String reason) {
        this._id = _id
        this.userId = userId
        this.date = date
        this.checkIn = checkIn
        this.checkOut = checkOut
        this.status = status
        this.reason = reason
    }
}
