package bherma3;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class Session
 */
@Stateful(mappedName = "SessionBean")
@LocalBean
public class Session {
	String sessionUUID;
	Boolean Authenticated = false;
    /**
     * Stateful Session Bean
     */
    public Session() {
        
    }
}
