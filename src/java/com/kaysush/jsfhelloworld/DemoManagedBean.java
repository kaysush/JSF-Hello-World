/**
 * A demo managed bean to demonstrate its functionalities.
 */

package com.kaysush.jsfhelloworld;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author SUSHIL
 */
@ManagedBean(name = "bean")
@RequestScoped
public class DemoManagedBean {

    /**
     * Creates a new instance of ManagedBean
     */
    public DemoManagedBean() {
        
    }
    
        private String name;

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

}
