
/**
 * Write a description of class Sound here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;

public class Sound
{
    
    /** the array of values in this sound; guarenteed not to be null */
    private int[] samples;

    /**
     * Constructor for objects of class Sound
     */
    public Sound(int[] samples)
    {
        
        this.samples = samples;
        
    }

    /** 
     * Changes those values in this sound that have an amplitude greater than limit.
     * Values greater than limit are changed to limit.
     * Values less than -limit are changed to -limit.
     *
     * @param limit the amplitude limit
     * @return the number of values in this sound that the message has changed
     */
    
    public int limitAmplitude(int limit)
    {
        
        int count = 0;
        
        for (int i = 0; i < samples.length; i++) {
            
            if (samples[i] > limit) {
                samples[i] = limit;
                count++;
            }
            else if (samples[i] < -limit) {
                samples[i] = -limit;
                count++;
            }
            
        }
        
        return count;
        
    }
    
    /** 
     *  Removes all silence from the beginning of this sound.
     *  Silence is represented by a value of 0.
     */
    
    public void trimSilenceFromBeginning() {
        int count = 0;
        
        while (samples[count] == 0) {
            
            count++;
            
        }
        
        int[] result = new int[samples.length-count];
        
        for (int i = count; i < samples.length; i++) {
            
            result[i-count] = samples[i];
            
        }
        
        samples = result;
    }
    
    /** 
     *  Calls trimSilence function and outputs the array.
     *  @return The output of array samples.
     */
    
    public String toString() {
        
        trimSilenceFromBeginning();
        return Arrays.toString(samples);
        
    }
    
}
