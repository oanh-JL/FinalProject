package internship.eway.final_project.services.impl

import internship.eway.final_project.models.DailyDay
import internship.eway.final_project.models.SystemResponse
import internship.eway.final_project.models.User
import internship.eway.final_project.repositories.DailyDayRepository
import internship.eway.final_project.services.DailyDayService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.aggregation.Aggregation
import org.springframework.data.mongodb.core.aggregation.LookupOperation
import org.springframework.data.mongodb.core.aggregation.MatchOperation
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

import java.time.LocalDate

@Service
class DailyDayServiceImpl implements DailyDayService {
    @Autowired
    DailyDayRepository repository

    LocalDate parseDate(String date) {
        return LocalDate.parse(date)
    }

    @Override
    ResponseEntity<SystemResponse> create(DailyDay dailyDay) {
        return null
    }

    @Override
    ResponseEntity<List<DailyDay>> showAllWorkingDay(String userId, String dateFrom, String dateTo) {
        LocalDate dateFromParse = parseDate(dateFrom)
        LocalDate dateToParse = parseDate(dateTo)
        Criteria criteria = Criteria.where("user_id").is(userId)
                .and("date").gte(dateFromParse).lte(dateToParse)
        //       MatchOperation matchQuery = Aggregation.match(criteria)
//        LookupOperation lookupOperation = LookupOperation.newLookup().from("DailyDayRepository")
//                .localField("userId").foreignField("userId").as("DailyDayRepositoryJoin")
        Query query = new Query(criteria)

        List<DailyDay> result = repository.getDailyDay(userId, dateFromParse, dateToParse)
        return new ResponseEntity<List<DailyDay>>(result, HttpStatus.OK)
    }
}
