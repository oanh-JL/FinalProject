package internship.eway.final_project.services

import internship.eway.final_project.models.DailyDay
import internship.eway.final_project.models.SystemResponse
import org.springframework.http.ResponseEntity

interface DailyDayService {
    ResponseEntity<SystemResponse> create(DailyDay dailyDay)
    ResponseEntity<List<DailyDay>> showAllWorkingDay(String userId, String dateFrom, String dateTo)
}
