public class Event {
  private Integer mGuests;
  private String mVenue;
  private boolean mAlcohol;
  private String mBand;
  private String mFood;
  private Integer mDuration;
  private Integer mEventCost = 0;

  public Event(Integer _guests, String _venue, boolean _alcohol, String _band, String _food, Integer _duration) {
    mGuests = _guests;
    mVenue = _venue;
    mAlcohol = _alcohol;
    mBand = _band;
    mFood = _food;
    mDuration = _duration;
  }
  public Integer tallyGuestCost() {
    Integer guestCost = 0;
    if (getGuests() >= 250) {
      guestCost = 500;
    } else if (getGuests() >= 150){
      guestCost = 250;
    } else if (getGuests() >= 100){
      guestCost = 200;
    } else if (getGuests() >= 50){
      guestCost = 175;
    } else if (getGuests() >= 25){
      guestCost = 150;
    } else {
      guestCost = 100;
    }
    return guestCost;
  }
  public Integer tallyVenueCost() {
    Integer venueCost = 0;
    switch (getVenue()) {
      case "Patio":
        venueCost = 500;
        break;
      case "Ballroom":
        venueCost = 1000;
        break;
      case "Castle":
        venueCost = 5000;
        break;
    }
    return venueCost;
  }
  public Integer tallyBandCost() {
    Integer bandCost = 0;
    switch (getBand()) {
      case "The Raging Alcoholics":
        if(getAlcohol()) {
          bandCost = 0;
        } else {
          bandCost = 500;
        }
        break;
      case "Never Stoppers":
        bandCost = 2000;
        break;
      case "The Slow Jazz/Metal/Classical Trio of Cool Music":
        bandCost = 10000;
        break;
    }
    return bandCost;
  }
  public Integer tallyFoodCost() {
    Integer foodCost = 0;
    switch (getFood()) {
      case "Snacks":
        foodCost = (getGuests()*5);
        break;
      case "Sandwhices":
        foodCost = (getGuests()*10);
        break;
      case "The Full Spread":
        foodCost = (getGuests()*20);
        break;
    }
    return foodCost;
  }
  public Integer tallyDurationCost() {
    Integer durationCost = 0;
    if (getDuration() >= 420) {
      durationCost = 500;
    } else if (getDuration() >= 360){
      durationCost = 250;
    } else if (getDuration() >= 240){
      durationCost = 200;
    } else if (getDuration() >= 120){
      durationCost = 175;
    } else if (getDuration() >= 60){
      durationCost = 150;
    } else {
      durationCost = 100;
    }
    return durationCost;
  }
  public Integer tallyEventCost() {
    Integer eventCost = 0;
    if(mAlcohol) {
      eventCost += (getGuests() * 5);
    }
    eventCost += (tallyGuestCost() + tallyVenueCost() + tallyBandCost() + tallyFoodCost() + tallyDurationCost());
    return eventCost;
  }
  public Integer getEventCost() {
    return mEventCost;
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
