package app;

public abstract class MediaElement {
  private String title;

  // Costruttore
  public MediaElement(String t) {
    setTitle(t);
  }

  // Getters & Setters
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
