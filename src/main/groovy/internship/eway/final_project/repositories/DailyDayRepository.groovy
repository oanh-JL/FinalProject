package internship.eway.final_project.repositories

import internship.eway.final_project.models.DailyDay
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query

import java.time.LocalDate

interface DailyDayRepository extends MongoRepository<DailyDay, ObjectId> {
    @Query("?0")
    List<DailyDay> getDailyDay(String userId, LocalDate dateFrom, LocalDate dateTo)
}
