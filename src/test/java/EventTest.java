import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class EventTest {
  Event newEvent = new Event(100,"Patio",true,"Ruckers","Lots",60);
  @Test
  public void newEvent_instantiatesCorrectly_True() {
    assertEquals(true, newEvent instanceof Event);
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
    String expectedOutput = "Ruckers";
    assertEquals(expectedOutput, newEvent.getBand());
  }
  @Test
  public void newEvent_returnsFood_Lots() {
    String expectedOutput = "Lots";
    assertEquals(expectedOutput, newEvent.getFood());
  }
  @Test
  public void newEvent_returnsDuration_60() {
    Integer expectedOutput = 60;
    assertEquals(expectedOutput, newEvent.getDuration());
  }

}
