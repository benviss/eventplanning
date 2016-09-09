public class Event {
  private Integer mGuests;
  private String mVenue;
  private boolean mAlcohol;
  private String mBand;
  private String mFood;
  private Integer mDuration;
  private Integer mEventCost;

  public Event(Integer _guests, String _venue, boolean _alcohol, String _band, String _food, Integer _duration) {
    mGuests = _guests;
    mVenue = _venue;
    mAlcohol = _alcohol;
    mBand = _band;
    mFood = _food;
    mDuration = _duration;
  }




  public Integer getGuests() {
    return mGuests;
  }
  public String getVenue() {
    return mVenue;
  }
  public boolean getAlcohol() {
    return mAlcohol;
  }
  public String getBand() {
    return mBand;
  }
  public String getFood() {
    return mFood;
  }
  public Integer getDuration() {
    return mDuration;
  }

}
