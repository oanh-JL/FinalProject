package internship.eway.final_project.models

import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "detail_regimes")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
class DetailRegime {
    @Id
    ObjectId _id

    String userId
    int totalRestDayOff
    int totalMissingCheck

    DetailRegime() {
    }

    DetailRegime(ObjectId _id, String userId, int totalRestDayOff, int totalMissingCheck) {
        this._id = _id
        this.userId = userId
        this.totalRestDayOff = totalRestDayOff
        this.totalMissingCheck = totalMissingCheck
    }
}
