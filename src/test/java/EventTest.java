import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly_True() {
    Event newEvent = new Event(100);
    assertEquals(true, newEvent instanceof Event);
  }
  @Test
  public void newEvent_returnsGuestNumber_True() {
    Event newEvent = new Event(100);
    Integer expectedOutput = 100;
    assertEquals(expectedOutput, newEvent.getGuests());
  }
}
