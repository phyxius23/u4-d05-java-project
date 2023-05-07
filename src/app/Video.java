package app;

import java.util.Arrays;

public class Video extends Audio implements Illuminable {

  // attributi
  private int brightness;

  // costruttore
  public Video(String t, int d, int v, int b) {
    super(t, d, v);
    setBrightness(b);
  }

  // setter & getter
  public void setBrightness(int b) {
    if (b >= 0) {
      this.brightness = b;
    } else {
      this.brightness = 0;
    }
  }

  public int getBrightness() {
    return this.brightness;
  }

  // override dei metodi implementati da Illuminable
  @Override
  public void brightnessDown() {
    this.brightness--;
  }

  @Override
  public void brightnessUp() {
    this.brightness++;
  }

  // override dei metodi ereditati da Audio
  @Override
  public void play() {
    char[] exclamationPoint = new char[getVolume()];
    char[] asterisk = new char[getBrightness()];

    Arrays.fill(exclamationPoint, '!');
    Arrays.fill(asterisk, '*');

    for (int i = 0; i < getDuration(); i++) {
      System.out.println(getTitle() + "" + String.valueOf(exclamationPoint) + String.valueOf(asterisk));
    }

  }

}
