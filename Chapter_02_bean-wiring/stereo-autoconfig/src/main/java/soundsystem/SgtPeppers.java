package soundsystem;
import org.springframework.stereotype.Component;

/*
1. 标识组件类；
2. 为类创建bean
 */
@Component
public class SgtPeppers implements CompactDisc {

  private String title = "Sgt. Pepper's Lonely Hearts Club Band";  
  private String artist = "The Beatles";
  
  public void play() {
    System.out.println("Playing " + title + " by " + artist);
  }
  
}
