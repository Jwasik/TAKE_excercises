/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package view.backing;

import java.util.Locale;
import java.util.ResourceBundle;
import javax.faces.application.FacesMessage;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.ManagedProperty;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlSelectBooleanCheckbox;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.ws.rs.core.Application;

/**
 *
 * @author student
 */
@Named(value = "loginBean")
@RequestScoped
public class LoginBean 
{
    private String username;
    private String password;
    private HtmlSelectBooleanCheckbox acceptCheckbox;
    private HtmlCommandButton loginButton;
    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() 
    {
        
    }
    
    @ManagedProperty("#{AppMessages['text.scott']}")
    private String someKey;
    
    public String login()
    {
        if(username.equals("scott") && password.equals("tiger"))
        {            
            FacesContext context = FacesContext.getCurrentInstance();
            Locale locale = context.getViewRoot().getLocale();
            //context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,someKey, null));
            
            context.addMessage(null, new FacesMessage(ResourceBundle.getBundle("ApplicationMessages", locale).getString("text.scott")));
            
            context.renderResponse();
            return "";
            //AppMessages
        }
        else if(username.equals(password))return "success";
        else return "failure";
    }

    /**
     * @return the username
     */
    public String getUsername() 
    {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) 
    {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() 
    {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) 
    {
        this.password = password;
    }


    /**
     * @return the loginButton
     */
    public HtmlCommandButton getLoginButton() 
    {
        return loginButton;
    }

    /**
     * @param loginButton the loginButton to set
     */
    public void setLoginButton(HtmlCommandButton loginButton)
    {
        this.loginButton = loginButton;
    }
    public void activateButton(ValueChangeEvent e)
    {
        if (getAcceptCheckbox().isSelected())loginButton.setDisabled(false);
        else loginButton.setDisabled(true);
    }

    /**
     * @return the acceptCheckbox
     */
    public HtmlSelectBooleanCheckbox getAcceptCheckbox() 
    {
        return acceptCheckbox;
    }

    /**
     * @param acceptCheckbox the acceptCheckbox to set
     */
    public void setAcceptCheckbox(HtmlSelectBooleanCheckbox acceptCheckbox) 
    {
        this.acceptCheckbox = acceptCheckbox;
    }
    
}
