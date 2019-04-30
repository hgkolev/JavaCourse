package homework5.credentialsmanager;
public class Credentials{
    private String      username;
    private String      password;
    private int         count;
    private String[]    oldPwd;
    
    public Credentials(String username, String password){
        this.username = username;
        this.password = password;
        this.count = 0;
        this.oldPwd = new String[100];
    }
    
    public String getUsername(){
        return username;
    }
    
    public boolean matchPassword(String password){
        return password.equals(password);
    }
    
    public boolean tryChangePassword(String oldPassword, String newPassword){
        
        if( ! matchPassword(oldPassword) ){
            return false;
        }
        
        if( matchPassword(newPassword) ) {
            return false;
        }
        
        for(int i = 0 ; i < count ; i++){
            if(oldPwd[i].equals(newPassword)){
                return false;            
            }
        }
    
        oldPwd[count++] = password;
        password = newPassword;
        return true;
    }
}