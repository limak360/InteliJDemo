package jakispakiecik;
import PakietInterfejsu.interfejs;

public class JakasKlasa implements interfejs {
  public int metodaPierwsza(){
        return 4;
    }
    public void nic(){
        System.out.println(metodaPierwsza());
    }
    public void getInformation(){
        System.out.println("Jestem nie wiem");
    }
    public static void main(String[] args) {
        JakasKlasa nice = new JakasKlasa();

        nice.getInformation();
        nice.nic();
    }
}
