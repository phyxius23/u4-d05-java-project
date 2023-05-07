package app;

import java.util.Arrays;

public class Image extends MediaElement implements Illuminable {

  // attributi
  private int brightness;

  // costruttori
  public Image(String t, int b) {
    super(t);
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

  // metodi
  public void show() {
    char[] exclamationPoint = new char[getBrightness()];

    Arrays.fill(exclamationPoint, '*');

    System.out.println(getTitle() + "" + String.valueOf(exclamationPoint));
  }

  // override dei metodi implementati da Illuminable
  @Override
  public void brightnessDown() {
    this.brightness--;
  }

  @Override
  public void brightnessUp() {
    this.brightness++;
  };
}
