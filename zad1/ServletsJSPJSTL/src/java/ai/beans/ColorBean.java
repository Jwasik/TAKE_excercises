package ai.beans;

import static java.lang.System.out;

public class ColorBean 
{
 private String foregroundColor;
 private String backgroundColor;
 private String hideBorders;

 public ColorBean() 
 {
 }

    /**
     * @return the foregroundColor
     */
    public String getForegroundColor() 
    {
        return foregroundColor;
    }

    /**
     * @param foregroundColor the foregroundColor to set
     */
    public void setForegroundColor(String foregroundColor) 
    {
        this.foregroundColor = foregroundColor;
    }

    /**
     * @return the backgroundColor
     */
    public String getBackgroundColor() 
    {
        return backgroundColor;
    }

    /**
     * @param backgroundColor the backgroundColor to set
     */
    public void setBackgroundColor(String backgroundColor) 
    {
        this.backgroundColor = backgroundColor;
    }

    /**
     * @return the hideBorders
     */
    public String getHideBorders()
    {
        return hideBorders;
    }

    /**
     * @param hideBorders the hideBorders to set
     */
    public void setHideBorders(String hideBorders) 
    {
        out.println(hideBorders);
        if(hideBorders.equals("Ukryj"))
        {
            this.hideBorders = "none";
        }
        else if(hideBorders.equals("Pokaz"))
        {
            this.hideBorders = "solid";
        }
        else
        {
            this.hideBorders = "dashed";
        }
    }

}