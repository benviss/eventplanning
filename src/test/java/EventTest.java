import org.junit.*;
import static org.junit.Assert.*;


public class EventTest {
  Event newEvent = new Event(100,"Patio",true,"Never Stoppers","Snacks",60);
  @Test
  public void newEvent_instantiatesCorrectly_True() {
    assertEquals(true, newEvent instanceof Event);
  }
  @Test
  public void newEvent_returnsGuestCost_200() {
    Integer expectedOutput = 200;
    assertEquals(expectedOutput, newEvent.tallyGuestCost());
  }
  @Test
  public void newEvent_returnsVenueCost_500() {
    Integer expectedOutput = 500;
    assertEquals(expectedOutput, newEvent.tallyVenueCost());
  }
  @Test
  public void newEvent_returnsBandCost_2000() {
    Integer expectedOutput = 2000;
    assertEquals(expectedOutput, newEvent.tallyBandCost());
  }
  @Test
  public void newEvent_returnsBandCostWithAlcohol_0() {
    Event newEvent2 = new Event(100,"Patio",true,"The Raging Alcoholics","Snacks",60);
    Integer expectedOutput = 0;
    assertEquals(expectedOutput, newEvent2.tallyBandCost());
  }
  @Test
  public void newEvent_returnsFoodCost_500() {
    Integer expectedOutput = 500;
    assertEquals(expectedOutput, newEvent.tallyFoodCost());
  }
  @Test
  public void newEvent_returnsDurationCost_150() {
    Integer expectedOutput = 150;
    assertEquals(expectedOutput, newEvent.tallyDurationCost());
  }
  @Test
  public void newEvent_returnsEventCost_500() {
    Integer expectedOutput = 3850;
    assertEquals(expectedOutput, newEvent.tallyEventCost());
  }



  @Test
  public void newEvent_returnsGuestNumber_100() {
    Integer expectedOutput = 100;
    assertEquals(expectedOutput, newEvent.getGuests());
  }
  @Test
  public void newEvent_returnsVenue_Patio() {
    String expectedOutput = "Patio";
    assertEquals(expectedOutput, newEvent.getVenue());
  }
  @Test
  public void newEvent_returnsAlcohol_True() {
    boolean expectedOutput = true;
    assertEquals(expectedOutput, newEvent.getAlcohol());
  }@Test
  public void newEvent_returnsBand_Ruckers() {
    String expectedOutput = "Never Stoppers";
    assertEquals(expectedOutput, newEvent.getBand());
  }
  @Test
  public void newEvent_returnsFood_Snacks() {
    String expectedOutput = "Snacks";
    assertEquals(expectedOutput, newEvent.getFood());
  }
  @Test
  public void newEvent_returnsDuration_60() {
    Integer expectedOutput = 60;
    assertEquals(expectedOutput, newEvent.getDuration());
  }

}
