package com.jennifer.automationproject;

import org.testng.annotations.Test;

public class HowToVerifyCalendarSelection extends DriverWrapper {

    @Test
    public void selectCurrentDateFromCalendar() {
/*
        SimpleDateFormat sdf = new SimpleDateFormat("d");
        Date date = new Date();
        String todaysDate = sdf.format(date);

        //the xpath below is from the www.hotels.com website, NOT facebook
        //consider it as a reference for future assignments
        getDriver().findElement(By.xpath(".//[@id='qf-0q-localised-check-in']")).click();
        List<WebElement> days = getDriver().findElements(By.xpath(".//*class='widget-datepicker-bd']descendant::a"));

        for (WebElement day : days) {
            String expectedDay = day.getText();
            if (expectedDay.equals(todaysDate)) {
                day.click();
                Thread.sleep(3000);
                break;
            }
        }
*/

    }
}
