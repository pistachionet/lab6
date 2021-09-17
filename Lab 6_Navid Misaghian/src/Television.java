public class Television
{

    private String MANUFACTURER;

    private int SCREEN_SIZE;

    private boolean powerOn;

    private int channel;

    private int volume;


    //set the constructor
    public Television(String manufacture, int screenSize)
    {


        MANUFACTURER=manufacture;

        SCREEN_SIZE=screenSize;

        //Set the Default buttons

        powerOn=false;

        //Task 2 set the constructor to volume to 20
        volume=20;
        //Task 2 set the channel to 2
        channel=2;
    }



    public void setChannel(int station)
    {

        this.channel=station;

    }



    // this is hte boolean value that will set the  power status off and on
    public void power()
    {
        powerOn=!powerOn;
    }


    //Allows to increase the volume by 1
    public void increaseVolume()
    {
        volume=volume+1;
    }

    //Allows to decrease the volume by 1
    public void decreaseVolume()
    {
        volume=volume-1;
    }

    //This method allows for the current channel to be displayed
    public int getChannel()
    {
        return channel;
    }

    //This method returns the givin volume
    public int getVolume()
    {
        return volume;
    }

    //returns the manufactuer of the t.v
    public String getManufacturer()
    {
        return MANUFACTURER;
    }

    //returns the screen size of the t.v
    public int getScreenSize()
    {
        return SCREEN_SIZE;
    }

}
//class ends