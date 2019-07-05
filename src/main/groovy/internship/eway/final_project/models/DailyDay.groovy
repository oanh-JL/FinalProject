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
    LocalTime totalTime
    int status
    String reason
    boolean  missing = false

    DailyDay() {
    }

    DailyDay(ObjectId _id, String userId, LocalDate date, LocalTime checkIn, LocalTime checkOut,LocalTime totalTime , int status, String reason, boolean missing) {
        this._id = _id
        this.userId = userId
        this.date = date
        this.checkIn = checkIn
        this.checkOut = checkOut
        this.totalTime = totalTime
        this.status = status
        this.reason = reason
        this.missing = missing
    }
}
