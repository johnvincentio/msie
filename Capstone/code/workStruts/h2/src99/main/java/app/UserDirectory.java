
package app;

import java.io.IOException;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.Properties;
import java.net.URL;

public class UserDirectory  {

    private static final String UserDirectoryFile =
        "resources/users.properties";
    private static final String UserDirectoryHeader =
        "${user}=${password}";
    private static UserDirectory userDirectory = null;
    private static Properties p;
    private UserDirectory() throws UserDirectoryException {
            java.io.InputStream i = null;
            p = null;
            i = this.getClass().getClassLoader().
                getResourceAsStream(UserDirectoryFile);

            if (null==i) {
                throw new UserDirectoryException();
            }
            else {
                try {
                    p = new Properties();
                    p.load(i);
                    i.close();
                }
                catch (java.io.IOException e) {
                    p = null;
                    System.out.println(e.getMessage());
                    throw new UserDirectoryException();
                }
                finally {
                    i = null;
                }
            } // end else
    } // end UserDirectory
    public static UserDirectory getInstance() throws
            UserDirectoryException {

        if (null==userDirectory) {
            userDirectory = new UserDirectory();
        }
        return userDirectory;
    }
    public String fixId(String userId) {
       return userId.toUpperCase();
    }

    public boolean isValidPassword(String userId, String password) {
        if (null==password) return false;
        String _userId = fixId(userId);
        if (!isUserExist(_userId)) return false;
        return (password.equals(getPassword(_userId)));
    }
    public boolean isUserExist(String userId) {
        if (null==userId) return false;
        return !(null==p.getProperty(userId));
    }
    public String getPassword(String userId)  {
          return p.getProperty(userId);
    }
    public Enumeration getUserIds()  {
       return p.propertyNames();
    }
    public void setUser(String userId, String password) throws
            UserDirectoryException {
        if ((null==userId) || (null==password)) {
            throw new UserDirectoryException();
        }
        try {
            p.put(fixId(userId), password);
            String o = this.getClass().getClassLoader().getResource(UserDirectoryFile).getFile();
            p.store(new FileOutputStream(o), UserDirectoryHeader);
        }
        catch (IOException e) {
            throw new UserDirectoryException();
       }
    }
}
