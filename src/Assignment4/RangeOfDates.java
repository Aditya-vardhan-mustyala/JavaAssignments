package Assignment4;

import java.time.*;
import java.time.format.DateTimeFormatter;
class RangeOfDates
{
    LocalDate joiningDate;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    RangeOfDates(String joining)
    {
        joiningDate=LocalDate.parse(joining,formatter);
    }

    public String calculateRange(String currdate) {
        LocalDate currDate=LocalDate.parse(currdate,formatter);
        LocalDate currAnniversaryDate;
        currAnniversaryDate = LocalDate.of(currDate.getYear(), joiningDate.getMonthValue(), joiningDate.getDayOfMonth());

        return calculateRange(currAnniversaryDate, currDate);
    }
    public String calculateRange(LocalDate currDate) {
        LocalDate currAnniversaryDate;
        currAnniversaryDate = LocalDate.of(currDate.getYear(), joiningDate.getMonthValue(), joiningDate.getDayOfMonth());

        return calculateRange(currAnniversaryDate, currDate);
    }
    public String calculateRange(LocalDate currAnniversaryDate,LocalDate currDate)
    {
        if(!isAtleastFirstAnniversary(currAnniversaryDate))
            return "No Range";

        if(currDateGreaterThanAnniversaryDateRange(currAnniversaryDate,currDate))
            return getTotalRange(currAnniversaryDate);

        if(currDateLessthanAnniversaryDateRange(currAnniversaryDate,currDate))
        {
            LocalDate lastYearAnniversaryDate=getLastYearAnniversaryDate(currAnniversaryDate);
            return calculateRange(lastYearAnniversaryDate, currDate);
        }

        return getPartialRange(currAnniversaryDate,currDate);



    }

    private LocalDate getLastYearAnniversaryDate(LocalDate currAnniversaryDate)
    {
        return LocalDate.of(currAnniversaryDate.getYear()-1,currAnniversaryDate.getMonthValue(),currAnniversaryDate.getDayOfMonth());
    }

    private boolean currDateLessthanAnniversaryDateRange(LocalDate currAnniversaryDate, LocalDate currDate)
    {
        LocalDate lowerRange=currAnniversaryDate.minusDays(30);
        return currDate.isBefore(lowerRange);

    }

    private boolean currDateGreaterThanAnniversaryDateRange(LocalDate currAnniversaryDate, LocalDate currDate)
    {
        LocalDate upperRange=currAnniversaryDate.plusDays(30);
        return currDate.isAfter(upperRange);
    }

    private boolean isAtleastFirstAnniversary(LocalDate currDate)
    {
        Period difference =Period.between(joiningDate,currDate);
        return difference.getYears()>0;
    }

    private String getPartialRange(LocalDate currAnniversaryDate, LocalDate currDate)
    {
        currAnniversaryDate=currAnniversaryDate.minusDays(30);
        return currAnniversaryDate.format(formatter)+" "+currDate.format(formatter);
    }

    private String getTotalRange(LocalDate currAnniversaryDate)
    {
        LocalDate lowerRange=currAnniversaryDate.minusDays(30);
        LocalDate upperRange=currAnniversaryDate.plusDays(30);
        return lowerRange.format(formatter)+" "+upperRange.format(formatter);
    }


}
