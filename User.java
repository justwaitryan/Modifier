/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gettersetter;

/**
 *
 * @author User
 */
public class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public static void main(String[] args) {
        User viaa = new User();
        
        viaa.setUsername("Alivia");
        viaa.setPassword("vialucuu");
        
        System.out.println("Username : " + viaa.getUsername());
        System.out.println("Password : " + viaa.getPassword());
    }
    
}
