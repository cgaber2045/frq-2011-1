
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{

  public static void main(String[] args)
   {
        int[] samplesa = {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
        Sound r1 = new Sound(samplesa);
        
        int[] samplesb = {0, 0, 0, 0, -14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0};
        Sound r2 = new Sound(samplesb);
        
        System.out.println(r1.limitAmplitude(2000));
        System.out.println(r1.toString());
        System.out.println(r2.toString());
   }
}
