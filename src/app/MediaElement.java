package app;

public abstract class MediaElement {
  private String title;

  // costruttore
  public MediaElement(String t) {
    setTitle(t);
  }

  // getter & setter
  public void setTitle(String t) {
    if (t == "" || t == " ") {
      this.title = "Non è stato inserito alcun titolo.";
    } else {
      this.title = t;
    }
  }

  public String getTitle() {
    return this.title;
  }
}
